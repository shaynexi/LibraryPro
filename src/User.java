
public class User {
	
	private String studentNum;
	private String passWord;
	private String name;
	private String borrowBookNum[] = new String[15]; //���ͬʱ��15����
	private int borrowStatus;  //Ϊ0������δ��15����Ϊ1��������15���������ٽ���
	
	
	/*
	 * ��ȡ�û���Ϣ
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
	 * �������ݿ���û�������Ϣ����������û���Ϣ
	 */
	
	//��������
	public void setName(String name){
		this.name = name;
	}
	//����ѧ��
	public void setStudentnum(String studentnum){
		this.studentNum = studentnum;
	}
	//��������
	public void setPassWord(String password){
		this.passWord = password;
	}
	//  �����û��ѽ�����
	//  status = 0�������鼮����ӽ����鼮���
	//  status = 1���黹�鼮��ɾ�������鼮���
	public void setBorrowBookNum(String borrowBooknum ,int i){
		this.borrowBookNum[i] = borrowBooknum;
//			for(int i = 0; i < 15; i++){
//				if(borrowBookNum[i].equals("0")){
//					borrowBookNum[i] = borrowBooknum;
//					break;
//				}else{
//					System.out.println("ͬʱ�����鼮���ܳ���15��������ʧ��");	
//				}
//		}
	}
	//���ý���״̬
	public void setBorrowbookstatus(int borrowstatus){
		this.borrowStatus = borrowstatus;
	}
}
