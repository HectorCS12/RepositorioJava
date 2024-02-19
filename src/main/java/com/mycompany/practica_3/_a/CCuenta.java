/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica_3._a;

/**
 *
 * @author Alumno Tarde
 */
public class CCuenta {

    
    double dSaldo = 100;

    public int ingresar(double cantidad) {
        int iCodErr;

        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;
        } else if (cantidad == -3) {
            System.out.println("Error detectable en pruebas de caja blanca");
            iCodErr = 2;
        } else {
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }
        return iCodErr;

    }
}
