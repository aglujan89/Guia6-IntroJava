/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro;

import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ejercicio4Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dada una cantidad de grados centígrados se debe mostrar 
        // su equivalente en grados Fahrenheit. 
        // La fórmula correspondiente es: F = 32 + (9 * C / 5).
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el valor en grados centigrados : ");
        float centigrado = leer.nextFloat();
        float fahr= 32 + (9*centigrado/5);
        System.out.println("Los grados en Fahrenheit son: "+ fahr );
        
    }
    
}
