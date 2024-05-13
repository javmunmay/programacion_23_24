package U9.Entregable2324U9;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Consultas {

    public static void empleadosOficinaMayor() {
        try {
            Connection conexion = ConexionBD.getInstance().getConnection();
            String sql = "SELECT * FROM employees " +
                    "WHERE officeCode IN (SELECT officeCode FROM employees GROUP BY officeCode " +
                    "HAVING COUNT(*) = (SELECT MAX(cnt) FROM (SELECT COUNT(*) AS cnt FROM employees GROUP BY officeCode) AS max_cnt))";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println("NúmeroEmpleado: " + rs.getInt("employeeNumber") +
                        ", Apellido: " + rs.getString("lastName") +
                        ", Nombre: " + rs.getString("firstName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void productosNoVendidos() {
        try {
            Connection conexion = ConexionBD.getInstance().getConnection();
            String sql = "SELECT * FROM products WHERE productCode NOT IN " +
                    "(SELECT DISTINCT productCode FROM orderdetails)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println("ProductCode: " + rs.getString("productCode") +
                        ", ProductName: " + rs.getString("productName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void informeCategoria(String categoria) {
        try {
            Connection conexion = ConexionBD.getInstance().getConnection();
            String sql = "SELECT p.productName, SUM(od.quantityOrdered) AS TotalUnits " +
                    "FROM products p INNER JOIN orderdetails od " +
                    "ON p.productCode = od.productCode " +
                    "INNER JOIN orders o ON od.orderNumber = o.orderNumber " +
                    "WHERE p.productLine = ? " +
                    "GROUP BY p.productName";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, categoria);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println("Product: " + rs.getString("productName") +
                        ", Units Sold: " + rs.getInt("TotalUnits"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
