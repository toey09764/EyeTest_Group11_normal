package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Intro_VisualAcuity {
	private JFrame frame;
	private JPanel panelnorth,panelcenter,panelcolor,panelvis,panelastig,emptypanel,emptypanel2,panelsouth,panelcentersup;
	private JLabel labelmenu;
	private JButton colorTest,VisualAcuity,Astigmatism;
	private Color appcolor;
	private JPanel panelbtn,paneltop;
	private JLabel labeltext,labeltext2,labeltext3,labeltext4,labeltext0,labeltext1;
	String textIntro,textIntro2,textIntro3,texttop;
	private String namelogin,agelogin;
	private int score1,score2,score3;
        
	public Intro_VisualAcuity(String name,String age,int scorea,int scoreb,int scorec){
                frame  =new JFrame();
                this.score1 = scorea;
                this.score2 = scoreb;
                this.score3 = scorec;
                
		Font myFont2 = new Font("Century Gothic", Font.PLAIN, 50);
		Font myFont3 = new Font("Century Gothic", Font.PLAIN, 30);
		Font myFont4 = new Font("Century Gothic", Font.PLAIN, 15);
		
		    panelnorth = new JPanel();
			panelcenter = new JPanel();
			panelcenter.setLayout(new BorderLayout());
			panelcentersup = new JPanel();
			panelcentersup .setLayout(new GridLayout(5,1));
			panelsouth = new JPanel();
			panelsouth.setLayout(new BorderLayout());
			panelbtn =new JPanel();
			labelmenu = new JLabel("HOW TO USE");
			labelmenu.setFont(myFont2);
			VisualAcuity = new JButton(" Go to VISUAL ACUITY Test");
			VisualAcuity.setFont(myFont3);
			labeltext0 =new JLabel("   1 ) Wear your glasses if you wear them.");
		 	labeltext0.setFont(myFont4);
	        labeltext1 =new JLabel("   2 ) Hold your mobile phone at arms length.");
	        labeltext1.setFont(myFont4);
	        labeltext2 =new JLabel("   and cover your left eye or right eye when texts appear");
		 	labeltext2.setFont(myFont4);
	        labeltext3 = new JLabel("   3 ) A letter will be display and you must");
	        labeltext3.setFont(myFont4);
	        labeltext4 =new JLabel("   answer with which leeter you saw. ");
	        labeltext4.setFont(myFont4);
	        
	        panelnorth.add(labelmenu);
	        panelbtn.add(VisualAcuity);
	        panelcentersup.add(labeltext0);
	        panelcentersup.add(labeltext1);
	        panelcentersup.add(labeltext2);
	        panelcentersup.add(labeltext3);
	        panelcentersup.add(labeltext4);
	        panelcenter.add(panelcentersup,BorderLayout.WEST);
	        panelsouth.add(panelbtn);
	        panelcentersup.setBackground(new Color(204, 255, 255));
	        panelbtn.setBackground(new Color(204, 255, 255));
	        panelnorth.setBackground(new Color(204, 255, 255));
	        panelcenter.setBackground(new Color(204, 255, 255));
	        panelsouth.setBackground(new Color(204, 255, 255));
	       
	        VisualAcuity.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					VisualAcuityTest Vs = new VisualAcuityTest(name, age,score1,score2,score3);
					Vs.setVisible(true);
					frame.setVisible(false);
					
				}
			});
	        
	        frame.setBackground(new Color(204, 255, 255));
			frame.add(panelnorth,BorderLayout.NORTH);
			frame.add(panelcenter,BorderLayout.CENTER);
			frame.add(panelsouth, BorderLayout.SOUTH);
			frame.setSize(500,550);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	        
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
	

}
