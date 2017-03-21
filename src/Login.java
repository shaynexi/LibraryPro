import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	
	public Connection conn;
	public Container container = getContentPane();
	
	private JButton  confirm;
	private JButton borrow;
	private JPanel borrow_topPanel;
	private JPanel borrow_centerPanel;
	private JPanel borrow_bookInformationPanel;
	public void LoginJframe(){
		/*********************************************** 登录界面  ***********************************************/

//		super();
		setTitle("登录界面");
//		container = getContentPane();
		setBounds(450,150,1000,800);
		container.setLayout(null);
		container.setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(null);
		panel.setBounds(300,250,400,300);
		panel.setBackground(Color.cyan);
		JLabel title = new JLabel("图书馆系统登录");
		Font font = new Font("宋体",Font.BOLD,30);
		title.setFont(font);
		title.setBounds(80,30,400,50);
		panel.add(title);
		JLabel username = new JLabel("学号：");
		username.setBounds(90,105,50,30);
		panel.add(username);
		JTextField username_textField = new JTextField(10);
		username_textField.setBounds(130,105,150,30);
		panel.add(username_textField);
		JLabel password = new JLabel("密码：");
		password.setBounds(90,160,50,30);
		panel.add(password);
		JPasswordField password_textField = new JPasswordField();
		password_textField.setColumns(10);
		password_textField.setBounds(130,160,150,30);
		panel.add(password_textField);
		JButton login = new JButton("登录");
		login.setBounds(100,210,90,30);
		panel.add(login);
		login.addActionListener(new ActionListener(){
			public void actionPerformed(final ActionEvent e){
				System.out.println("点击登录");
				if(username_textField.getText() == null || username_textField.getText().length() <= 0){
					System.out.println("请输入用户名");
				}else if(password_textField.getText() == null || password_textField.getText().length() <= 0){
					System.out.println("请输入密码");
				}
				else{
					FindUserInformation finduserinformation = new FindUserInformation();
					String passWord = finduserinformation.checkPassword(username_textField.getText());
					if(passWord == null || passWord.length() <= 0){
						System.out.println("该用户名不存在");
					}else if(passWord.equals(password_textField.getText())){
						System.out.println("登录成功");
						panel.setVisible(false);
						confirm.setVisible(true);
						borrow.setVisible(true);
						borrow_topPanel.setVisible(true);
						borrow_centerPanel.setVisible(true);
						borrow_bookInformationPanel.setVisible(true);
//						BorrowJframe borrowJframe = new BorrowJframe();
						
					}else{
						System.out.println("密码不正确");
					}
				}
			}
		});
		JButton back = new JButton("返回");
		back.setBounds(200,210,90,30);
		panel.add(back);
		container.add(panel);
		
		/*********************************************** 借书界面  ***********************************************/
		borrow_topPanel = new JPanel();
		JLabel label = new JLabel("请输入图书编号：");
		Font borrow_topPanel_font = new Font("宋体",Font.BOLD,20);
		label.setFont(borrow_topPanel_font);
		label.setBounds(0,20,50,50);
		borrow_topPanel.add(label);
		JTextField textfield = new JTextField(18);
		textfield.setBounds(0,20,80,50);
		borrow_topPanel.add(textfield);
		confirm = new JButton("确认");
		confirm.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
						
			}
			
		});
		confirm.setBounds(100,20,90,30);
		borrow_topPanel.add(confirm);
		borrow_topPanel.setBounds(100,50,800,50);
		borrow_topPanel.setBackground(Color.cyan);
		container.add(borrow_topPanel);
		borrow = new JButton("借书");
		borrow.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		borrow.setBounds(450,650,100,30);
		container.add(borrow);
		borrow_centerPanel = new JPanel();
		borrow_centerPanel.setLayout(null);
		borrow_centerPanel.setBackground(Color.cyan);
		borrow_centerPanel.setBounds(50,100,400,500);
		ImageIcon icon = new ImageIcon(getClass().getResource("bookcover.jpg"));
		Image image = icon.getImage();
		image = image.getScaledInstance(300, 400, Image.SCALE_DEFAULT);
		JLabel bookcover = new JLabel();
		icon.setImage(image);
		bookcover.setIcon(icon);
		bookcover.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());
		borrow_centerPanel.add(bookcover);
		borrow_bookInformationPanel = new JPanel();
		borrow_bookInformationPanel.setLayout(null);
		borrow_bookInformationPanel.setBounds(500, 100, 400, 500);
		borrow_bookInformationPanel.setBackground(Color.cyan);
		container.add(borrow_bookInformationPanel);
		JLabel bookName = new JLabel("书名：");
		Font font_bookName = new Font("宋体",Font.BOLD,20);
		bookName.setFont(font_bookName);
		bookName.setBounds(0,50,200,30);
		borrow_bookInformationPanel.add(bookName);
		JLabel publishCompany = new JLabel("出版社：");
		Font font_publishCompany = new Font("宋体",Font.BOLD,20);
		publishCompany.setFont(font_publishCompany);
		publishCompany.setBounds(0,80,200,30);
		borrow_bookInformationPanel.add(publishCompany);
		JLabel author = new JLabel("作者：");
		Font font_author = new Font("宋体",Font.BOLD,20);
		author.setFont(font_author);
		author.setBounds(0,110,200,30);
		borrow_bookInformationPanel.add(author);
		JLabel briefInformation = new JLabel("简介：");
		Font font_briefInformation = new Font("宋体",Font.BOLD,20);
		briefInformation.setFont(font_briefInformation);
		briefInformation.setBounds(0,140,200,30);
		borrow_bookInformationPanel.add(briefInformation);
		JLabel borrowStatus = new JLabel("状态：");
		Font font_borrowStatus = new Font("宋体",Font.BOLD,20);
		borrowStatus.setFont(font_borrowStatus);
		borrowStatus.setBounds(0,360,200,30);
		borrow_bookInformationPanel.add(borrowStatus);
		JLabel number = new JLabel("编号：");
		Font font_number = new Font("宋体",Font.BOLD,20);
		number.setFont(font_number);
		number.setBounds(0,390,200,30);
		borrow_bookInformationPanel.add(number);
		JLabel bookclass = new JLabel("类别：");
		Font font_bookclass = new Font("宋体",Font.BOLD,20);
		bookclass.setFont(font_bookclass);
		bookclass.setBounds(0,420,200,30);
		borrow_bookInformationPanel.add(bookclass);
		container.add(borrow_centerPanel);
		
		confirm.setVisible(false);
		borrow.setVisible(false);
		borrow_topPanel.setVisible(false);
		borrow_centerPanel.setVisible(false);
		borrow_bookInformationPanel.setVisible(false);
		
		
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args){
		System.out.println("main Thread");
		Login login = new Login();
		login.LoginJframe();
		
		
	}
}
