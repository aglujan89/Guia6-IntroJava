/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author fitog
 */
public class Ej_ExtraJava3 {
    
//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
    
    
    public static void main (String[] args){
    
    Scanner leer = new Scanner(System.in);
    String letra;
    System.out.println("Ingrese una letra: ");
   letra = toLowerCase(leer.next());
   
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("Es vocal");
        }else{
            System.out.println("No es vocal");
            
        }
    
}
}

        