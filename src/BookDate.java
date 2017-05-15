import java.util.Calendar;
import java.util.Date;

public class BookDate {
	private String borrowDate;
	private String returnDate;
		
	public String getBorrowDate(){
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		borrowDate = "" + year + "-" + month + "-" + date;
		return borrowDate;
	}
	
	public String getreturnDate(){
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		now.set(year, month, date);
		now.add(Calendar.DATE, 40);
		returnDate = "" + now.get(Calendar.YEAR) + "-" + now.get(Calendar.MONTH) + "-" + now.get(Calendar.DATE);
		return returnDate;
	}
}
