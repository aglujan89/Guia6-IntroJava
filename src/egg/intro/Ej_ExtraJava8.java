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
public class Ej_ExtraJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
//detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y 
//la cantidad de números impares. Al igual que en el ejercicio anterior los números 
//negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
     Scanner leer = new Scanner(System.in);   
     int num, pares=0,impares=1;
     boolean seguir=true;
     while(seguir){
         System.out.println("Ingrese un numero entero: ");
         num=leer.nextInt();
         if (num>0){
             if (num % 5==0){
                 break;
             }
             else{
                 if(num % 2 ==0){
                     pares++;
                 }
                 else{
                     impares++;
                 }
             }
         }
     }
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        
    }
    
}
