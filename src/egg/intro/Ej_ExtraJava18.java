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
public class Ej_ExtraJava18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         Realizar un algoritmo que calcule la suma de todos los elementos 
//de un vector de tamaño N, con los valores ingresados por el usuario
    Scanner leer = new Scanner(System.in);
     int n,suma=0;
     
        System.out.println("Ingrese un numero para el tamaño del vector: ");
        n=leer.nextInt();
        int[] vector= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un valor al vector: ");
            vector[i]=leer.nextInt();
            suma+=vector[i];
            
        }
        System.out.println("la suma de los elementos es: "+suma);
    }
    
}
