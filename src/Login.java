import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
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
	
	public Login(){
		super();
		setTitle("��¼����");
		Container container = getContentPane();
		setBounds(450,150,1000,800);
		container.setLayout(null);
		container.setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(null);
		panel.setBounds(300,250,400,300);
		panel.setBackground(Color.cyan);
		JLabel title = new JLabel("ͼ���ϵͳ��¼");
		Font font = new Font("����",Font.BOLD,30);
		title.setFont(font);
		title.setBounds(80,30,400,50);
		panel.add(title);
		JLabel username = new JLabel("ѧ�ţ�");
		username.setBounds(90,105,50,30);
		panel.add(username);
		JTextField username_textField = new JTextField(10);
		username_textField.setBounds(130,105,150,30);
		panel.add(username_textField);
		JLabel password = new JLabel("���룺");
		password.setBounds(90,160,50,30);
		panel.add(password);
		JPasswordField password_textField = new JPasswordField();
		password_textField.setColumns(10);
		password_textField.setBounds(130,160,150,30);
		panel.add(password_textField);
		JButton login = new JButton("��¼");
		login.setBounds(100,210,90,30);
		panel.add(login);
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
						setVisible(false);
						BorrowJframe borrowJframe = new BorrowJframe();
						
					}else{
						System.out.println("���벻��ȷ");
					}
				}
			}
		});
		JButton back = new JButton("����");
		back.setBounds(200,210,90,30);
		panel.add(back);
		container.add(panel);
		
		setResizable(false);
		setVisible(true);
	}
	
	
	public static void main(String[] args){
		System.out.println("main Thread");
		new Login();
		
		
	}
}
