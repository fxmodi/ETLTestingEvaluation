package testDBKeyword;
import java.sql.Connection
import java.sql.DriverManager
import com.kms.katalon.core.annotation.Keyword


public class DatabaseConnectionTest {

	@Keyword
	def boolean connectToMySQL(String url, String username, String password) {
		Connection connection = null

		try {
			// Load MySQL JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver")

			// Establish connection
			connection = DriverManager.getConnection(url, username, password)

			if (connection != null) {
				println("Database connection successful!")
				return true  // Connection is successful
			} else {
				println("Failed to connect to the database.")
				return false  // Connection failed
			}
		} catch (Exception e) {
			println("Error: " + e.message)
			return false
		} finally {
			if (connection != null) {
				connection.close()
			}
		}
	}
}
