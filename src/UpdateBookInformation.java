import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
 * �޸����ݿ���ͼ�����Ϣ
 */
public class UpdateBookInformation {
	GetConnection getConnection = new GetConnection();
	Connection connection = getConnection.getConnection();
	
	/* 
	 * ͼ���Ų����޸�  
	 * ����ͼ���Ÿ���ͼ����Ϣ
	 */
	
	//���Ľ���״̬
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
	
	//����Ԥ��״̬
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
	
	//����ͼ��۸�
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
	
	//��������
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
	
	//���ĳ�����
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
	
	//���ļ��
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
	
	//���ķ���
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
	
	//����ͼ�����
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
	
	//����ͼ��λ��
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
	
	//����ͼ������
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
	
	//����ͼ�����ʱ��
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
	
	//����ͼ�黹��ʱ��
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
