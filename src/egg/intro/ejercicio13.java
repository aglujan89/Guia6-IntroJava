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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
  
//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingrese la dimension que desea: ");
        
     int dim = leer.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (j==0 || j==dim-1 || i==0 || i==dim-1) {
                   System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
