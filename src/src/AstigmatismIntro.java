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

public class AstigmatismIntro {

		private JFrame frame;
		private JPanel north,panelcenter,panelcolor,panelvis,panelastig,emptypanel,emptypanel2,panelsouth;
		private JLabel labelmenu;
		private JButton VisualAcuity,Astigmatism;
		private Color appcolor;
		private JPanel panelbtn,paneltop;
		private JLabel labeltext,labeltext2,labeltext3,label2_1,labeltext4,labeltext0;
		String textIntro,textIntro2,textIntro3,texttop;
		private String namelogin,agelogin;
                private int score1,score2,score3;
		
		public AstigmatismIntro(String name,String age,int scorea,int scoreb,int scorec){
                        this.score1 = scorea;
                        this.score2 = scoreb;
                        this.score3 = scorec;
			this.namelogin =  name;
			frame = new JFrame();
			Font myFont2 = new Font("Century Gothic", Font.PLAIN, 50);
			Font myFont3 = new Font("Century Gothic", Font.PLAIN, 30);
			Font myFont4 = new Font("Century Gothic", Font.PLAIN, 15);
				panelcenter = new JPanel();

			 	labeltext0 =new JLabel(" 1 ) Wear your glasses if you wear them.");
			 	labeltext0.setFont(myFont4);
		        labeltext2 =new JLabel(" 2 ) Hold your mobile phone at arms length and cover your left eye");
		        labeltext2.setFont(myFont4);
		        label2_1 = new JLabel("     or right eye when the texts appear.");
		        label2_1.setFont(myFont4);
		        labeltext3 = new JLabel(" 3 )An image  will be displayed and you must answer  whether ");
		        labeltext3.setFont(myFont4);
		        labeltext4 =new JLabel("    any of the lines appear darker than one another.");
		        labeltext4.setFont(myFont4);

		          
		        panelcenter.add(labeltext0);
		        panelcenter.add(labeltext2);
		        panelcenter.add(label2_1);
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
			Astigmatism = new JButton("GO TO ASTIGMATISM TEST");
			Astigmatism.setFont(myFont3);
			
			
			north = new JPanel();
			north.add(labelmenu);
			
			north.setBackground(appcolor);
			emptypanel.setBackground(appcolor);
			panelcolor.add(Astigmatism); panelcolor.setBackground(appcolor);
		
			emptypanel2.setBackground(appcolor);
			panelcenter.setBackground(appcolor);
			panelsouth.setBackground(appcolor);
			panelsouth.add(panelcolor);
			///////////////////GO TO COLOR TEST///////////////////////
			Astigmatism.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					AstigmatismTest as = new AstigmatismTest(name,age,score1,score2,score3);
					as.setVisible(true);
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
