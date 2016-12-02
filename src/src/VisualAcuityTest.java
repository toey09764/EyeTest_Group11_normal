package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
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

public class VisualAcuityTest {
	private int score1,score2,score3;
	private JFrame  frame ;
	private  JPanel panelnorth,panelcenter,panelsouth,panelsupsouth,panelsupcenter,panelpic;
	private JButton btnnext;
	private JLabel headlabel,changepic,whatlabel;
	private ArrayList<ImageIcon> img =new ArrayList<ImageIcon>();
	private ArrayList<ImageIcon> img2 =new ArrayList<ImageIcon>();
	private String[] correctanswer = {"AVQDTLWH","QCTMDIYZ","WQLXGDMT","XFJMYTRG","DVQNHFZO","JPEBHCLF"};
	private String[] correctanswer2 = {"NCFELZAG","DFPWSABC","URFVWBLP","AFBZRSXT","NLZFGCRO","YFEHPBTI"};
	private JTextField textanswer;
	private int count=0,score=0,random=0;
	private Font myFont2 = new Font("Century Gothic", Font.PLAIN, 50);
	private Font myFont3 = new Font("Century Gothic", Font.PLAIN, 30);
	
	public VisualAcuityTest(String name,String age,int scorea,int scoreb,int scorec){
                this.score1 = scorea;
                this.score2 = scoreb;
                this.score3 = 0;
                
		////////////////////////////////////////////////
		frame =new JFrame();
		panelpic = new JPanel();
		panelnorth = new JPanel();
		panelcenter = new JPanel();
	panelcenter.setLayout(new GridLayout(3,1));
		panelsouth = new JPanel();
		panelsupsouth = new JPanel();
		panelsupsouth.setLayout(new GridLayout(4,1));
		headlabel =new JLabel("VisualAcuity Test");
		changepic =new JLabel();
		whatlabel =new JLabel("Input Text ......");
		headlabel.setFont( myFont2);
		///////////////////////////////////////////////
		img.add(new ImageIcon("text1.png"));
		img.add(new ImageIcon("text2.png"));
		img.add(new ImageIcon("text3.png"));
		img.add(new ImageIcon("text4.png"));
		img.add(new ImageIcon("text5.png"));
		img.add(new ImageIcon("text6.png"));
		/////////////////////////////////////
		img2.add(new ImageIcon("text7.png"));
		img2.add(new ImageIcon("text8.png"));
		img2.add(new ImageIcon("text9.png"));
		img2.add(new ImageIcon("text10.png"));
		img2.add(new ImageIcon("text11.png"));
		img2.add(new ImageIcon("text12.png"));
		//////////////////////////////////////
		btnnext =new JButton("Next");
		random = new Random().nextInt(2);
		
		if(random==0){
			changepic.setIcon(img.get(count));
		}
		else{
			changepic.setIcon(img2.get(count));
		}
		
		btnnext.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				JButton j = (JButton) e.getSource();
				
				if(random==0){
						if(j.equals(btnnext)){
					
					if(textanswer.getText().equals(correctanswer[count])){
						score3++;
					}
					else{
						JOptionPane.showMessageDialog(null,"You,ve missed some Character");
					}
					
					if(count == img.size()-1){
						System.out.println("stop");
                                                System.out.println(score1+" "+score2+" "+score3);
						ResultVisualAcuityTest result = new ResultVisualAcuityTest(name,age,score1,score2,score3);
						result.setVisible(true);
						frame.setVisible(false);
						count=0;
					}
					
					count++;	
					changepic.setIcon(img.get(count));
				}
			
			}		
					
				else if(random==1){
					if(j.equals(btnnext)){
						
						if(textanswer.getText().equals(correctanswer2[count])){
							score3++;
						}
						else{
							JOptionPane.showMessageDialog(null,"You,ve missed some Character");
						}
						
						if(count == img.size()-1){
							System.out.println("stop");
							ResultVisualAcuityTest result = new ResultVisualAcuityTest(name,age,score1,score2,score3);
							result.setVisible(true);
							frame.setVisible(false);
							count=0;
						}
					
						count++;	
						changepic.setIcon(img2.get(count));
					}	
						
		       }
				
				textanswer.setText(null);
				System.out.println(score3);
			
			}
			
		});
		////////////////////////////////////////////////////////
		
		textanswer =new JTextField(10);
		panelpic.add(changepic);
		panelnorth.add(headlabel);
		panelcenter.add(new JLabel());
		panelcenter.add(panelpic);
		panelcenter.add(new JLabel());
		panelsupsouth.add(whatlabel);
		panelsupsouth.add(textanswer);
		panelsupsouth.add(new JLabel());
		panelsupsouth.add(btnnext);
		panelsouth.add(panelsupsouth);
		/////////////////////////////////////////////////////////////
		panelpic.setBackground(new Color(204, 255, 255));
		panelnorth.setBackground(new Color(204, 255, 255));
		panelcenter.setBackground(new Color(204, 255, 255));
		panelsupsouth.setBackground(new Color(204, 255, 255));
		panelsouth.setBackground(new Color(204, 255, 255));
		//panelpic.setBackground(new Color(204, 255, 255));
		
		
		frame.add(panelnorth,BorderLayout.NORTH);
		frame.add(panelcenter,BorderLayout.CENTER);
		frame.add(panelsouth,BorderLayout.SOUTH);
		frame.setBackground(new Color(204, 255, 255));
		
		frame.setSize(500,550);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		////////////////////////////////////////////////////////
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}



}

				
				