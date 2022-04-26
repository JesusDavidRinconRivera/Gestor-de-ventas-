import java.sql.*;

public class conect {
    Connection con;

    public conect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tabla", "root", "");
            System.out.println("conectó esa madre");
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
    }
}
