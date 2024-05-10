package U9.T2MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static ConexionBD instance = null;
    private Connection connection;

    private ConexionBD() {
        // Código para conectar a la base de datos
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3336/classicmodels?user=root&password=XXXXX");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ConexionBD getInstance() {
        if (instance == null) {
            instance = new ConexionBD();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

//    public void closeConnection() {
//        try {
//            if (connection != null && !connection.isClosed()) {
//                connection.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}

