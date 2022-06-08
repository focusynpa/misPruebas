/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ProBook
 */
public class CCuentaTest {
    
    public CCuentaTest() {
    }

    /**
     * Test of main method, of class CCuenta.
     */
    
    /*
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CCuenta.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class CCuenta.
     */
    /*
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.retirar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class CCuenta.
     */
    
    @Test
    public void testIngresar() {
        //System.out.println("ingresar");
     //   double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        int expResult = 1;
        int result = instance.ingresar(-2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testIngresar2() {
        //System.out.println("ingresar");
      //  double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        int expResult = 2;
        int result = instance.ingresar(-3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
     @Test
    public void testIngresar3() {
      //  System.out.println("ingresar");
     //   double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        int expResult = 0;
        int result = instance.ingresar(0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
    
}
