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
public class ejercicio11guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números entero positivos:");
    int num1 = leer.nextInt();
    int num2 = leer.nextInt();
    
    int numop = 0;
    while (numop!=5){
        
    
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija opción:");
    numop = leer.nextInt();
    
  
    switch (numop) {
        case 1: System.out.println("La suma de tus numeros es: " + (num1 + num2));
        break;
        case 2: System.out.println("La resta de tus numeros es:"+ (num1-num2));
        break;
        case 3: System.out.println("La multiplicacion de tus numeros es:"+ (num1*num2));
        break;
        case 4: System.out.println("La division de tus numeros es:"+ (num1/num2));
        break;
        default:
            System.out.println("Esta seguro que desea salir del programa S/N");
            String seguir = leer.next();
            if (seguir.equals("S")) {
                numop=5;             
            }else {
                numop=0;
            }
                
    }
                
          }
    }
    
}
