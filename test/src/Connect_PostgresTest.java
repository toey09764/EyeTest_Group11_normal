/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Toey35623
 */
public class Connect_PostgresTest {
    
    private static Connect_Postgres Connect_Postgres;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Connect_Postgres = new Connect_Postgres("Tester", "20","0","0","0");
	}
	@Test
	public void testShowConnect() {
	try{
           Class.forName("org.postgresql.Driver");
          Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/EyeTest","postgres","09764");
           if(con != null) System.out.println("Connect");
	} catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect_PostgresTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connect_PostgresTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
    
}
