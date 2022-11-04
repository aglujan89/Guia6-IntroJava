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
public class ejercicio21Guia {
    
//Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
//3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
//dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
//se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
//que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
//la matriz M en la cual empieza el primer elemento de la submatriz P.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matrixM = new int[10][10];
        int[][] matrixP = new int[3][3];

//       completo matriz de 10:
        int cont =0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrixM[i][j] = cont++;
            }
        }
//        Muestro la matriz
        mostrarMatriz(matrixM, 10);
        
//        completo matriz de 3
            cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixM[i][j] = cont++;
            }
        }
//        Muestro la matriz
        mostrarMatriz(matrixM, 3);
        
//        buscar coincidencia de martriz p en m
int a =0;
int b =0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                do {
                    if (matrixP[a][b] = matrixM[i][j]) {
                        b = b++;
                        j = j++;
                    }
                } while ((matrixP[a][b] != matrixM[i][j]) || b==3);
            }

        }
        
        
    }
    

    public static void mostrarMatriz (int [][] matrix, int n){
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  [" + matrix [i][j] + "]  ");
            }
            System.out.println("");
        }
    }
    
            
            
}
