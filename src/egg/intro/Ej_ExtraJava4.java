/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro;

import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class Ej_ExtraJava4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
//equivalente en romano.      
        Scanner leer = new Scanner(System.in);
       int num1;
        do {
             System.out.println("Ingrese un número entre 1 y 10");
             num1 = leer.nextInt();
             
        } while (num1<1 || num1>10 );
        
        switch (num1) {
            case 1:
                System.out.println("El número es: I.");
                break;
            case 2:
                System.out.println("El número es: II.");
                break;
            case 3:
                System.out.println("El número es: III.");
                break;
            case 4:
                System.out.println("El número es: IV.");
                break;
            case 5:
                System.out.println("El número es: V.");
                break;
            case 6:
                System.out.println("El número es: VI.");
                break;
            case 7:
                System.out.println("El número es: VII.");
                break;
            case 8:
                System.out.println("El número es: VIII.");
                break;
            case 9:
                System.out.println("El número es: IX.");
                break;
            case 10:
                System.out.println("El número es: X.");
                break;
        }
        
        

    }
    
}