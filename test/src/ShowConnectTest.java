/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

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
public class ShowConnectTest {
   private static ShowConnect ShowConnect;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ShowConnect = new ShowConnect("Tester", "20", 0,0,0,20);
	}
	@Test
	public void testShowConnect() {
	
	}

//	@Test
//	public void testMain() {
//		fail("Not yet implemented");
//	}
//
//	@Test
	public void testSetVisible() {
		ShowConnect.setVisible(false);
	}
}
