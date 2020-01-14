/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Doctor;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Simon Yates
 */
public class AccountHandlerTest {
    
    public AccountHandlerTest() {
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
     * Test of NewPatientId method, of class AccountHandler.
     */
    @Test
    public void testNewPatientId() {
        System.out.println("NewPatientId");
        String expResult = "P0000";
        String result = AccountHandler.NewPatientId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    public void testAccountIncrement() {
		AccountHandler sm = new AccountHandler();
		sm.equals("2");
		assertEquals(2, sm.getClass());
	}

        @Test
    public void testDeparture() throws JsonProcessingException{
        String doctors = AccountHandler.NewDocId(); 
       
       
        assertThat(doctors.replace(doctors, doctors), equalTo("D0001"));
    }
    
   
    /**
     * Test of NewDocId method, of class AccountHandler.
     */
    @Test
    public void testNewDocId() {
        System.out.println("NewDocId");
        String expResult = "D0001";
        String result = AccountHandler.NewDocId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of NewSecId method, of class AccountHandler.
     */
    @Test
    public void testNewSecId() {
        System.out.println("NewSecId");
        String expResult = "S0001";
        String result = AccountHandler.NewSecId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of NewAdminId method, of class AccountHandler.
     */
    @Test
    public void testNewAdminId() {
        System.out.println("NewAdminId");
        String expResult = "A0001";
        String result = AccountHandler.NewAdminId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
