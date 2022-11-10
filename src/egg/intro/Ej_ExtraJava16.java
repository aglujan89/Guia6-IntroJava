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
 * @author feder
 */
public class Ej_ExtraJava16 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
//las personas ingresadas por teclado e indique si son mayores o menores de edad. 
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
//   
     Scanner leer = new Scanner(System.in);
     boolean salir=false;
     
     while(!salir){
        pedirDatos();
         System.out.println("Desea seguir ingresando personas Si/No)?");
         String res=toLowerCase(leer.next());
         if(res.equals("no")){
             break;
         }
        
     }
     
    }
    public static void pedirDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese el nombre de la persona: ");
        String nombre=leer.nextLine();
         System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        if(edad<18){
            System.out.println(nombre+ " es menor de edad");
        }
        else{
            System.out.println(nombre + " es mayor de edad");
        }
    }
    
}
