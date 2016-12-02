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

public class MenuPage implements ActionListener {
	private JFrame frame;
	private JPanel paneltop,panelcenter,panelempty,panelcolor,panelastig,panelvisual;
	private JButton colorTest,VisualTest,AstigTest;
	private JLabel menutop;
	private String name,age;
        private int score1,score2,score3;
	
	public MenuPage(String name ,String age,int scorea,int scoreb,int scorec){
                this.score1 = scorea;
                this.score2 = scoreb;
                this.score3 = scorec;
                
		this.name = name;
		this.age = age;
		Color appcolor =  new Color(204, 255, 255);
		Font myFont3 = new Font("Century Gothic", Font.PLAIN, 40);
		Font topfont = new Font("Century Gothic", Font.PLAIN, 60);
		frame = new JFrame();
		paneltop = new JPanel();
		panelcenter = new JPanel();
		panelempty = new JPanel();
		panelcolor = new JPanel();
		panelastig = new JPanel();
		panelvisual = new JPanel();
		
		panelcenter.setLayout(new GridLayout(3, 1));
		paneltop.setLayout(new GridLayout(2, 1));
		colorTest = new JButton("COLOR  TEST");
		VisualTest = new JButton("VISUAL  ACUITY");
		AstigTest = new JButton("ASTIGMATISM");
		menutop = new JLabel(" SELECT THE TEST");
		colorTest.setFont(myFont3);
		VisualTest.setFont(myFont3);
		AstigTest.setFont(myFont3);
		menutop.setFont(topfont);
		
		paneltop.add(menutop);
		paneltop.add(panelempty); 
		panelcolor.add(colorTest); panelcenter.add(panelcolor);
		panelastig.add(AstigTest); panelcenter.add(panelastig);
		panelvisual.add(VisualTest); panelcenter.add(panelvisual);
		
		/////////////////////Action Listener///////////////////
		colorTest.addActionListener(this);
		AstigTest.addActionListener(this);
		VisualTest.addActionListener(this);
		//////////////////////SET COLOR////////////////////////
		paneltop.setBackground(appcolor);
		panelempty.setBackground(appcolor);
		panelcolor.setBackground(appcolor);
		panelastig.setBackground(appcolor);
		panelvisual.setBackground(appcolor);
		frame.setBackground(appcolor);
		frame.add(paneltop,BorderLayout.NORTH);
		frame.add(panelcenter,BorderLayout.CENTER);
		
		frame.setSize(500, 550);
		frame.setVisible(true);
	
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(colorTest)){
			ColorIntro color = new ColorIntro(name,age,score1,score2,score3);
			color.setVisible(true);
			
		}
		if(e.getSource().equals(VisualTest)){
			Intro_VisualAcuity visual = new Intro_VisualAcuity(name,age,score1,score2,score3);
			visual.setVisible(true);
		}
		if(e.getSource().equals(AstigTest)){
			AstigmatismIntro astig = new AstigmatismIntro(name, age,score1,score2,score3);
			astig.setVisible(true);
		}
		frame.setVisible(false);
		
	}
	public void setVisible(boolean b) {
		
	}
}
