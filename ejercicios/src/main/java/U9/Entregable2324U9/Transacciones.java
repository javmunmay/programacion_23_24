package U9.Entregable2324U9;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Transacciones {


    public static void insertarClienteYPagos(int customerNumber, String customerName, String contactLastName, String contactFirstName, int phone, String addressLine1, String city, String country, String checkNumber, String paymentDateStr, double amount) {
        try {
            Connection conexion = ConexionBD.getInstance().getConnection();

            // Insertar cliente
            String sqlCliente = "INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, city, country) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statementCliente = conexion.prepareStatement(sqlCliente);
            statementCliente.setInt(1, customerNumber);
            statementCliente.setString(2, customerName);
            statementCliente.setString(3, contactLastName);
            statementCliente.setString(4, contactFirstName);
            statementCliente.setInt(5, phone);
            statementCliente.setString(6, addressLine1);
            statementCliente.setString(7, city);
            statementCliente.setString(8, country);
            statementCliente.executeUpdate();
            System.out.println("Cliente insertado correctamente.");

            // Convertir la fecha de pago a java.sql.Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date parsedDate = dateFormat.parse(paymentDateStr);
            java.sql.Date sqlPaymentDate = new java.sql.Date(parsedDate.getTime());

            // Insertar pago
            String sqlPago = "INSERT INTO payments (customerNumber, checkNumber, paymentDate, amount) VALUES (?, ?, ?, ?)";
            PreparedStatement statementPago = conexion.prepareStatement(sqlPago);
            statementPago.setInt(1, customerNumber);
            statementPago.setString(2, checkNumber);
            statementPago.setDate(3, sqlPaymentDate);
            statementPago.setDouble(4, amount);
            statementPago.executeUpdate();
            System.out.println("Pago insertado correctamente.");
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        }
    }



    public static void insertarOficinaYTraslado(String newOfficeCode, String city, String phone, String addressLine1, String country, String postalCode, String territory) {
        Connection conexion = null;
        try {
            conexion = ConexionBD.getInstance().getConnection();
            conexion.setAutoCommit(false);

            // Insertar nueva oficina
            String insertOfficeSql = "INSERT INTO offices (officeCode, city, phone, addressLine1, country, postalCode, territory) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insertOfficeStatement = conexion.prepareStatement(insertOfficeSql);
            insertOfficeStatement.setString(1, newOfficeCode);
            insertOfficeStatement.setString(2, city);
            insertOfficeStatement.setString(3, phone);
            insertOfficeStatement.setString(4, addressLine1);
            insertOfficeStatement.setString(5, country);
            insertOfficeStatement.setString(6, postalCode);
            insertOfficeStatement.setString(7, territory);
            insertOfficeStatement.executeUpdate();

            // Actualizar empleados
            String updateEmployeesSql = "UPDATE employees SET officeCode = ? WHERE officeCode = '?'";
            PreparedStatement updateEmployeesStatement = conexion.prepareStatement(updateEmployeesSql);
            updateEmployeesStatement.setString(1, newOfficeCode);
            updateEmployeesStatement.executeUpdate();

            conexion.commit();
            System.out.println("Oficina y empleados trasladados correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (conexion != null) {
                    conexion.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (conexion != null) {
                    conexion.setAutoCommit(true);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}
