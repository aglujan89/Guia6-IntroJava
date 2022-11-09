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
public class Ej_ExtraJava7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
//de n números (n>0). El valor de n se solicitará al principio del programa y los números
//serán introducidos por el usuario. Realice dos versiones del programa, una usando el
//bucle “while” y otra con el bucle “do - while”.

        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese la cantidad de valores a calcular");
        int cantidad = leer.nextInt();
        int max, min, suma, valor;
        max = 0;
        min = 0;
        suma = 0;
        valor = 0;
        for (int i = 0; i < cantidad; i++) {
            do {
                System.out.println("ingrese el valor " + (i + 1) + " El mismo debe ser mayor a 0 ");
                valor = leer.nextInt();
            } while (valor < 1);

            suma = valor + suma;
            if (valor > max) {
                max = valor;

            }
            if (i == 0) {
                min = valor;
            } else if (valor < min) {
                min = valor;
            }

        }
        double prom = suma/cantidad;
        System.out.println("El Valor Maximo es " + max);
        System.out.println("El valor Minimo es " + min);
        System.out.println("El Promedio es " + prom);
 
    }
    }
