package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AstigmatismTest {
        private int score1,score2,score3;
	private JFrame  frame ;
	private  JPanel panelnorth,panelcenter,panelsouth,panelsupsouth,panelsupcenter,panelpic,panelsup,paneltext;
	private JButton btnyes,btnno;
	private JLabel headlabel,changepic,whatlabel;
	private ArrayList<ImageIcon> img =new ArrayList<ImageIcon>();
	private ArrayList<ImageIcon> img2 =new ArrayList<ImageIcon>();
	private JTextField textanswer;
	private int count=0,random;
	private Font myFont2 = new Font("Century Gothic", Font.PLAIN, 50);
	private Font myFont3 = new Font("Century Gothic", Font.PLAIN, 30);
	private JLabel label = new JLabel();
	String []text = {"Do you see the vertical lines and horizontal lines equally clear and with same thickness?","Do you see all the lines equally clear and dark?",
			"Are all the radiating heavy black line of the same intensity and thickness?","Do you see the vertical lines and horizontal lines equally clear and with same thickness?",
	"Do you see all the lines equally clear and dark?","Are all the radiating heavy black line of the same intensity and thickness?"
	} ;
	
	public AstigmatismTest(String name,String age,int scorea,int scoreb,int scorec){
                        this.score1 = scorea;
                        this.score2 = 0;
                        this.score3 = scorec;
		Color appcolor =  new Color(204, 255, 255);
		Font myFont = new Font("Century Gothic", Font.PLAIN, 15);
		label = new JLabel(text[0]);
		label.setFont(myFont);
		////////////////////////////////////////////////
		frame =new JFrame();
		paneltext =new JPanel();
		panelsup =new JPanel();
		panelpic = new JPanel();
		panelnorth = new JPanel();
		panelcenter = new JPanel();
		panelsouth = new JPanel();
		panelsupsouth = new JPanel();
		panelsupsouth.setLayout(new GridLayout(3,1));
		headlabel =new JLabel("Astigmatism Test");
		changepic =new JLabel();
		whatlabel =new JLabel("Input Text ......");
		headlabel.setFont( myFont2);
		///////////////////////////////////////////////
		img.add(new ImageIcon("astig1.gif"));
		img.add(new ImageIcon("astig2.gif"));
		img.add(new ImageIcon("astig3.gif"));
		img.add(new ImageIcon("astig1.gif"));
		img.add(new ImageIcon("astig2.gif"));
		img.add(new ImageIcon("astig3.gif"));
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		btnyes =new JButton("Yes");
		btnno =new JButton("No");
		
	changepic.setIcon(img.get(count));
	if(count==0) JOptionPane.showMessageDialog(null,"Close right eye and Open left eye .");
	
	btnyes.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton j = (JButton) e.getSource();
		
		
		if(j.equals(btnyes)){
				score2++;
			}
		if(count==2){
			JOptionPane.showMessageDialog(null,"Close left eye and Open right eye .");
		}
		if(count==img.size()-1){
			count=0;
			RusultAstigmatTest as = new RusultAstigmatTest(name, age, score1,score2,score3);
			as.setVisible(true);
			frame.setVisible(false);
		}
		label.setText(text[count+1]);
			count++;
			changepic.setIcon(img.get(count));
			System.out.println(score2);
		}
		
	});
	
	btnno.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			if(count==2){
				JOptionPane.showMessageDialog(null,"Close left eye and Open right eye .");
			}
			if(count==img.size()-1){
				count=0;
				RusultAstigmatTest as = new RusultAstigmatTest(name, age, score1,score2,score3);
				as.setVisible(true);
				frame.setVisible(false);
			}
			label.setText(text[count+1]);
			count++;
			changepic.setIcon(img.get(count));
			System.out.println(score2);
			
		}
			
	});	
		////////////////////////////////////////////////////////
		
		textanswer =new JTextField(10);
		panelpic.add(changepic);
		panelnorth.add(headlabel);
		
		panelcenter.add(panelpic);
		panelsup.add(btnyes);
		panelsup.add(btnno);
		paneltext.add(label);
		panelsupsouth.add(paneltext);
		
		panelsupsouth.add(new JLabel());
		panelsupsouth.add(panelsup);
		panelsouth.add(panelsupsouth);
		/////////////////////////////////////////////////////////////
		panelpic.setBackground(new Color(204, 255, 255));
		panelnorth.setBackground(new Color(204, 255, 255));
		panelcenter.setBackground(new Color(204, 255, 255));
		panelsupsouth.setBackground(new Color(204, 255, 255));
		panelsouth.setBackground(new Color(204, 255, 255));
		paneltext.setBackground(appcolor);
		panelsup.setBackground(appcolor);
		
		frame.add(panelnorth,BorderLayout.NORTH);
		frame.add(panelcenter,BorderLayout.CENTER);
		frame.add(panelsouth,BorderLayout.SOUTH);
		frame.setBackground(new Color(204, 255, 255));
		frame.setVisible(true);
		frame.setSize(650,550);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		////////////////////////////////////////////////////////
	}
	public void setVisible(boolean b) {
		frame.setVisible(true);
	}
        
}
