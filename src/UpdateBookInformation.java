import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
 * 修改数据库中图书的信息
 */
public class UpdateBookInformation {
	GetConnection getConnection = new GetConnection();
	Connection connection = getConnection.getConnection();
	
	/* 
	 * 图书编号不可修改  
	 * 按照图书编号更改图书信息
	 */
	
	//更改借书状态
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
	
	//更改预定状态
	public void UpdateBookReserveStatus(int reserve, String num){
		
		try {
			String sql = "update book_information set book_reserve = ? where book_number = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1,reserve);
			statement.setString(2, num);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//更改图书价格
	public void UpdateBookPrice(int price, String num){
		
		try {
			String sql = "update book_information set book_price = ? where book_number = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1,price);
			statement.setString(2, num);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//更改书名
	public void UpdateBookName(String name, String num){
		
		try {
			String sql = "update book_information set book_name = ? where book_number = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,name);
			statement.setString(2, num);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//更改出版社
	public void UpdateBookPublishCompany(String company, String num){
		
		try {
			String sql = "update book_information set book_publishcompany = ? where book_number = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,company);
			statement.setString(2, num);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//更改简介
	public void UpdateBookBriefInformation(String information, String num){
		
		try {
			String sql = "update book_information set book_briefinformation = ? where book_number = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,information);
			statement.setString(2, num);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//更改封面
	public void UpdateBookCoverPicture(String coverpicture, String num){
		
		try {
			String sql = "update book_information set book_briefinformation = ? where book_number = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,coverpicture);
			statement.setString(2, num);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//更改图书类别
	public void UpdateBookClass(String bookclass, String num){
		
		try {
			String sql = "update book_information set book_briefinformation = ? where book_number = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,bookclass);
			statement.setString(2, num);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//更改图书位置
	public void UpdateBookLocation(String booklocation, String num){
		
		try {
			String sql = "update book_information set book_briefinformation = ? where book_number = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,booklocation);
			statement.setString(2, num);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//更改图书作者
	public void UpdateBookAuthor(String bookauthor, String num){
		
		try {
			String sql = "update book_information set book_briefinformation = ? where book_number = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,bookauthor);
			statement.setString(2, num);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//更改图书借书时间
	public void UpdateBookBorrowTime(String borrowtime, String num){
			
		try {
			String sql = "update book_information set book_borrowtime = ? where book_number = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,borrowtime);
			statement.setString(2, num);
			statement.execute();
		} catch (SQLException e) {				
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//更改图书还书时间
	public void UpdateBookReturnTime(String returntime, String num){
			
		try {
			String sql = "update book_information set book_returntime = ? where book_number = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,returntime);
			statement.setString(2, num);
			statement.execute();
		} catch (SQLException e) {				
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
