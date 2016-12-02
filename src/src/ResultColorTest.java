package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultColorTest {
	private JFrame frame;
	private JPanel panelnorth,panelcenter,panelsouth,panelscore,panelpic;
	private JLabel name,age,labelpic;
	private JButton click;
	private Login user;
	private String loginname, loginage;
	private int score1,score2,score3;
	private double score100;
	private JLabel result;
	private ImageIcon pass,failed;
	private ImageIcon passed,fail;
	
	public ResultColorTest(String nameLog,String ageLog,int scorea,int scoreb,int scorec){
                this.score1 = scorea;
                this.score2 = scoreb;
                this.score3 = scorec;
                
		Font myFont3 = new Font("Century Gothic", Font.PLAIN, 30);
		Color appcolor =  new Color(204, 255, 255);
		
		score100 = Math.floor(score1*100.0/14.0);
		labelpic = new JLabel();
		pass = new ImageIcon("PassColorTest.png");
		failed = new ImageIcon("FailedColorTest.png");
		//////////////////////////////////////////
		frame = new JFrame();
		panelnorth = new JPanel();
		panelscore = new JPanel();
		panelcenter = new JPanel();
		panelpic = new JPanel();
		panelcenter.setLayout(new BorderLayout());
		
		result = new JLabel(""+score100+" %");
		panelscore.add(result);
		panelscore.setBackground(appcolor);
		panelcenter.add(panelscore,BorderLayout.NORTH);
		
		result.setFont(myFont3); 
		loginname = nameLog;
		loginage = ageLog;
		
		
		panelsouth = new JPanel();
		name = new JLabel();
		name.setFont(myFont3);
		age = new JLabel();
		age.setFont(myFont3);
		click = new JButton("MORE INFORMATION");
		click.setFont(myFont3);
		
		
		panelpic.add(labelpic);
		panelcenter.add(panelpic,BorderLayout.CENTER);
		panelcenter.add(panelsouth,BorderLayout.SOUTH);
		System.out.println(loginname +" "+ loginage +" "+score1+" "+score2+" "+score3);
		name.setText("User : "+loginname+"   ");
		age.setText("Age : "+loginage);
		panelnorth.add(name);
		panelnorth.add(age);
		panelsouth.add(click);
		
		if(score100 < 20.0){
			labelpic.setIcon(failed);
		}else{
			labelpic.setIcon(pass);
		}
		
		/////////////ACTION MORE ADVICE//////////////////
		click.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MoreAdviceColorTest Moread = new MoreAdviceColorTest(loginname,loginage,score1,score2,score3);
				Moread.setVisible(true);
				frame.setVisible(false);
			}
		});
		
		/////////////////////////////////////////////////
		panelpic.setBackground(appcolor);
		panelnorth.setBackground(appcolor);
		panelcenter.setBackground(appcolor);
		panelsouth.setBackground(appcolor);
		frame.add(panelnorth,BorderLayout.NORTH);
		frame.add(panelcenter, BorderLayout.CENTER);
//		frame.add(panelsouth,BorderLayout.SOUTH);
		//frame.add(comp, constraints);
		frame.setSize(500,550);
		
	}
	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
         public int getScore(){
            return score1;
        }
}
