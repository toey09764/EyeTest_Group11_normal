package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;

public class Login{
	private JPanel panelmain,panelbtn,panellogin,panelregister,panelid,panelpass,panellabelid,panellabelpass,panellogo,panelhead;
	private JButton login,register;
	private JLabel logoApp,laid,labelname,labelage,labelhead;
	private JTextField name,age,sex;
	private JFrame frame;
	private ImageIcon icon;
        private int score1=0,score2=0,score3=0;
	
	public Login(){
		frame = new JFrame();
		Font head = new Font("Century Gothic", Font.PLAIN, 60);
		Font myFont = new Font("Century Gothic", Font.PLAIN, 20);
		Font myFont2 = new Font("Century Gothic", Font.PLAIN, 18);
		icon = new ImageIcon();
		labelname = new JLabel("Name :");
		labelage = new JLabel("Age :");
		panellabelid = new JPanel();
		panellabelpass = new JPanel();
		panelhead = new JPanel();
		panellogo = new JPanel();
		laid = new JLabel("USER INFORMATION");
		labelhead = new JLabel("COLOR EYE TEST");
		labelhead.setFont(head);
		laid.setFont(myFont2);
		labelname.setFont(myFont2);
		labelage.setFont(myFont2);
		panelmain = new JPanel();
		panelbtn = new JPanel();
		logoApp = new JLabel();
		
		///////////////pic////////////////
		ImageIcon img = new ImageIcon("logo.jpg");
		Image setimg = img.getImage().getScaledInstance(150,150, java.awt.Image.SCALE_DEFAULT);
		ImageIcon img2 = new ImageIcon(setimg);
		
		logoApp.setIcon(img2);
		panellogin = new JPanel();
		panelregister = new JPanel();
		panelid = new JPanel();
		panelpass = new JPanel();
		name = new JTextField(10);
		age = new JTextField(5);
		login = new JButton("TEST");
		register = new JButton("REGISTER");
		panelmain.setLayout(new BorderLayout());
		panelbtn.setLayout(new GridLayout(6, 1));
		
		panellogo.add(logoApp);
		
		login.setFont(myFont2);
		register.setFont(myFont2);
		name.setFont(myFont2);
		age.setFont(myFont2);
		/////////////////////SOUTH/////////////////////
		panellabelid.add(laid);
		panellogin.add(login);
		panelregister.add(register);
		panelid.add(labelname);panelid.add(name);
		panelpass.add(labelage);panelpass.add(age);
		name.setFont(myFont);
		age.setFont(myFont);
	
		panelbtn.add(panellabelid);
		panelbtn.add(panelid);
		panelbtn.add(panelpass);
		panelbtn.add(panellogin);
		panelhead.add(labelhead);
		
		panelhead.setBackground(new Color(204, 255, 255));
		panellogo.setBackground(new Color(204, 255, 255));
		panellabelid.setBackground(new Color(204, 255, 255));
		panellabelpass.setBackground(new Color(204, 255, 255));
		panelbtn.setBackground(new Color(204, 255, 255));
		panelmain.setBackground(new Color(204, 255, 255));
		panellogin.setBackground(new Color(204, 255, 255));
		panelregister.setBackground(new Color(204, 255, 255));
		panelid.setBackground(new Color(204, 255, 255));
		panelpass.setBackground(new Color(204, 255, 255));
		/////////////////////////////////////////////////////
		panelmain.add(panelhead, BorderLayout.NORTH);
		panelmain.add(panellogo,BorderLayout.CENTER);
		panelmain.add(panelbtn, BorderLayout.SOUTH);
		/////////////////////////////////////////////////////
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				MenuPage menu = new MenuPage(name.getText(),age.getText(),score1,score2,score3);
				menu.setVisible(true);
				frame.setVisible(false);
			}
			
		});
		frame.add(panelmain);
		frame.setTitle("Eye Test");
		frame.setSize(500,550);
		frame.setVisible(true);
	}
	
	public String getName(){
		return name.getText();
	}
	
	public String getAge(){
		return age.getText();
	}
	public static void main(String[] args) {
		new Login();
	}

	public void setVisible(boolean b) {
		frame.setVisible(false);
	}
}
