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
public class ejercicio20Guia {

//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        boolean vf = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Complete la matrix");
                matrix[i][j] = leer.nextInt();
                while ((matrix[i][j] > 9) || (matrix[i][j] < 1)) {
                    System.out.println("Ingrese un numero del 1 al 9");
                    matrix[i][j] = leer.nextInt();
                }

            }
        }
        mm(matrix);
        int r = 0;
//        EVALUAR FILAS:
        for (int i = 0; i < 3; i++) {
            int x = 0;
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    r = r + matrix[i][j];
                } else {
                    x = x + matrix[i][j];
                }
            }
            if (i > 0) {
                if (r == x) {
                    vf = true;
                } else {
                    vf = false;
                }
            }
        }

        System.out.println("las filas:" + vf);
//       EVALUAR COLUMNAS:

        for (int j = 0; j < 3; j++) {
            int x = 0;
            for (int i = 0; i < 3; i++) {
                x = x + matrix[i][j];
            }
            if ((r == x) & (vf = true)) {
                vf = true;
            } else {
                vf = false;
            }
        }
        System.out.println("las columnas: " + vf);

//        EVALUAR DIAGONAL IZQUIERDA SUPERIOR DERECHA INFERIOR:
        int x = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    x = x + matrix[i][j];
                }
            }
        }
        if ((r == x) & (vf = true)) {
            vf = true;
        } else {
            vf = false;
        }

        System.out.println("las diagonal izquierda superior - derecha inferior: " + vf);

//        EVALUAR DIAGONAL IZQUIERDA INFERIOR DERECHA SUPERIOR:
        x = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == (2-i)) {
                    x = x + matrix[i][j];
                }
            }
        }
        if ((r == x) & (vf = true)) {
            vf = true;
        } else {
            vf = false;
        }

        System.out.println("las diagonal izquierda inferior - derecha superior: " + vf);
        
    }
        
    
    
    public static void mm (int [][] matrix){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }   
    
}
