import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class FindUserInformation {
	GetConnection getConnection = new GetConnection();
	Connection connection = getConnection.getConnection();
	
	public String checkPassword(String studentNum){
		System.out.println("�û������ѧ���ǣ�"+studentNum);
		String passWord = null;	
		try{		
			String sql = "select*from user_information where student_number = ?";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setString(1, studentNum);
			ResultSet rest = statement.executeQuery();
			while(rest.next()){
				passWord = rest.getString("password");
			}
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}	
		System.out.println("�û��������ǣ�"+passWord);
		return passWord;
	}
	
	public User findInformation(String studentNum){
		User user = null;
		int num = Integer.valueOf(studentNum);
		System.out.println("�û������ѧ���ǣ�"+num);
		try{
			String sql = "select*from user_information where user_number = ?";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setInt(1, num);
			statement.execute();
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
		return user;
	}
}
