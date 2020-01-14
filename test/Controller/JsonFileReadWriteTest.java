/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon Yates
 */
public class JsonFileReadWriteTest {
    
    public JsonFileReadWriteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of writeAccounts method, of class JsonFileReadWrite.
     */
    @Test
    public void testWriteAccounts() {
        System.out.println("writeAccounts");
        JsonFileReadWrite.writeAccounts();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadAccounts method, of class JsonFileReadWrite.
     */
    @Test
    public void testLoadAccounts() {
        System.out.println("loadAccounts");
        JsonFileReadWrite.loadAccounts();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
