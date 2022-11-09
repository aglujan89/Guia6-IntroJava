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
public class Ej_ExtraJava11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Escribir un programa que lea un número entero y devuelva el número de dígitos que 
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
//de división. Nota: recordar que las variables de tipo entero truncan los números o 
//resultados
     Scanner leer = new Scanner(System.in);
     int n,a,cant=0;
        System.out.println("Ingrese un numero entero: ");
        n=leer.nextInt();
        a=n;
        while(n>0){
            cant++;
            n/=10;
        }
        System.out.println("La cantidad de digitos de "+a+" es "+cant);
    }
    
}
