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
public class ejercicio5Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que lea un número entero por teclado y 
        //muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        //Nota: investigar la función Math.sqrt().
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una numero netero : ");
        int num = leer.nextInt();
        System.out.println("El doble es : "+ (num*2) );
        System.out.println();
        System.out.println("El triple es : "+ (num*3));
        System.out.println();
        System.out.println("La raiz cuadrada es : "+ (Math.sqrt(num)));
        System.out.println();
    }
    
}
