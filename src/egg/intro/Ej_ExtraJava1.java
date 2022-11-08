/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro;

import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Ej_ExtraJava1 {

    /**
     * @param args the command line arguments
     */
//    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
    public static void main(String[] args) {
        System.out.println("Ingrese los minutos");
        Scanner leer = new Scanner(System.in);
        int minutos = leer.nextInt();
        int dias,horas;
       dias = (minutos / 1440);      
       horas = (minutos % 1440 )/60;
       
        System.out.println("El equivalente es :" + dias + " dias " + horas + " Hs ") ;
       
       
        
        
        
        
    }
    
}
