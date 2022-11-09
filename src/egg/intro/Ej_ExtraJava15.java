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
public class Ej_ExtraJava15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Crea una aplicación que le pida dos números al usuario y 
        //este pueda elegir entre sumar, restar, multiplicar y dividir. 
        //La aplicación debe tener una función para cada operación 
//matemática y deben devolver sus resultados para imprimirlos en el main. 
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int num1 = leer.nextInt();
        System.out.println("");
        System.out.print("Ingresa otro numero entero:");
        int num2 = leer.nextInt();
        System.out.println("");
        boolean salir = false;
        String seguir;
        while (salir == false) {
            System.out.println("MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\n");
            System.out.print("Ingresa una opcion: ");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("La suma es: " + sumar(num1, num2));

                    break;
                case 2:
                    System.out.println("La resta es: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + multi(num1, num2));
                    break;
                case 4:
                    System.out.println("La división es: " + dividir(num1, num2));
                    break;

                case 5:
                    System.out.print("Desea salir del programa S/N?");
                    String salgo = leer.next();
                    if (salgo.equals("s") || salgo.equals("S")) {
                        salir = true;
                    } else {
                        break;
                    }

            }

        }

    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
}
