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
public class MoreAdviceColorTestTest {
  private static MoreAdviceColorTest MoreAdviceColorTest;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		MoreAdviceColorTest = new MoreAdviceColorTest("Tester", "20", 0,0,0);
	}
	@Test
	public void testMoreAdviceColorTest() {
		
	}

	@Test
	public void testSetVisible() {
		MoreAdviceColorTest.setVisible(true);
	}
    
}
