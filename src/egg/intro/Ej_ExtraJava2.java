/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro;

import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Ej_ExtraJava2 {
  
//    Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
//una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
//tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
//iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int A = 2;
        int B = 3;
        int C = 4;
        int D = 5;
        int aux;

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("");

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);

        System.out.println("Los valores fueron remplazados");

    }
    
}
