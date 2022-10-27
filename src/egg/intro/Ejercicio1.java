/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro;

import java.util.Scanner;


/**
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 *El programa deberá después mostrar el resultado de la suma
 * @author fitog
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, suma;
        Scanner leer;
        leer = new Scanner(System.in);
        System.out.println("Ingresa el primer número");
        n1 = leer.nextInt();
        System.out.println("Ingresar el segundo número");
        n2 = leer.nextInt();
        suma = n1+ n2;
        System.out.println("La suma de los dos números es: " + suma);
    }
    
}
