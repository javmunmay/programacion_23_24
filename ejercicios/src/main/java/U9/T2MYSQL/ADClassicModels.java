package U9.T2MYSQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {
    private Connection connection;

    public ADClassicModels() {
        this.connection = ConexionBD.getInstance().getConnection();
    }

    public List<Employee> getEmpleados() {
        List<Employee> empleados = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees");
            while (rs.next()) {
                int employeeNumber = rs.getInt("employeeNumber");
                String lastName = rs.getString("lastName");
                String firstName = rs.getString("firstName");
                empleados.add(new Employee(employeeNumber, lastName, firstName));
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }

    public List<Office> getOffices() {
        List<Office> offices = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM offices");
            while (rs.next()) {
                String officeCode = rs.getString("officeCode");
                String city = rs.getString("city");
                offices.add(new Office(officeCode, city));
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return offices;
    }
}
