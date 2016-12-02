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

public class MoreAdviceAstig {
	private JFrame frame;
	private JButton menu,exite,save,show;
	private JPanel panelsouth,paneltop,panelcenter,panelempty;
	private JLabel labeltop,label1,label2,label3,label4,label5,label6,label7;
	private   JFileChooser chooser ;
        private File file;
        private ObjectOutputStream oos;
        private int score1,score2,score3;
        
	public MoreAdviceAstig(String name,String age,int scorea,int scoreb,int scorec){
                        this.score1 = scorea;
                        this.score2 = scoreb;
                        this.score3 = scorec;
		Font myFont3 = new Font("Century Gothic", Font.PLAIN, 30);
		Font font = new Font("Century Gothic", Font.PLAIN, 15);
		Color appcolor =  new Color(204, 255, 255);
		
		frame = new JFrame();
		menu = new JButton("MENU");
		exite = new JButton("EXITE");
                save = new JButton("Save");
                show = new JButton("ShowData");
		panelsouth = new JPanel();
		paneltop = new JPanel();
		panelcenter = new JPanel();
		panelempty = new JPanel();
		panelcenter.setLayout(new GridLayout(10, 1));
		labeltop = new JLabel("Astigmatism");
		labeltop.setFont(myFont3);
		
		label1 = new JLabel("   This may seem odd but if you really think about it,"); 	label1.setFont(font);
		label2 = new JLabel("   our eyes are muscles and so they need to be kept in shape."); label2.setFont(font);
		label3 = new JLabel("   One helpful exercise is to read and avert your gaze periodically. "); label3.setFont(font);
		label4 = new JLabel("   Start by reading one paragraph then shifting your gaze to "); label4.setFont(font);
		label5 = new JLabel("   a nearby object and then go back to reading. "); label5.setFont(font);
		label6 = new JLabel("   Doing this repeatedly will strengthen your eye muscles "); label6.setFont(font);
		label7 = new JLabel("   and improve your ability to focus."); label7.setFont(font);
		
		
		paneltop.add(labeltop);
		panelcenter.add(panelempty);
		panelcenter.add(label1);
		panelcenter.add(label2);
		panelcenter.add(label3);
		panelcenter.add(label4);
		panelcenter.add(label5);
		panelcenter.add(label6);
		panelcenter.add(label7);
		panelsouth.add(menu); panelsouth.add(save); panelsouth.add(exite); panelsouth.add(show); 
		
		frame.add(panelsouth,BorderLayout.SOUTH);
		frame.add(panelcenter, BorderLayout.CENTER);
		frame.add(paneltop,BorderLayout.NORTH);
		
		
		
/////////////////ACTION LISTENER///////////////////////
	menu.addActionListener(new ActionListener() {
		
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
                         ShowConnect s = new ShowConnect(name,age,score1,score2,score3,2);
                        
                         s.setVisible(true);
                     frame.setVisible(false);
                     }
                     
                 });
	/////////////////////////////////////////////////
	panelcenter.setBackground(appcolor);
	paneltop.setBackground(appcolor);
	panelsouth.setBackground(appcolor);
	panelempty.setBackground(appcolor);
		frame.setSize(500, 550);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
}
