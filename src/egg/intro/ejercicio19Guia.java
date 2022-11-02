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


//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
//matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
//signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
public class ejercicio19Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int n;
        System.out.println("Ingrese la dimension de la matrix");
        n = leer.nextInt();
      int [][] matrix = new int [n][n];
      boolean a = false;
//        int suma = 0;
        System.out.println("Complete la matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                matrix[i][j]= suma++;    
                matrix[i][j]= leer.nextInt();
            }
          }
        mostrarMatrix (matrix, n);

     for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]!= -matrix[j][i])
                    a = true;
            }
            
        }
        
     for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+ (-matrix[j][i])+"]");
            }
            System.out.println("");
        }
        
        if (a) {
            System.out.println("la matriz no es antisimetrica");
        }else{
            System.out.println("la matriz es antisimetrica");
        }
 
        
    }
    
    public static void mostrarMatrix (int [][] matrix, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+matrix[i][j]+"]");
            }
            System.out.println("");
        }
        
    }
    
}
