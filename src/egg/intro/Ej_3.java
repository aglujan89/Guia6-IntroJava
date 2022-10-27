/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import java.util.Scanner;

/**
 *
 * @author tommy
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        
        // Var Crear leer
        Scanner leer = new Scanner(System.in); 
        
        // Cargar Cadena
        System.out.println("Ingrese una oracion: ");
        cadena = leer.nextLine();
        
        
        // Mostrar en MAY
        System.out.println("Cadena en MAY: " + cadena.toUpperCase());
        
        // Mostrar en MIN
        
        System.out.println("Cadena en MIN: " + cadena.toLowerCase());
        
    }
    
}
