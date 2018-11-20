import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) throws SQLException {
		Insert("Reza", "Razavi");


	}

	public static void Insert(String name, String family) throws SQLException {
		PreparedStatement ps= DBconnector.getConnection().prepareStatement("Insert into member (name, family) values (?, ?)");
		ps.setString(1, name);
		ps.setString(2, family);
		ps.execute();
		System.out.println("Inserted!");
	}
}
