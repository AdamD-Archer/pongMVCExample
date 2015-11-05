/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.MySandbox;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zev
 */
public class NewMainTest {
    
    public NewMainTest() {
    }

    /**
     * Test of main method, of class NewMain.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        NewMain.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    @Test
    public void testOne() {
        System.out.println("TestOne-Pass");
        int expResult = 1;
        NewMain.NewModel model = new NewMain.NewModel();
        int result = model.getCounter();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testOneFail() {
        System.out.println("TestOne-Fail");
        int expResult = 2;
        NewMain.NewModel model = new NewMain.NewModel();
        int result = model.getCounter();
        assertEquals(expResult, result);
    }
}
