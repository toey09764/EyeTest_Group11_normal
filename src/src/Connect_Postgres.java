
package src;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;


public class Connect_Postgres {
    
  public  Connect_Postgres(String name, String age, String score1,String score2,String score3){
         try{
           Class.forName("org.postgresql.Driver");
          Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/EyeTest","postgres","09764");
           if(con != null) System.out.println("Connect");
           
           
//           Statement st = con.createStatement();
//         String sql2 = "create table userdata(username text,age text,color_eye text,visual_acuity text,astigmatism text)";
//        st.execute(sql2);
           
           
           
           
//            String[] name = {"Toey", "Tay", "Tar"};
//            String[] age = {"19", "16", "13"};
           //  String[] score = {"10","15","12"};
         
//
//            Array arrayname = con.createArrayOf("text", name); 
//           Array arrayage = con.createArrayOf("text", age);
       //   Array arrayscore = con.createArrayOf("text", score);
//          
          String sql = "INSERT INTO userdata VALUES (?, ?, ?, ?, ?)";
       //   String sql = "delete from userdata where username=Toey";
   //    String sql = "UPDATE userdata SET username = ? WHERE age = '19'";
 PreparedStatement pstmt = con.prepareStatement(sql);
 
 pstmt.setString(1, name);
 pstmt.setString(2, age);
 pstmt.setString(3, score1);
 pstmt.setString(4, score3);
 pstmt.setString(5, score2);
 pstmt.executeUpdate();
 
// int total=0;
//for (int i = 0; i < model.getRowCount(); i++){
//    total +=Integer.parseInt( model.getValueAt(i, 2).toString() );// 3rd column . row column indexes are 0 based
//}
 
//con.commit();
           
//           Statement st = con.createStatement();
//          // String sql = "update userdata set username='Kabai_B',age= 24,score=11 where username='Kabai_Bi'";
//           //String sql = "insert into userdata values('Padchaya',19,10)";
//         //  String sql = "delete from userdata where username='Kabai_B'";
//         String sql = "create table person(name character varying,age integer,score integer)";
//           st.execute(sql);
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }

//    public static void main(String[] args) {
//       
//     new Connect_Postgres("Toey","19","14","6","5");
//   }

   
    
}
    
