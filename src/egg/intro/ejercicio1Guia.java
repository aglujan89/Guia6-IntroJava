
package egg.intro;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feder
 */
public class ejercicio1Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que pida dos nÃºmeros enteros por teclado y calcule la suma de los
//dos. El programa deberÃ¡ despuÃ©s mostrar el resultado de la suma
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero entero: ");
        int num1=leer.nextInt();
        System.out.println("ingresa otro numero entero: ");
        int num2=leer.nextInt();
        int suma=num1 + num2;
        System.out.println("La suma de ambos es: " + suma );
    }
    }
    

