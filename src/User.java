
public class User {
	
	private String studentNum;
	private String passWord;
	private String name;
	private String borrowBookNum[] = new String[15]; //最多同时借15本书
	private int borrowStatus;  //为0，借书未满15本；为1借书已满15本，不可再借阅
	
	
	/*
	 * 获取用户信息
	 */
	
	public String getStudentnum(){
		return studentNum;
	}
	
	public String getpassWord(){
		return passWord;
	}
	
	public String getName(){
		return name;
	}
	
	public String[] getBorrowBookNum(){
		return borrowBookNum;
	}
	
	public int getBorrowStatus(){
		return borrowStatus;
	}
	
	/*
	 * 根据数据库的用户数据信息设置类对象用户信息
	 */
	
	//设置姓名
	public void setName(String name){
		this.name = name;
	}
	//设置学号
	public void setStudentnum(String studentnum){
		this.studentNum = studentnum;
	}
	//设置密码
	public void setPassWord(String password){
		this.passWord = password;
	}
	//  设置用户已借书编号
	//  status = 0，借阅书籍，添加借阅书籍编号
	//  status = 1，归还书籍，删除借阅书籍编号
	public void setBorrowBookNum(String borrowBooknum ,int i){
		this.borrowBookNum[i] = borrowBooknum;
//			for(int i = 0; i < 15; i++){
//				if(borrowBookNum[i].equals("0")){
//					borrowBookNum[i] = borrowBooknum;
//					break;
//				}else{
//					System.out.println("同时借阅书籍不能超过15本，借阅失败");	
//				}
//		}
	}
	//设置借书状态
	public void setBorrowbookstatus(int borrowstatus){
		this.borrowStatus = borrowstatus;
	}
}
