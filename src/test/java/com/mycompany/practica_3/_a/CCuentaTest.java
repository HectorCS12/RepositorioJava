/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.practica_3._a;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumno Tarde
 */
public class CCuentaTest {
    
    public CCuentaTest() {
    }

    @Test
    public void testIngresar1() {
        System.out.println("ingresar");
        double cantidad = 5;
        CCuenta instance = new CCuenta();
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIngresar2() {
        System.out.println("ingresar");
        double cantidad = -3;
        CCuenta instance = new CCuenta();
        int expResult = 2;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIngresar3() {
        System.out.println("ingresar");
        double cantidad = -5;
        CCuenta instance = new CCuenta();
        int expResult = 1;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
}
