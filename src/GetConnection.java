import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
	public Connection connection = null;
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/library_database";
			String user = "root";
			String passWord = "950118";
			connection = DriverManager.getConnection(url,user,passWord);
			if(connection != null){
				System.out.println("数据库连接成功");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		 return connection;
	}
}
