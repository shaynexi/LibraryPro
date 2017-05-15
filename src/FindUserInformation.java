import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
/*
 * 获取数据库中用户的信息
 */
public class FindUserInformation {
	GetConnection getConnection = new GetConnection();
	Connection connection = getConnection.getConnection();
	
	public String checkPassword(String studentNum){
		System.out.println("用户输入的学号是："+studentNum);
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
		System.out.println("用户的密码是："+passWord);
		return passWord;
	}
	
	public User findInformation(String studentNum){
		User user = null;
		int num = Integer.valueOf(studentNum);
		System.out.println("用户输入的学号是："+num);
		try{
			String sql = "select*from user_information where student_number = ?";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setInt(1, num);
			ResultSet rest = statement.executeQuery();
			while(rest.next()){
				user = new User();
				user.setStudentnum(rest.getString("student_number"));
				user.setPassWord(rest.getString("password"));
				user.setName(rest.getString("name"));
				user.setBorrowbookstatus(rest.getInt("borrow_status"));
				user.setBorrowBookNum(rest.getString("borrowbook_1"),0);
				user.setBorrowBookNum(rest.getString("borrowbook_2"),1);
				user.setBorrowBookNum(rest.getString("borrowbook_3"),2);
				user.setBorrowBookNum(rest.getString("borrowbook_4"),3);
				user.setBorrowBookNum(rest.getString("borrowbook_5"),4);
				user.setBorrowBookNum(rest.getString("borrowbook_6"),5);
				user.setBorrowBookNum(rest.getString("borrowbook_7"),6);
				user.setBorrowBookNum(rest.getString("borrowbook_8"),7);
				user.setBorrowBookNum(rest.getString("borrowbook_9"),8);
				user.setBorrowBookNum(rest.getString("borrowbook_10"),9);
				user.setBorrowBookNum(rest.getString("borrowbook_11"),10);
				user.setBorrowBookNum(rest.getString("borrowbook_12"),11);
				user.setBorrowBookNum(rest.getString("borrowbook_13"),12);
				user.setBorrowBookNum(rest.getString("borrowbook_14"),13);
				user.setBorrowBookNum(rest.getString("borrowbook_15"),14);
			}
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
		return user;
	}
}
