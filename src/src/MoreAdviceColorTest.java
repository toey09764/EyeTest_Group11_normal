package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoreAdviceColorTest {
	private JFrame frame;
	private JPanel panelmain,panelHead,panelsouth,panelempty,panelempty2;
	private JLabel labeltop,label,label2,label3,label4,label5,label6,label7,label8,label9;
	private JButton more;
	private Color appcolor;
	private String name,age;
	private int score1,score2,score3;
        
	public MoreAdviceColorTest(String nameLog,String ageLog,int scorea,int scoreb,int scorec){
                this.score1 = scorea;
                this.score2 = scoreb;
                this.score3 = scorec;
                
		this.name = nameLog;
		this.age = ageLog;
		appcolor =  new Color(204, 255, 255);
		Font topfont= new Font("Century Gothic", Font.PLAIN, 30);
		Font font= new Font("Century Gothic", Font.PLAIN, 20);
		frame = new JFrame();
		labeltop = new JLabel("FACTS ABOUT COLOR BLINDNESS");
		panelmain = new JPanel();
		panelHead = new JPanel();
		panelsouth = new JPanel();
		panelempty = new JPanel();
		panelempty2 = new JPanel();
		more = new JButton("MORE");
		more.setFont(font);
		labeltop.setFont(topfont);
		panelmain.setLayout(new GridLayout(13,1));
		panelsouth.add(more);
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
		
		
		label.setText(" - Color blindness is not gender blind.");
		label2.setText("   In fact it is much more common among men. ");
		label3.setText("   It affects 1 in every 12 males in this country ");
		label4.setText("   but less than 1 in every 200 females.");
		
		label5.setText(" - Color blindness is hereditary, However, ");
		label6.setText("   and is passed from mother to son on ");
		label7.setText("   the 23rd chromosome. it can also be caused ");
		label8.setText("   by eye diseases, aging or retina damage.");
		
		
		////////////ADD LABEL PART//////////
		panelHead.add(labeltop);
		panelmain.add(panelempty2);
		panelmain.add(label);
		panelmain.add(label2);
		panelmain.add(label3);
		panelmain.add(label4);
		panelmain.add(panelempty);
		panelmain.add(label5);
		panelmain.add(label6);
		panelmain.add(label7);
		panelmain.add(label8);
		////////////////////////////////////
		
		/////////////SET COLOR/////////////
		panelmain.setBackground(appcolor);
		panelHead.setBackground(appcolor);
		panelempty.setBackground(appcolor);
		panelsouth.setBackground(appcolor);
		panelempty2.setBackground(appcolor);
		///////////////////////////////////
		
		more.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MoreColorBlindness more  = new MoreColorBlindness(name,age,score1,score2,score3);
				more.setVisible(true);
				frame.setVisible(false);
			}
		});
		
		frame.add(panelHead,BorderLayout.NORTH);
		frame.add(panelmain,BorderLayout.CENTER);
		frame.add(panelsouth,BorderLayout.SOUTH);
		frame.setSize(500, 550);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}
}
