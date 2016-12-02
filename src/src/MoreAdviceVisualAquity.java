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

public class MoreAdviceVisualAquity {
		private JFrame frame;
		private JPanel panelmain,panelHead,panelsouth,panelempty,panelempty2,panelempty3;
		private JLabel labeltop,label,label2,label3,label4,label5,label6,label7,label8,label9;
		private JButton backtoMenu,exite,save,show;
		private Color appcolor;
		private String name;
		private JFileChooser chooser;
                private ObjectOutputStream oos;
                private File file;
                private int score2,score1,score3;
                
		public MoreAdviceVisualAquity(String name,String age,int scorea,int scoreb,int scorec){
                        this.score1 = scorea;
                        this.score2 = scoreb;
                        this.score3 = scorec;
			this.name = name;
			appcolor =  new Color(204, 255, 255);
			Font topfont= new Font("Century Gothic", Font.PLAIN, 30);
			Font font= new Font("Century Gothic", Font.PLAIN, 20);
			frame = new JFrame();
			labeltop = new JLabel("TYPES OF VISUAL IMPAIRMENT");
			panelmain = new JPanel();
			panelHead = new JPanel();
			panelsouth = new JPanel();
			panelempty = new JPanel();
			panelempty2 = new JPanel();
			panelempty3 = new JPanel();
			backtoMenu = new JButton("MENU");
			exite = new JButton("EXITE");
                        save =new JButton("SAVE");
                        show =new JButton("ShowData");
                        show.setFont(font);
                        save.setFont(font);
			backtoMenu.setFont(font);
			exite.setFont(font);
			labeltop.setFont(topfont);
			panelmain.setLayout(new GridLayout(13,1));
			panelsouth.add(backtoMenu);
                        panelsouth.add(save);
			panelsouth.add(exite);
			panelsouth.add(show);
			///////////LABEL PART//////////////
			label = new JLabel();
			label.setFont(font);
			label2 = new JLabel();
			label2.setFont(font);
			label3 = new JLabel();
			label3.setFont(font);
			label4 = new JLabel();
			label4.setFont(font);
			label5 = new JLabel();
			label5.setFont(font);
			label6 = new JLabel();
			label6.setFont(font);
			label7 = new JLabel();
			label7.setFont(font);
			label8 = new JLabel();
			label8.setFont(font);
			////////////////////////////////////
			
			
			label.setText(" -  either having very poor visual acuity (3/60 ");
			label2.setText("    to 6/60) and having a full field of vision");
			
			label3.setText(" - or having moderate visual acuity (up to 6/24)");
			label4.setText("   and reduced field of vision");
			
			label5.setText(" - or having moderate visual acuity (up to 6/18)");
			label6.setText("   but severe loss of visual field");
			label7.setText("   ");
			label8.setText("   ");
			/////////////////ACTION LISTENER///////////////////////
			backtoMenu.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					MenuPage menu = new MenuPage(name,age,score1,score2,score3);
					menu.setVisible(true);
					frame.setVisible(false);
					
				}
			});
			exite.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ExitePage ex = new ExitePage(name);
					ex.setVisible(true);
					frame.setVisible(false);
				}
			});
                       save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String a= String.valueOf(score1);
                        String b= String.valueOf(score2);
                        String c= String.valueOf(score3);
                        Connect_Postgres bi = new Connect_Postgres(name,age,a,b,c);
                    }
            
        });
                       show.addActionListener(new ActionListener(){
                     @Override
                     public void actionPerformed(ActionEvent ae) {
                         ShowConnect s = new ShowConnect(name,age,score1,score2,score3,3);
                        
                         s.setVisible(true);
                     frame.setVisible(false);
                     }
                     
                 });
			
			////////////ADD LABEL PART//////////
			panelHead.add(labeltop);
			panelmain.add(panelempty2);
			panelmain.add(label);
			panelmain.add(label2);
			panelmain.add(panelempty3);
			panelmain.add(label3);
			panelmain.add(label4);
			panelmain.add(panelempty);
			panelmain.add(label5);
			panelmain.add(label6);
			panelmain.add(label7);
			panelmain.add(label8);
			////////////////////////////////////
			
			/////////////SET COLOR/////////////
			panelempty3.setBackground(appcolor);
			panelmain.setBackground(appcolor);
			panelHead.setBackground(appcolor);
			panelempty.setBackground(appcolor);
			panelsouth.setBackground(appcolor);
			panelempty2.setBackground(appcolor);
			///////////////////////////////////
			frame.add(panelHead,BorderLayout.NORTH);
			frame.add(panelmain,BorderLayout.CENTER);
			frame.add(panelsouth,BorderLayout.SOUTH);
			frame.setSize(500, 550);
			frame.setVisible(true);
		}

		public void setVisible(boolean b) {
			frame.setVisible(true);
			
		}

}
