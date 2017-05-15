import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 修改数据库中的用户信息
 */
public class UpdateUserInformation {
	GetConnection getconnection = new GetConnection();
	Connection connection = getconnection.getConnection();
	
	//修改用户姓名
	public void UpdateUserName(String name,String studentNumber){
		try{
			String sql = "update user_information set name = ? where student_number = ?";
			PreparedStatement  preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setString(1, name);
			preparedstatement.setString(2, studentNumber);
			preparedstatement.execute();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//修改密码
	public void UpdatePassword(String password,String studentNumber){
		try{
			String sql = "update user_information set password = ? where student_number = ?";
			PreparedStatement  preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setString(1, password);
			preparedstatement.setString(2, studentNumber);
			preparedstatement.execute();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void UpdateBorrowBookNum(int location,String borrowBooknum,String studentNumber){
		
		try{
			String sql = null;
			switch(location){
			case 1:
				sql = "update user_information set borrowbook_1 = ? where student_number = ?";
			    break;
			case 2:
				sql = "update user_information set borrowbook_2 = ? where student_number = ?";
				break;
			case 3:
				sql = "update user_information set borrowbook_3 = ? where student_number = ?";
				break;
			case 4:
				sql = "update user_information set borrowbook_4 = ? where student_number = ?";
			    break;
			case 5:
				sql = "update user_information set borrowbook_5 = ? where student_number = ?";
				break;
			case 6:
				sql = "update user_information set borrowbook_6 = ? where student_number = ?";
				break;
			case 7:
				sql = "update user_information set borrowbook_7 = ? where student_number = ?";
			    break;
			case 8:
				sql = "update user_information set borrowbook_8 = ? where student_number = ?";
				break;
			case 9:
				sql = "update user_information set borrowbook_9 = ? where student_number = ?";
				break;
			case 10:
				sql = "update user_information set borrowbook_10 = ? where student_number = ?";
			    break;
			case 11:
				sql = "update user_information set borrowbook_11 = ? where student_number = ?";
				break;
			case 12:
				sql = "update user_information set borrowbook_12 = ? where student_number = ?";
				break;
			case 13:
				sql = "update user_information set borrowbook_13 = ? where student_number = ?";
				break;
			case 14:
				sql = "update user_information set borrowbook_14 = ? where student_number = ?";
				break;
			case 15:
				sql = "update user_information set borrowbook_15 = ? where student_number = ?";
				break;
			}
			PreparedStatement  preparedstatement = connection.prepareStatement(sql);
//			preparedstatement.setString(1,borrowLocation);
			preparedstatement.setString(1, borrowBooknum);
			preparedstatement.setString(2, studentNumber);
			preparedstatement.execute();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
