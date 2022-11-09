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
public class Ej_ExtraJava6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
//debajo de 1.60 mts. y el promedio de estaturas en general.

Scanner leer = new Scanner(System.in);
int N, pet;
double altura, promPet, promGen;

        System.out.println("Ingrese la cantidad de personas:");
        N = leer.nextInt();
        promGen = 0;
        promPet = 0;
        pet = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese la altura de la persona " + i + 1);
            altura = leer.nextDouble();
            promGen = promGen + altura;
            if (altura < 1.60) {
                promPet = promPet + altura;
                pet++;
            }

        }

        if (pet > 0) {
            System.out.println("El promedio de personas que mieden menos de 1.60 es de: " + promPet / pet + " y el general es de" + promGen / N);
        } else {
            System.out.println("No hay personas de menos de 1.6, el promedio general es de " + promGen/N);
        }     

    }
    
}
