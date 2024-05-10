package U9.T2MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3336/classicmodels?user=root&password=XXXXX");
            mostrarMenu(); // Aquí se llama a algún método para mostrar el menú
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void mostrarMenu() {

        ADClassicModels adClassicModels = new ADClassicModels();

        // Obtener empleados
        List<Employee> empleados = adClassicModels.getEmpleados();
        for (Employee empleado : empleados) {
            System.out.println("Número de empleado: " + empleado.getEmployeeNumber());
            System.out.println("Apellido: " + empleado.getLastName());
            System.out.println("Nombre: " + empleado.getFirstName());
            System.out.println("---------------------");
        }

        // Obtener oficinas
        List<Office> offices = adClassicModels.getOffices();
        for (Office office : offices) {
            System.out.println("Código de Oficina: " + office.getOfficeCode());
            System.out.println("Ciudad: " + office.getCity());
            System.out.println("---------------------");
        }


    }
}



