/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import java.util.Scanner;

/**
 *
 * @author tommy
 */
public class V2 {
    public static void main(String[] args) {
        // crear var como entero
        int num1, num2, suma;
        
        // Var Crear leer
        Scanner leer = new Scanner(System.in);
     
        // Cargar Primer Numero
        System.out.println("Ingrese el primer numero: ");
        num1 = leer.nextInt();
     
        // Cargar Segundo Numero
        System.out.println("Ingrese el segundo numero: ");
        num2 = leer.nextInt();
        
        //suma
        suma = num1 + num2;
        
        // Mostrar la suma por consola
        System.out.println("La suma de los dos numeros es: " + suma);
    }
}
