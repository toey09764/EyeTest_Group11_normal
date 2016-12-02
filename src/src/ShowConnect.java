
package src;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ShowConnect {

   private JFrame frame  ;
   private JPanel panel,panel2,panelbottom;
   private JScrollPane scroll;
    private  JTextArea textarea;
    private JLabel labeltext;
    private String text="";
    private JButton back,delete;
    private int choose=0,score1=0,score2=0,score3=0;
    private String name="",age="";
    public ShowConnect(String name,String age,int score1,int score2,int score3,int choose){
        this.choose=choose;
        this.name=name;
        this.age =age;
        this.score1=score1;
        this.score2=score2;
        this.score3=score3;
        frame = new JFrame();
        labeltext = new JLabel();
         textarea =new JTextArea();
            panel =new JPanel();   
            panel2 =new JPanel();
            panelbottom =new JPanel();
            back =new JButton("Back");
            delete =new JButton("Delete Data");
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/EyeTest","postgres","09764");
           if(con != null) System.out.println("Connect");
           
            Statement statement = con.createStatement();
	    ResultSet resultSet = statement.executeQuery("SELECT * FROM userdata");
            
             ResultSetMetaData metadata = resultSet.getMetaData();
	    int columnCount = metadata.getColumnCount();
             System.out.println(columnCount);
               ArrayList<String> columns = new ArrayList<String>();
	    for (int i = 1; i <= columnCount; i++) {
		String columnName = metadata.getColumnName(i);
		columns.add(columnName);
	    }
            int count=1;
            
              while (resultSet.next()) {
		for (String columnName : columns) {
                    
                         String value = resultSet.getString(columnName);
		    System.out.println(columnName + " = " + value);
                    text+=columnName + " = " + value +"\n";
                    
                    
		   
		}
                text+="-----------------------------------"+"\n";
                count++;
	    }
           
           
        } catch (Exception ex) {
           ex.printStackTrace();
        }
       // System.out.println(text);
       back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(choose==1)  {
            MoreColorBlindness m =  new MoreColorBlindness(name,age,score1,score2,score3);
            m.setVisible(true);
            frame.setVisible(false);
                    
                }
                else if (choose==2){
                    MoreAdviceAstig m2 = new MoreAdviceAstig(name, age, score1, score2, score3);
                    m2.setVisible(true);
                    frame.setVisible(false);
                }
                else{
                    MoreAdviceVisualAquity m3 = new MoreAdviceVisualAquity(name, age, score1, score2, score3);
                     m3.setVisible(true);
                    frame.setVisible(false);
                }  
            }
           
       });
       delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String code = JOptionPane.showInputDialog(
        frame, 
        "Enter the Name  To Delete Data", 
        "DELETE DATA", 
        JOptionPane.WARNING_MESSAGE
    );
          try 
               {  
                   Class.forName("org.postgresql.Driver");
                          Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/EyeTest","postgres","09764");
                            Statement st = con.createStatement();
              String sql = "DELETE FROM userdata WHERE username = '" + code + "';";
               st.execute(sql); 

               }
               catch(Exception e)
               {
                   System.out.println(e);
               }
            }
           
       });
        textarea.setText(text);
        
        panelbottom.add(back);
        panelbottom.add(delete);
       scroll = new JScrollPane(textarea);
      
        scroll.setPreferredSize(new Dimension (450,450));
         panel.add(scroll);
        frame.add(panel);
        frame.add(panelbottom,BorderLayout.SOUTH);
        frame.setSize(500,550);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
//    public static void main(String[] args) {
//      new ShowConnect("toey","12",1,2,3,4);
//    }

    void setVisible(boolean b) {
        frame.setVisible(true);
    }
    
}
