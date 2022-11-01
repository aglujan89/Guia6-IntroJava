/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author feder
 */
public class ejercicio3Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas 
        //y después toda en minúsculas. Nota: investigar la f
        //unción toUpperCase() y toLowerCase() en Java.
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingresa una Frase : ");
        frase=leer.nextLine();
        System.out.println("Tu frase en mayusculas es: " + toUpperCase(frase) );
        System.out.println();
        System.out.println("Tu frase en minuscula es: " + toLowerCase(frase) );
    }
    
}
