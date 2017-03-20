import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorrowJframe extends JFrame{
	
	
//	public ImageIcon getImageIcon(String path, int width, int height) {
//		  if (width == 0 || height == 0) {
//		   return new ImageIcon(this.getClass().getResource(path));
//		  }
//		  ImageIcon icon = new ImageIcon(this.getClass().getResource(path));
//		  icon.setImage(this.getImage().getScaledInstance(width, height,
//		    Image.SCALE_DEFAULT));
//		  return icon;
//		 }
	
	public BorrowJframe(){
		super();
		Container container = getContentPane();
		container.setLayout(null);
		container.setBackground(Color.cyan);
		setBounds(450,150,1000,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("请输入图书编号：");
		Font font = new Font("宋体",Font.BOLD,20);
		label.setFont(font);
		label.setBounds(0,20,50,50);
		topPanel.add(label);
		JTextField textfield = new JTextField(18);
		textfield.setBounds(0,20,80,50);
		topPanel.add(textfield);
		
		JButton confirm = new JButton("确认");
		confirm.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
						
			}
			
		});
		confirm.setBounds(100,20,90,30);
		topPanel.add(confirm);
		topPanel.setBounds(100,50,800,50);
		topPanel.setBackground(Color.cyan);
		container.add(topPanel);
		
		JButton borrow = new JButton("借书");
		borrow.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		borrow.setBounds(450,650,100,30);
		container.add(borrow);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(null);
		centerPanel.setBackground(Color.cyan);
		centerPanel.setBounds(50,100,400,500);
		ImageIcon icon = new ImageIcon(getClass().getResource("bookcover.jpg"));
		Image image = icon.getImage();
		image = image.getScaledInstance(300, 400, Image.SCALE_DEFAULT);
		JLabel bookcover = new JLabel();
		icon.setImage(image);
		bookcover.setIcon(icon);
		bookcover.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());
		centerPanel.add(bookcover);
		
		JPanel bookInformationPanel = new JPanel();
		bookInformationPanel.setLayout(null);
		bookInformationPanel.setBounds(500, 100, 400, 500);
		bookInformationPanel.setBackground(Color.cyan);
		container.add(bookInformationPanel);
		
		JLabel bookName = new JLabel("书名：");
		Font font_bookName = new Font("宋体",Font.BOLD,20);
		bookName.setFont(font_bookName);
		bookName.setBounds(0,50,200,30);
		bookInformationPanel.add(bookName);
		JLabel publishCompany = new JLabel("出版社：");
		Font font_publishCompany = new Font("宋体",Font.BOLD,20);
		publishCompany.setFont(font_publishCompany);
		publishCompany.setBounds(0,80,200,30);
		bookInformationPanel.add(publishCompany);
		JLabel author = new JLabel("作者：");
		Font font_author = new Font("宋体",Font.BOLD,20);
		author.setFont(font_author);
		author.setBounds(0,110,200,30);
		bookInformationPanel.add(author);
		JLabel briefInformation = new JLabel("简介：");
		Font font_briefInformation = new Font("宋体",Font.BOLD,20);
		briefInformation.setFont(font_briefInformation);
		briefInformation.setBounds(0,140,200,30);
		bookInformationPanel.add(briefInformation);
		JLabel borrowStatus = new JLabel("状态：");
		Font font_borrowStatus = new Font("宋体",Font.BOLD,20);
		borrowStatus.setFont(font_borrowStatus);
		borrowStatus.setBounds(0,360,200,30);
		bookInformationPanel.add(borrowStatus);
		JLabel number = new JLabel("编号：");
		Font font_number = new Font("宋体",Font.BOLD,20);
		number.setFont(font_number);
		number.setBounds(0,390,200,30);
		bookInformationPanel.add(number);
		JLabel bookclass = new JLabel("类别：");
		Font font_bookclass = new Font("宋体",Font.BOLD,20);
		bookclass.setFont(font_bookclass);
		bookclass.setBounds(0,420,200,30);
		bookInformationPanel.add(bookclass);
		container.add(centerPanel);
		
		setResizable(false);
		setVisible(true);
	}
	
}
