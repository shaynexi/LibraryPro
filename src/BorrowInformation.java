import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
/*
 * 获取数据库中图书的信息
 */
public class BorrowInformation {
	 
	GetConnection getconnection = new GetConnection();
	Connection connection = getconnection.getConnection();
	
	public Book getBookInformation(String bookNum){
		Book findBook = null;
		String sql = "select*from book_information where book_number = ?";
		try {
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setString(1, bookNum);
			ResultSet rest = statement.executeQuery();
			while(rest.next()){
				findBook = new Book();
				findBook.setbookClass(rest.getString("book_class"));
				findBook.setbookLocation(rest.getString("book_location"));
				findBook.setbookNumber(rest.getString("book_number"));
				findBook.setborrowStatus(rest.getInt("book_status"));
				findBook.setbriefInformation(rest.getString("book_briefinformation"));
				findBook.setcoverPicture(rest.getString("book_coverpicture"));
				findBook.setprice(rest.getInt("book_price"));
				findBook.setpublishCompany(rest.getString("book_publishcompany"));
				findBook.setreserve(rest.getInt("book_reserve"));
				findBook.setbookName(rest.getString("book_name"));
				findBook.setAuthor(rest.getString("book_author"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return findBook;
	}
}
