/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ejercicio20extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
//parámetro. Después haremos otra función o procedimiento que imprima el vector.
    Scanner leer = new Scanner(System.in);
     int n;
      System.out.println("Ingrese un numero para el tamaño del vector: ");
      n=leer.nextInt();
      int[] vector = new int[n];
      imprimirVector(rellenarVector(vector,n),n);
    }
   public static int[] rellenarVector(int[] vector,int n){
       for (int i = 0; i < n; i++) {
           vector[i]=(int)(Math.random()*10);
           }
       return vector;
   }
   public static void imprimirVector(int[] vector,int n ){
       for (int i = 0; i < n; i++) {
           System.out.print(" "+vector[i]);
           
       }
   }
    
}
