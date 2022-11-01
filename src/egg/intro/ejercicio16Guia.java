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
public class ejercicio16Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
       
System.out.println("ingrese el tamaño del vector");
        int n=leer.nextInt();
        int[] vector= new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random() * 10);
        }
        System.out.println("Ingrese el numero a buscar");
        int num=leer.nextInt();
        for (int i = 0; i < n; i++) {
            if (vector[i]==num){
                System.out.println("el numero buscado se encuentra en la posicion= "+i);
            }
            
        }
        
    }
    
}

