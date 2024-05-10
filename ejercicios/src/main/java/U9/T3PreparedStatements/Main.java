package U9.T3PreparedStatements;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static Connection connection = null;

    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3336/classicmodels?user=root&password=XXXXX");

            boolean exit = false;
            while (!exit) {
                System.out.println("MENU");
                System.out.println("1. Insertar cliente");
                System.out.println("2. Asignar empleado a cliente");
                System.out.println("3. Añadir producto a pedido");
                System.out.println("4. Mostrar detalle de un pedido");
                System.out.println("5. Salir");
                System.out.print("Ingrese una opción: ");

                int option = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea después del entero

                switch (option) {
                    case 1:
                        insertCustomer();
                        break;
                    case 2:
                        assignEmployeeToCustomer();
                        break;
                    case 3:
                        addProductToOrder();
                        break;
                    case 4:
                        showOrderDetails();
                        break;
                    case 5:
                        exit = true;
                        System.out.println("Saliendo de la aplicación...");
                        break;
                    default:
                        System.out.println("Opción inválida, intente de nuevo.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    private static void insertCustomer() {
        try {
            System.out.println("Ingrese el nombre del cliente:");
            String name = scanner.nextLine();
            System.out.println("Ingrese el apellido del cliente:");
            String lastName = scanner.nextLine();
            System.out.println("Ingrese el número de teléfono del cliente:");
            String phone = scanner.nextLine();
            System.out.println("Ingrese la dirección del cliente:");
            String address = scanner.nextLine();
            System.out.println("Ingrese la ciudad del cliente:");
            String city = scanner.nextLine();
            System.out.println("Ingrese el estado del cliente:");
            String state = scanner.nextLine();
            System.out.println("Ingrese el código postal del cliente:");
            String postalCode = scanner.nextLine();
            System.out.println("Ingrese el país del cliente:");
            String country = scanner.nextLine();

            String sql = "INSERT INTO customers (customerName, contactLastName, phone, addressLine1, city, state, postalCode, country) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, lastName);
            statement.setString(3, phone);
            statement.setString(4, address);
            statement.setString(5, city);
            statement.setString(6, state);
            statement.setString(7, postalCode);
            statement.setString(8, country);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Cliente insertado correctamente.");
            } else {
                System.out.println("No se pudo insertar el cliente.");
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar cliente: " + e.getMessage());
        }
    }


    private static void assignEmployeeToCustomer() {
        // Implementar lógica para asignar empleado a cliente
    }

    private static void addProductToOrder() {
        // Implementar lógica para añadir producto a pedido
    }

    private static void showOrderDetails() {
        // Implementar lógica para mostrar detalle de un pedido
    }
}