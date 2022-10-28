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
public class Ejercicio13Guia {

    /**
     * @param args the command line arguments
     */
//    EJERCICIO 13: CREAR UN VECTOR CON DIMENSION IGUAL A CANTIDAD DE INTEGRANTES DEL EQUIPO.
//    EJERCICIO 14: CREAR UN BUCLE FOR PARA COMPLETAR ESE VECTOR.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] equipo = new String[5];

        for (int i = 0; i<5; i++){
        equipo [i] = leer.nextLine();
        }
       for (int i=0; i<5; i++){
           System.out.println(equipo[i]);
       }

    }

}
