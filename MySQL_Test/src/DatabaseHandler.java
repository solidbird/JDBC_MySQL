import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandler {

	public static void main(String[] args) throws SQLException {
		// db parameters
		String url       = "jdbc:mysql://localhost:3306/atg_winterlauf_2019?serverTimezone=Europe/Berlin";
		String user      = "root";
		String password  = "";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		Statement stm = conn.createStatement();
	 	ResultSet rs = stm.executeQuery("SELECT * FROM tbl_standort");
	 	while (rs.next()) {
			System.out.println(rs.getString("Ort"));
		}

	}

}
