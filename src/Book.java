	
public class Book {
	private int reserve;				      //Ԥ��״̬��1ΪԤ����0Ϊ����״̬
	private int price;                        //�鼮�۸�
	private int borrowStatus;			      //�鼮״̬��0Ϊ�ɽ�״̬��1Ϊ���״̬��2Ϊ��������״̬
	private String bookNumber;                //�鼮Ψһ���
	private String bookName;                  //����
	private String publishCompany;            //������
	private String briefInformation;          //���
	private String coverPicture;              //�鼮����ͼƬ
	private String bookClass;                 //�鼮���
	private String bookLocation;              //����λ��
	private String author;                    //����
	
	public int getreserve(){
		return this.reserve;
	}
	public int getprice(){
		return this.price;
	}
	public int getborrowStatus(){
		return this.borrowStatus;
	}
	public String getbookNumber(){
		return this.bookNumber;
	}
	public String getbookName(){
		return this.bookClass;
	}
	public String getpublishCompany(){
		return this.publishCompany;
	}
	public String getbriefInformation(){
		return this.briefInformation;
	}
	public String getcoverPicture(){
		return this.coverPicture;
	}
	public String getbookClass(){
		return this.bookClass;
	}
	public String getbookLocation(){
		return this.bookLocation;
	}
	public String getAuthor(){
		return this.author;
	}
	
	public void setreserve(int reserve){
		this.reserve = reserve;
	}
	public void setprice(int price){
		this.price = price;
	}
	public void setborrowStatus(int status){
		this.borrowStatus = status;
	}
	public void setbookNumber(String booknumber){
		this.bookNumber = booknumber;
	}
	public void setbookName(String bookname){
		this.bookName = bookname;
	}
	public void setpublishCompany(String publishcompany){
		this.publishCompany = publishcompany;
	}
	public void setbriefInformation(String briefinformation){
		this.briefInformation = briefinformation;
	}
	public void setcoverPicture(String coverpicture){
		this.coverPicture = coverpicture;
	}
	public void setbookClass(String bookclass){
		this.bookClass = bookclass;
	}
	public void setbookLocation(String booklocation){
		this.bookLocation = booklocation;
	}
	public void setAuthor(String author){
		this.author = author;
	}
}
