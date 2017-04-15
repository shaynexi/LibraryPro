import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HomePage extends JFrame{
	
	
	public Connection conn;
	public Container container = getContentPane();
	public static int choose = 0;
	
	private JPanel borrow_bottomButtonPanel;
	private JPanel borrow_wholePanel;
	private JPanel borrow_inputPanel;
	private JPanel borrow_coverPicturePanel;
	private JPanel borrow_bookInformationPanel;
	private JPanel login_Panel;
	private JPanel home_Panel;
	private JButton borrow;
	private JButton returnBook;
	private Book findBook;
	
	public HomePage(){
		
		super();
		setBounds(450,150,1000,800);
		container.setLayout(null);
		container.setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*********************************************** ��ҳ ***********************************************/

		home_Panel = new JPanel();
		home_Panel.setLayout(null);
		home_Panel.setBackground(Color.cyan);
		home_Panel.setBounds(0, 0, 1000, 800);
		
		JButton library_button = new JButton("ͼ�����");
		library_button.setBounds(250,200,500,50);
		library_button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("���ͼ�����");
				choose = 1;
			}
			
		});
		home_Panel.add(library_button);
		JButton borrowBook_button = new JButton("ͼ�����");
		borrowBook_button.setBounds(250,270,500,50);
		borrowBook_button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("���ͼ�����");
