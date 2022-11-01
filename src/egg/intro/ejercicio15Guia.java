/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro;

//import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class ejercicio15Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//        Scanner leer = new Scanner(System.in);
       int[]num = new int[100];
       int cont;
       cont=1;
               
        for (int i = 0; i < 100; i++) {
            num[i]=cont;
            cont=cont+1;
           }
        for (int i = 99; i > -1; i--) {
            System.out.println(num[i]);
        }
        
    
        }
        }

        
        
    
    
