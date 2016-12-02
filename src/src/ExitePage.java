package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class ExitePage implements ActionListener {
	private String name;
	private JFrame frame;
	private JLabel label, label2;
	private JPanel panelmain,panelempty1,panelempty2,panelempty3,panel1,panel2;
	private Timer time;

	public ExitePage(String name){
		Font font= new Font("Century Gothic", Font.PLAIN, 30);
		Color appcolor =  new Color(204, 255, 255);
		time = new Timer(3000,this); 
		time.start();
		
		this.name = name;
		frame = new JFrame();
		panelmain = new JPanel();
		panelempty1 = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panelempty2 = new JPanel();
		panelempty3 = new JPanel();
		panelmain.setLayout(new GridLayout(8, 1));
		label = new JLabel();
		label.setText("THANKS, "+name+".");
		label2 = new JLabel("TAKE CARE YOUR EYES.");
		label.setFont(font);
		label2.setFont(font);
		panelmain.add(panelempty1);
		panelmain.add(panelempty2);
		panelmain.add(panelempty3);
		panel1.add(label);
		panel2.add(label2);
		panelmain.add(panel1);
		panelmain.add(panel2);
		frame.add(panelmain);
		/////////////////////SET COLOR/////////////////////////////
		panelmain.setBackground(appcolor);
		panel1.setBackground(appcolor);
		panel2.setBackground(appcolor);
		panelempty1.setBackground(appcolor);
		panelempty2.setBackground(appcolor);
		panelempty3.setBackground(appcolor);
		
		frame.setSize(500, 550);
		
	}
	public void closeFrame(){
		frame.dispose();
	}
//	public static void main(String[] args) {
//		new ExitePage("Kanlayanee");
//	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(time.isRunning()){
			time.stop();
			closeFrame();
		}else{
			System.out.println("Time can not stop!!");
		}
	}
	public void setVisible(boolean b) {
		frame.setVisible(true);
	}

}
