package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class ColorTest{
	private JFrame frame;
	private JPanel panelnorth,panelcenter,panelsouth,panelpic,panelanswer,panelfill,panellabel,panelbtn;
	private JLabel colortest,iconshow,labelanswer;
	private Color appcolor;
	private JButton b1,b2,b3,b4;
	private JTextField answer;
	private ArrayList<ImageIcon> icon;
	private String [] CorrectAnswer =  {"12","29","3","74","45","7","42","8","2","10","25","5","2","58"};
	private int num = 0;
	private String loginname,loginage;
        private int score1=0,score2=0,score3=0;
	
	public ColorTest(String name,String age,int scorea,int scoreb,int scorec){
                this.score1 = 0;
                this.score2 = scoreb;
                this.score3 = scorec;
                
		Timer t = new Timer();
		this.loginname = name;
		this.loginage = age;
		Font myFont4 = new Font("Century Gothic", Font.PLAIN, 20);
		b1 = new JButton("NEXT");
		b1.setFont(myFont4);
		answer = new JTextField(5);
		answer.setFont(myFont4);
		labelanswer = new JLabel("What Number Do You See");
		labelanswer.setFont(myFont4);
		panelpic = new JPanel();
		panelanswer = new JPanel();
		iconshow = new JLabel();
		frame = new JFrame();
		appcolor =  new Color(204, 255, 255);
		Font myFont2 = new Font("Century Gothic", Font.PLAIN, 40);
		icon = new ArrayList<ImageIcon>();
		
		panelfill = new JPanel();
		panellabel = new JPanel();
		panelbtn = new JPanel();
		
		icon.add(new ImageIcon("plate01.gif"));
		icon.add(new ImageIcon("plate02.gif"));
		icon.add(new ImageIcon("plate03.gif"));
		icon.add(new ImageIcon("plate04.gif"));
		icon.add(new ImageIcon("plate05.gif"));
		icon.add(new ImageIcon("plate06.gif"));
		icon.add(new ImageIcon("plate08.gif"));
		icon.add(new ImageIcon("plate09.gif"));
//		icon.add(new ImageIcon("et.jpg"));
		icon.add(new ImageIcon("et2.jpg"));
		icon.add(new ImageIcon("et3.jpg"));
		icon.add(new ImageIcon("et4.jpg"));
		icon.add(new ImageIcon("et5.jpg"));
		icon.add(new ImageIcon("et6.jpg"));
		icon.add(new ImageIcon("et7.jpg"));
		icon.add(new ImageIcon("et8.jpg")); 
		//Inanswer = new String[icon.size()];
		
		///////////////////////////////////////////////////

		///////////////////////////////////////////////////
		
		panelnorth = new JPanel();
		panelcenter = new JPanel();
		panelcenter.setLayout(new BorderLayout());
		panelsouth = new JPanel();
		colortest  = new JLabel("COLOR TESTING"); 
		colortest.setFont(myFont2);
		panelnorth.add(colortest);
//		panelcenter.setBorder(new TitledBorder(new EtchedBorder()));
		panelnorth.setBackground(appcolor);
		panelsouth.setBackground(appcolor);
		
		///////////////////////////CENTER/////////////////////////////////////
		panelpic.add(iconshow);
		panelanswer.setLayout(new GridLayout(3, 1));
		panellabel.add(labelanswer); panellabel.setBackground(appcolor);	
		panelfill.add(answer); panelfill.setBackground(appcolor);
		panelbtn.add(b1); panelbtn.setBackground(appcolor);
		panelanswer.add(panellabel);
		panelanswer.add(panelfill);
		panelanswer.add(panelbtn);
		
		iconshow.setIcon(icon.get(num));
		if(answer.getText().equalsIgnoreCase(CorrectAnswer[0])){
			score1++;
		}
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
		
					    		iconshow.setIcon(icon.get(num+1));	
								
								if(answer.getText().equalsIgnoreCase(CorrectAnswer[num])){
									score1++;
								}
								if((num+1) == icon.size()-1){
									t.cancel();
									System.out.println("stop");
									ResultColorTest result = new ResultColorTest(loginname,loginage,score1,score2,score3);
									result.setVisible(true);
									frame.setVisible(false);
									System.out.println(CorrectAnswer.length);
								}
					    	
					    
				answer.setText(null);
				num++;
					System.out.println(score1);
					   
				
			}
		});
	
		panelpic.setBackground(appcolor);
		panelanswer.setBackground(appcolor);
		panelcenter.add(panelpic,BorderLayout.CENTER);
		panelcenter.add(panelanswer,BorderLayout.SOUTH);
		//////////////////////////////////////////////////////////////////////
		frame.add(panelnorth,BorderLayout.NORTH);
		frame.add(panelcenter,BorderLayout.CENTER);
		frame.add(panelsouth,BorderLayout.SOUTH);
		frame.setSize(500,550);
		frame.setVisible(true);
		
	}
	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ColorTest("boom","13",0,45,21);
	}

	
}
