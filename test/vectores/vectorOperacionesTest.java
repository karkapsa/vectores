/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vectores;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andres
 */
public class vectorOperacionesTest {
    
    public vectorOperacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of llenarVector method, of class vectorOperaciones.
     */
    @Test
    public void testLlenarVector() {
        System.out.println("llenarVector");
        int pos = 0;
        int dato = 0;
        vectorOperaciones instance = null;
        instance.llenarVector(pos, dato);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class vectorOperaciones.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        vectorOperaciones instance = null;
        String expResult = "";
        String result = instance.mostrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