//				Login login = new Login();
//				login.LoginJframe();
				choose = 2;
				home_Panel.setVisible(false);
				login_Panel.setVisible(true);
			}
			
		});
		home_Panel.add(borrowBook_button);
		JButton returnBook_button = new JButton("ͼ��黹");
		returnBook_button.setBounds(250,340,500,50);
		returnBook_button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				choose = 3;
				System.out.println("���ͼ��黹");
				home_Panel.setVisible(false);
				login_Panel.setVisible(true);
			}
			
		});
		home_Panel.add(returnBook_button);
		JButton checkBorrow_button = new JButton("�鿴����");
		checkBorrow_button.setBounds(250,410,500,50);
		checkBorrow_button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				choose = 4;
				System.out.println("����鿴����");
			}
			
		});
		home_Panel.add(checkBorrow_button);
		JButton reserveBook_button = new JButton("ͼ��Ԥ��");
		reserveBook_button.setBounds(250,480,500,50);
		reserveBook_button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				choose = 5;
				System.out.println("���ͼ��Ԥ��");
			}
			
		});
		home_Panel.add(reserveBook_button);
		JButton managerEntrance_button = new JButton("����Ա���");
		managerEntrance_button.setBounds(250,550,500,50);
		managerEntrance_button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				choose = 6;
				System.out.println("�������Ա���");
			}
			
		});
		home_Panel.add(managerEntrance_button);
		container.add(home_Panel);
		
		setResizable(false);   //�̶����ڴ�С
		setVisible(true);
		
		/*********************************************** ��ҳ����  ***********************************************/
		
		/*********************************************** ��¼����  ***********************************************/
		
		
		login_Panel = new JPanel(null);
		login_Panel.setBounds(300,250,400,300);
		login_Panel.setBackground(Color.cyan);
		JLabel title = new JLabel("ͼ���ϵͳ��¼");
		Font font = new Font("����",Font.BOLD,30);
		title.setFont(font);
		title.setBounds(80,30,400,50);
		login_Panel.add(title);
		JLabel username = new JLabel("ѧ�ţ�");
		username.setBounds(90,105,50,30);
		login_Panel.add(username);
		JTextField username_textField = new JTextField(10);
		username_textField.setBounds(130,105,150,30);
		login_Panel.add(username_textField);
		JLabel password = new JLabel("���룺");
		password.setBounds(90,160,50,30);
		login_Panel.add(password);
		JPasswordField password_textField = new JPasswordField();
		password_textField.setColumns(10);
		password_textField.setBounds(130,160,150,30);
		login_Panel.add(password_textField);
		JButton login = new JButton("��¼");
		login.setBounds(100,210,90,30);
		login_Panel.add(login);
		login.addActionListener(new ActionListener(){
			public void actionPerformed(final ActionEvent e){
				System.out.println("�����¼");
				if(username_textField.getText() == null || username_textField.getText().length() <= 0){
					System.out.println("�������û���");
				}else if(password_textField.getText() == null || password_textField.getText().length() <= 0){
					System.out.println("����������");
				}
				else{
					FindUserInformation finduserinformation = new FindUserInformation();
					String passWord = finduserinformation.checkPassword(username_textField.getText());
					if(passWord == null || passWord.length() <= 0){
						System.out.println("���û���������");
					}else if(passWord.equals(password_textField.getText())){
						System.out.println("��¼�ɹ�");
						username_textField.setText("");
						password_textField.setText("");
						switch(choose){
						case 1:
							System.out.println("ͼ�����");
							break;
						case 2:
							System.out.println("ͼ�����");
							borrow.setVisible(true);
							returnBook.setVisible(false);
							break;
						case 3:
							System.out.println("ͼ��黹");
							borrow.setVisible(false);
							returnBook.setVisible(true);
							break;
						case 4:
							System.out.println("�鿴����");
							break;
						case 5:
							System.out.println("ͼ��Ԥ��");
							break;
						case 6:
							System.out.println("����Ա���");
							break;
						
						}
						login_Panel.setVisible(false);
						borrow_wholePanel.setVisible(true);		
					}else{
						System.out.println("���벻��ȷ");
					}
				}
			}
		});
		JButton log_back = new JButton("����");
		log_back.setBounds(200,210,90,30);
		log_back.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				username_textField.setText("");
				password_textField.setText("");
				home_Panel.setVisible(true);
				login_Panel.setVisible(false);
			}
			
		});
		login_Panel.add(log_back);
		container.add(login_Panel);
		login_Panel.setVisible(false);
		
		/*********************************************** ����/���� ����  ***********************************************/
		borrow_wholePanel = new JPanel();
		borrow_wholePanel.setLayout(null);
		borrow_wholePanel.setBounds(0, 0, 1000, 800);
		borrow_wholePanel.setBackground(Color.cyan);
	
		borrow_inputPanel = new JPanel();
		JLabel label = new JLabel("������ͼ���ţ�");
		Font borrow_topPanel_font = new Font("����",Font.BOLD,20);
		label.setFont(borrow_topPanel_font);
		label.setBounds(0,20,50,50);
		borrow_inputPanel.add(label);
		JTextField bookNumber_textfield = new JTextField(18);
		bookNumber_textfield.setBounds(0,20,80,50);
		borrow_inputPanel.add(bookNumber_textfield);
		JButton confirm = new JButton("ȷ��");
		
		
		confirm.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					BorrowInformation borrowInformation = new BorrowInformation();
					if(bookNumber_textfield.getText() == null || bookNumber_textfield.getText().length() <= 0){
						System.out.println("������ͼ����");
					}else{
						findBook = borrowInformation.getBookInformation(bookNumber_textfield.getText());
						if(findBook == null){
							System.out.println("û�и�ͼ��");
						}else{
							borrow_bottomButtonPanel.setVisible(true);
							borrow_coverPicturePanel.setVisible(true);
							borrow_bookInformationPanel.setVisible(true);
							String status = null;
							if(findBook.getreserve() == 1){
								System.out.println("�����ѱ�Ԥ��");
								status = "�ѱ�Ԥ��";
							}else if(findBook.getreserve() == 0 && findBook.getborrowStatus() == 0){
								System.out.println("����ɽ��");
								status = "�ɽ�";
							}else if(findBook.getborrowStatus() == 1){
								status = "�ѽ��";
								System.out.println("�鱾�ѽ��");
							}else if(findBook.getborrowStatus() == 2){
								status = "��������";
								System.out.println("�鱾��������");
								
							}
							
							JTextArea borrow_BookName = new JTextArea(""+findBook.getbookName());
							Font font_borrow_BookName = new Font("����",Font.BOLD,20);
							borrow_BookName.setFont(font_borrow_BookName);
							borrow_BookName.setLineWrap(true);
							borrow_BookName.setBackground(Color.cyan);
							borrow_BookName.setEditable(false);
							borrow_BookName.setBounds(100,50,250,30);
							borrow_bookInformationPanel.add(borrow_BookName);
							
							JTextArea borrow_publishCompany = new JTextArea(""+findBook.getpublishCompany());
							Font font_borrow_publishCompany = new Font("����",Font.BOLD,20);
							borrow_publishCompany.setFont(font_borrow_publishCompany);
							borrow_publishCompany.setLineWrap(true);
							borrow_publishCompany.setBackground(Color.cyan);
							borrow_publishCompany.setEditable(false);
							borrow_publishCompany.setBounds(100,80,250,30);
							borrow_bookInformationPanel.add(borrow_publishCompany);
							
							JTextArea borrow_author = new JTextArea(""+findBook.getAuthor());
							Font font_borrow_author = new Font("����",Font.BOLD,20);
							borrow_author.setFont(font_borrow_author);
							borrow_author.setLineWrap(true);
							borrow_author.setBackground(Color.cyan);
							borrow_author.setEditable(false);
							borrow_author.setBounds(100,110,250,30);
							borrow_bookInformationPanel.add(borrow_author);
							
							JTextArea borrow_briefInformation = new JTextArea(""+findBook.getbriefInformation());
							Font font_borrow_briefInformation = new Font("����",Font.BOLD,20);
							borrow_briefInformation.setFont(font_borrow_briefInformation);
							borrow_briefInformation.setLineWrap(true);
							borrow_briefInformation.setBackground(Color.cyan);
							borrow_briefInformation.setEditable(false);
							borrow_briefInformation.setBounds(100,140,250,200);
							borrow_bookInformationPanel.add(borrow_briefInformation);
							
							JTextArea borrow_status = new JTextArea(""+status);
							Font font_borrow_status = new Font("����",Font.BOLD,20);
							borrow_status.setFont(font_borrow_status);
							borrow_status.setLineWrap(true);
							borrow_status.setBackground(Color.cyan);
							borrow_status.setEditable(false);
							borrow_status.setBounds(100,360,250,30);
							borrow_bookInformationPanel.add(borrow_status);
							
							JTextArea borrow_number = new JTextArea(""+findBook.getbookNumber());
							Font font_borrow_number = new Font("����",Font.BOLD,20);
							borrow_number.setFont(font_borrow_number);
							borrow_number.setLineWrap(true);
							borrow_number.setBackground(Color.cyan);
							borrow_number.setEditable(false);
							borrow_number.setBounds(100,390,250,30);
							borrow_bookInformationPanel.add(borrow_number);
							
							JTextArea borrow_BookClass = new JTextArea(""+findBook.getbookClass());
							Font font_borrow_BookClass = new Font("����",Font.BOLD,20);
							borrow_BookClass.setFont(font_borrow_BookClass);
							borrow_BookClass.setLineWrap(true);
							borrow_BookClass.setBackground(Color.cyan);
							borrow_BookClass.setEditable(false);
							borrow_BookClass.setBounds(100,420,250,30);
							borrow_bookInformationPanel.add(borrow_BookClass);
							
							ImageIcon icon = new ImageIcon(getClass().getResource(findBook.getcoverPicture()));
							Image image = icon.getImage();
							image = image.getScaledInstance(300, 400, Image.SCALE_DEFAULT);
							JLabel bookcover = new JLabel();
							icon.setImage(image);
							bookcover.setIcon(icon);
							bookcover.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());
							borrow_coverPicturePanel.add(bookcover);
							
							System.out.println("������"+findBook.getbookName());
							
							

						}
					}
					
			}
			
		});
		confirm.setBounds(100,20,90,30);
		borrow_inputPanel.add(confirm);
		JButton inputPanel_return = new JButton("����");
		inputPanel_return.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bookNumber_textfield.setText("");
				login_Panel.setVisible(true);
				borrow_wholePanel.setVisible(false);
				borrow_bottomButtonPanel.setVisible(false);
				borrow_coverPicturePanel.setVisible(false);
				borrow_bookInformationPanel.setVisible(false);
			}
			
		});
		inputPanel_return.setBounds(130,20,90,30);
		borrow_inputPanel.add(inputPanel_return);
		borrow_inputPanel.setBounds(100,50,800,50);
		borrow_inputPanel.setBackground(Color.cyan);
		borrow_wholePanel.add(borrow_inputPanel);
		borrow_bottomButtonPanel = new JPanel();
		borrow_bottomButtonPanel.setLayout(null);
		borrow_bottomButtonPanel.setBounds(0,650,1000,30);
		borrow_bottomButtonPanel.setBackground(Color.cyan);
		 borrow = new JButton("����");
		borrow.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(findBook.getborrowStatus() == 0 && findBook.getreserve() == 0){
					UpdateBook updatebook = new UpdateBook();
					updatebook.UpdateBookBorrowStatus(1, bookNumber_textfield.getText());
					ShowMessageDialog dialog = new ShowMessageDialog("����ɹ�");
				}else if(findBook.getreserve() == 1){
					System.out.println("�����ѱ�Ԥ��");
					ShowMessageDialog dialog = new ShowMessageDialog("�����ѱ�Ԥ��");
				}else if(findBook.getborrowStatus() == 1){
					System.out.println("�����ѽ��");
					ShowMessageDialog dialog = new ShowMessageDialog("�����ѽ��");
				}
				
			}
		});
		borrow.setBounds(450,0,100,30);
		borrow_bottomButtonPanel.add(borrow);
		borrow_wholePanel.add(borrow_bottomButtonPanel);
		
		returnBook = new JButton("����");
		returnBook.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(findBook.getborrowStatus() == 1){
					UpdateBook updatebook = new UpdateBook();
					updatebook.UpdateBookBorrowStatus(0, bookNumber_textfield.getText());
					ShowMessageDialog dialog = new ShowMessageDialog("����ɹ�");
				}else if(findBook.getborrowStatus() == 0){
					System.out.println("�����ѹ黹");
					ShowMessageDialog dialog = new ShowMessageDialog("�����ѹ黹");
				}else if(findBook.getborrowStatus() == 2){
					System.out.println("���ĳ������ڣ��뵽ǰ̨�黹");
					ShowMessageDialog dialog = new ShowMessageDialog("���ĳ������ڣ��뵽ǰ̨�黹");
				}
			}
			
		});
		returnBook.setBounds(450,0,100,30);
		borrow_bottomButtonPanel.add(returnBook);
		borrow_wholePanel.add(borrow_bottomButtonPanel);
		
		borrow_coverPicturePanel = new JPanel();
		borrow_coverPicturePanel.setLayout(null);
		borrow_coverPicturePanel.setBackground(Color.cyan);
		borrow_coverPicturePanel.setBounds(50,100,400,500);
		
		borrow_bookInformationPanel = new JPanel();
		borrow_bookInformationPanel.setLayout(null);
		borrow_bookInformationPanel.setBounds(500, 100, 400, 500);
		borrow_bookInformationPanel.setBackground(Color.cyan);
