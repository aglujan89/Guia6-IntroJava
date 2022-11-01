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
public class ejercicio10Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int limite, num, suma;
        suma=0;
        System.out.println("Ingrese un limite");
        limite = leer.nextInt();
        
        while(limite <0){
            System.out.println("Ingrese un numero positivo.");
            limite = leer.nextInt();
        }
        do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma = num + suma;
         }while(limite >suma);
        System.out.println("Superaste el limite");
    }
    
}
