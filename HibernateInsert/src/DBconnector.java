import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnector {
	
	private static final String db_driver="org.postgresql.Driver";
	private static final String db_url="jdbc:postgresql://localhost:5433/TestHB";
	private static final String db_user="postgres";
	private static final String db_password="1364215";
	
	private static Connection connection;
	
	public static Connection getConnection() {
		if(connection !=null) {
			return connection;
		}
		else {
			try {
				Class.forName(db_driver);
				connection=DriverManager.getConnection(db_url, db_user, db_password);
				System.out.println("Connection Created!");

			}
			catch(Exception e){
				e.printStackTrace();
				System.out.println("Error!");
			}
		}
		return connection;
			
		
	}

}
