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
public class Ej_ExtraJava19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // . Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
//elementos).
    Scanner leer = new Scanner(System.in);
     int n;
      System.out.println("Ingrese un numero para el tamaño del vector: ");
      n=leer.nextInt();
      int[] v1= new int[n];  
      int[] v2= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los valors para el primer vector");
            v1[i]=leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los valors para el segundo vector");
            v2[i]=leer.nextInt();
        }
        boolean iguales=true;
        for (int i = 0; i < n; i++) {
            if(v1[i]!=v2[i]){
                iguales=false;
                break;
            }          
        }
        if(iguales){
            System.out.println("Los vectores son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
    }
    
    
}
