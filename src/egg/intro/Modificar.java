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
public class Modificar {

    /**
     * @param args the command line arguments
     */
    
    // EJERCICIO 5 - FALTA asignar valor a Char mediante Scanner.
    public static void main(String[] args) {

        boolean posta;
        double decimales;
//        char a; CHAR NO FUNCIONA CON SCANNER
        Scanner leer = new Scanner(System.in);
        
 
        posta = leer.nextBoolean();
        System.out.println("Ingresa un número");
        decimales = leer.nextDouble();
        System.out.println("Ingresa un char");
//        a = leer.ne
      
       
                
        System.out.println(posta);
        System.out.println(decimales);
        //System.out.println(a);
    }
    
    /* public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();

        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
    }/*
}
