	
public class Book {
	private int reserve;				      //预定状态，1为预定，0为正常状态
	private int price;                        //书籍价格
	private int borrowStatus;			      //书籍状态，0为可借状态；1为借出状态；2为超过日期状态
	private String bookNumber;                //书籍唯一编号
	private String bookName;                  //书名
	private String publishCompany;            //出版社
	private String briefInformation;          //简介
	private String coverPicture;              //书籍封面图片
	private String bookClass;                 //书籍类别
	private String bookLocation;              //藏书位置
	private String author;                    //作者
	
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
