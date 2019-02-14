/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenprojectngisa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lungisa
 */
public class CalculatorNgisaTest {
  
    @Test
    public void testAdd() {
        System.out.println("Add");
        int q = 0;
        int b = 0;
        CalculatorNgisa instance = new CalculatorNgisa();
        int expResult = 0;
        int result = instance.Add(q, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
        
        
    }
    
}
