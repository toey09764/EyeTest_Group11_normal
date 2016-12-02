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

public class ColorIntro {
	private JFrame frame;
	private JPanel north,panelcenter,panelcolor,panelvis,panelastig,emptypanel,emptypanel2,panelsouth;
	private JLabel labelmenu;
	private JButton colorTest,VisualAcuity,Astigmatism;
	private Color appcolor;
	private JPanel panelbtn,paneltop;
	private JLabel labeltext,labeltext2,labeltext3,labeltext4,labeltext0;
	String textIntro,textIntro2,textIntro3,texttop;
	private String namelogin,agelogin;
        private int score1=0,score2=0,score3=0;
	
	public ColorIntro(String name,String age,int scorea,int scoreb,int scorec){
                this.score1 = scorea;
                this.score2 = scoreb;
                this.score3 = scorec;
                
		this.namelogin =  name;
		this.agelogin = age;
		frame = new JFrame();
		Font myFont2 = new Font("Century Gothic", Font.PLAIN, 50);
		Font myFont3 = new Font("Century Gothic", Font.PLAIN, 30);
		Font myFont4 = new Font("Century Gothic", Font.PLAIN, 15);
			panelcenter = new JPanel();
			//panelcenter.setLayout(new GridLayout(6, 1));

		 	labeltext0 =new JLabel("1 ) Wear your glasses if you wear them.");
		 	labeltext0.setFont(myFont4);
	        labeltext2 =new JLabel("2 ) Hold your mobile phone at arms length.");
	        labeltext2.setFont(myFont4);
	        labeltext3 = new JLabel("3 ) A colour pattern will be displayed composed of circular dots.");
	        labeltext3.setFont(myFont4);
	        labeltext4 =new JLabel("4 ) You must try to identify the number in the pattern.");
	        labeltext4.setFont(myFont4);

	          
	        panelcenter.add(labeltext0);
	        panelcenter.add(labeltext2);
	        panelcenter.add(labeltext3);
	        panelcenter.add(labeltext4);
		
		
		appcolor =  new Color(204, 255, 255);
		labelmenu = new JLabel("HOW TO USE");
		
		panelsouth = new JPanel();
		panelcolor = new JPanel();
		emptypanel = new JPanel();
		emptypanel2 = new JPanel();
		panelvis = new JPanel();
		panelastig = new JPanel();
		panelcenter.setLayout(new GridLayout(5, 1));
		labelmenu.setFont(myFont2);
		colorTest = new JButton("GO TO COLOR TEST");
		colorTest.setFont(myFont3);
		VisualAcuity = new JButton("VISUAL ACUITY");
		VisualAcuity.setFont(myFont3);
		Astigmatism = new JButton("ASTIGMATISM");
		Astigmatism.setFont(myFont3);
		north = new JPanel();
		north.add(labelmenu);
		
		north.setBackground(appcolor);
		emptypanel.setBackground(appcolor);
		panelcolor.add(colorTest); panelcolor.setBackground(appcolor);
		panelvis.add(VisualAcuity); panelvis.setBackground(appcolor);
		panelastig.add(Astigmatism); panelastig.setBackground(appcolor);
		emptypanel2.setBackground(appcolor);
		panelcenter.setBackground(appcolor);
		panelsouth.setBackground(appcolor);
		panelsouth.add(panelcolor);
		///////////////////GO TO COLOR TEST///////////////////////
		colorTest.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ColorTest colortesting = new ColorTest(namelogin,agelogin,score1,score2,score3);
				colortesting.setVisible(true);
				frame.setVisible(false);
			}
		});
		//////////////////////////////////////////////////////////
		frame.setBackground(new Color(204, 255, 255));
		frame.add(north,BorderLayout.NORTH);
		frame.add(panelcenter,BorderLayout.CENTER);
		frame.add(panelsouth, BorderLayout.SOUTH);
		frame.setSize(500,550);
		
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
}
