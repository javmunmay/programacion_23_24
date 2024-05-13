package U9.Entregable2324U9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {

    private static ConexionBD instancia = null;
    private Connection conexion;

    private ConexionBD() {
        try {
            // Establecer la conexión a la base de datos
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3336/classicmodels?user=root&password=XXXXX");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ConexionBD getInstance() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public Connection getConnection() {
        return conexion;
    }

}
