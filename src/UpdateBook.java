import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBook {
	GetConnection getConnection = new GetConnection();
	Connection connection = getConnection.getConnection();
	
	public void UpdateBookBorrowStatus(int status, String num){
		
		try {
			String sql = "update book_information set book_status = ? where book_number = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1,status);
			statement.setString(2, num);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
