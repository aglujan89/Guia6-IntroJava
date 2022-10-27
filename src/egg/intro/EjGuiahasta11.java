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
public class EjGuiahasta11 {

    /**
     * @param frase
     * @return 
     */   
    
//    EJERCICIO 11 -METODO
     public static String codigo (String frase){
        String codee, cadena1;
     codee="";
    
        for (int i=0; i<frase.length(); i++) {
            cadena1=frase.substring(i,(i+1));
           switch(cadena1.toLowerCase()){
               case "a": 
                   codee=codee.concat("@");
                           break;
               case "e":
                   codee=codee.concat("#");
                   break;
               case "i":
                   codee=codee.concat("$");
                   break;
               case "o":
                   codee=codee.concat("%");
                   break;
               case "u":
                   codee=codee.concat("*");
                   break;
               default:
                   codee=codee.concat(cadena1);      
           }
                   
        }
        
  return codee;
    }
    
    public static void main(String[] args) {

        
        Scanner leer = new Scanner(System.in);
        
        
// EJERCICIO 11
        
        String frase;
        System.out.println("Ingrese una frase");  //pido la frase
        frase = leer.nextLine(); 

        String retorno = codigo(frase);  //llamo subprograma "codigo" y envio variable "frase"
        System.out.println("la clave es: " + retorno); /// escribo lo que devuelve el subprograma
        
//EJERCICIO 10:
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Ingrese un numero:");
//            int num = leer.nextInt();
//            System.out.print(num);
//            for (int k = 0; k < num; k++) {
//                System.out.print("*");
//
//            }
//            System.out.println("");
       
            
//EJERCICIO 9       
//        int num, suma, contador;
//        suma=0;
//        contador=0;
//        
//        do {
//            System.out.println("Ingrese un número.");
//            num = leer.nextInt();
//            if (num>0) {
//                suma=suma+num;
//            } else {
//                suma=suma+0;
//            }
//            contador=contador+1;
//        } while (contador<3 && num!=0);
//        
//        if (num == 0) {
//            System.out.println("Se capturo el número 0.");
//        } else {
//            System.out.println("La suma de número es " + suma);
//        }
        
        
        
        
        
// EJERCICIO 8
//        int nota;
//        System.out.println("Ingrese una nota del 0 al 10");
//        nota = leer.nextInt();
//        while (nota<0 || nota>10){
//            System.out.println("Ingrese una nota del 0 al 10");
//            nota = leer.nextInt();
//        }
//        System.out.println("La nota ingresada es " + nota);

        
//EJERCICIO 5
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese 2 números");
//        int num1 = leer.nextInt();
//        int num2 = leer.nextInt();
//        if (num1 > 25 || num2 > 25) {
//            System.out.println("Uno o ambos números es/son mayor/es a 25");
//
//        } else {
//            System.out.println("nigun numero es mayor a 25");
//        }
   
   


    
    }   
 
    
}
