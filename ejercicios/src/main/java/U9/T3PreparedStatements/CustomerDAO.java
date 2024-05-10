package U9.T3PreparedStatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAO {
    private Connection connection;

    public CustomerDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean insertCustomer(Customer customer) {
        boolean success = false;
        String sql = "INSERT INTO customers (customerName, email) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getEmail());

            int rowsInserted = statement.executeUpdate();
            success = rowsInserted > 0;
        } catch (SQLException e) {
            System.out.println("Error al insertar cliente: " + e.getMessage());
        }

        return success;
    }
    }

