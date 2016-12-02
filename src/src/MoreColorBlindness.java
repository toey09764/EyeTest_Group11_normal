package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MoreColorBlindness {
	private JFrame frame;
	private JPanel paneltop,panelcenter,panelsouth,panelempty,panelempty2,panelempty3;
	private JButton backMenu,Exite,save,show;
	private JLabel labeltop,label1,label2,label3,label4,label5,label6,label7,label8;
	private Color appcolor;
	private String name,age;
        private File file;
        private JFileChooser chooser;
        private ObjectOutputStream oos;
        private int score1,score2,score3;
        
	public MoreColorBlindness(String name,String age,int scorea,int scoreb,int scorec){
                 this.score1 = scorea;
                this.score2 = scoreb;
                this.score3 = scorec;
		this.name = name;
		this.age = age;
		appcolor =  new Color(204, 255, 255);
		Font topfont= new Font("Century Gothic", Font.PLAIN, 30);
		Font font= new Font("Century Gothic", Font.PLAIN, 20);
		
		frame = new JFrame();
		paneltop = new JPanel();
		panelcenter = new JPanel();
		panelsouth = new JPanel();
		backMenu = new JButton("MENU");
		Exite = new JButton("EXITE");
                save = new JButton("SAVE");
                show =new JButton("ShowData");
		labeltop = new JLabel("FACTS ABOUT COLOR BLINDNESS");
		labeltop.setFont(topfont);
                save.setFont(font);
		backMenu.setFont(font);
		Exite.setFont(font);
                show.setFont(font);
		panelsouth.add(backMenu);
                 panelsouth.add(save);
                panelsouth.add(Exite);
                panelsouth.add(show);
		////////////////////PANEL CENTER///////////////////////	
		panelempty = new JPanel();
		panelempty2 = new JPanel();
		panelempty3 = new JPanel();
	
		panelcenter.setLayout(new GridLayout(11, 1));
		label1 = new JLabel(" - 99% of all colorblind people are not really"); label1.setFont(font);
		label2 = new JLabel("   color blind but color deficient ; the term" ); label2.setFont(font);
		label3 = new JLabel("   color blindness is misleading."); label3.setFont(font);
		
		label4 = new JLabel(" - About 0.5% of all women are suffering from "); label4.setFont(font);
		label5 = new JLabel("   color blindness."); label5.setFont(font);
		
		label6 = new JLabel(" - Color blindness is also called Daltonism,"); label6.setFont(font);
		label7 = new JLabel("   Cafter the scientist John Dalton."); label7.setFont(font);
	
		 
		panelcenter.add(panelempty);
		panelcenter.add(label1);
		panelcenter.add(label2);
		panelcenter.add(label3);
		panelcenter.add(panelempty2);
		panelcenter.add(label4);
		panelcenter.add(label5);
		panelcenter.add(panelempty3);
		panelcenter.add(label6);
		panelcenter.add(label7);
		////////////////////ACTION PART//////////////////////
		backMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MenuPage menunew = new MenuPage(name, age,score1,score2,score3);
				menunew.setVisible(true);
				frame.setVisible(false);
			}
		});
		Exite.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ExitePage ex = new ExitePage(name);
				ex.setVisible(true);
				frame.setVisible(false);
				
			}
		});
                 save.addActionListener(new ActionListener(){
                    

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        String a= String.valueOf(score1);
                        String b= String.valueOf(score2);
                        String c= String.valueOf(score3);
                        Connect_Postgres bi = new Connect_Postgres(name,age,a,b,c);
                    }
                 
            
        });
                 show.addActionListener(new ActionListener(){
                     @Override
                     public void actionPerformed(ActionEvent ae) {
                         ShowConnect s = new ShowConnect(name,age,score1,score2,score3,1);
                        
                         s.setVisible(true);
                     frame.setVisible(false);
                     }
                     
                 });
		/////////////////////SET COLOR //////////////////////
		panelcenter.setBackground(appcolor);
		paneltop.setBackground(appcolor);
		panelsouth.setBackground(appcolor);
		panelempty.setBackground(appcolor);
		panelempty2.setBackground(appcolor);
		panelempty3.setBackground(appcolor);
		paneltop.add(labeltop);
		
		frame.setSize(500,550);
		frame.add(paneltop,BorderLayout.NORTH);
		frame.add(panelcenter, BorderLayout.CENTER);
		frame.add(panelsouth, BorderLayout.SOUTH);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
	}

}