//		container.add(borrow_bookInformationPanel);
		borrow_wholePanel.add(borrow_bookInformationPanel);
		JLabel bookName = new JLabel("������");
		Font font_bookName = new Font("����",Font.BOLD,20);
		bookName.setFont(font_bookName);
		bookName.setBounds(0,50,200,30);
		borrow_bookInformationPanel.add(bookName);
		JLabel publishCompany = new JLabel("�����磺");
		Font font_publishCompany = new Font("����",Font.BOLD,20);
		publishCompany.setFont(font_publishCompany);
		publishCompany.setBounds(0,80,200,30);
		borrow_bookInformationPanel.add(publishCompany);
		JLabel author = new JLabel("���ߣ�");
		Font font_author = new Font("����",Font.BOLD,20);
		author.setFont(font_author);
		author.setBounds(0,110,200,30);
		borrow_bookInformationPanel.add(author);
		JLabel briefInformation = new JLabel("��飺");
		Font font_briefInformation = new Font("����",Font.BOLD,20);
		briefInformation.setFont(font_briefInformation);
		briefInformation.setBounds(0,140,200,30);
		borrow_bookInformationPanel.add(briefInformation);
		JLabel borrowStatus = new JLabel("״̬��");
		Font font_borrowStatus = new Font("����",Font.BOLD,20);
		borrowStatus.setFont(font_borrowStatus);
		borrowStatus.setBounds(0,360,200,30);
		borrow_bookInformationPanel.add(borrowStatus);
		JLabel number = new JLabel("��ţ�");
		Font font_number = new Font("����",Font.BOLD,20);
		number.setFont(font_number);
		number.setBounds(0,390,200,30);
		borrow_bookInformationPanel.add(number);
		JLabel bookclass = new JLabel("���");
		Font font_bookclass = new Font("����",Font.BOLD,20);
		bookclass.setFont(font_bookclass);
		bookclass.setBounds(0,420,200,30);
		borrow_bookInformationPanel.add(bookclass);
//		container.add(borrow_centerPanel);
		borrow_wholePanel.add(borrow_coverPicturePanel);
		container.add(borrow_wholePanel);
		
		borrow_wholePanel.setVisible(false);
		borrow_bottomButtonPanel.setVisible(false);
		borrow_coverPicturePanel.setVisible(false);
		borrow_bookInformationPanel.setVisible(false);
		borrow_inputPanel.setVisible(true);
		
		/*********************************************** ����/���� �������  ***********************************************/
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomePage homepage = new HomePage();
	}

}
