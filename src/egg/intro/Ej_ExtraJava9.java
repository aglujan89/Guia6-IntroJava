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
public class Ej_ExtraJava9{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Simular la división usando solamente restas. Dados dos números enteros mayores que 
//uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: 
//Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este 
//resultado es el residuo, y el número de restas realizadas es el cociente. 
//Por ejemplo: 50 / 13:
//50 – 13 = 37 una resta realizada 
//37 – 13 = 24 dos restas realizadas 
//24 – 13 = 11 tres restas realizadas 
//dado que  e11s menor que 13, entonces: el residuo es 11 y el cociente es 3.
//¿Aún no lo entendiste? Recomendamos googlear división con restas sucesiva
    Scanner leer = new Scanner(System.in);
    int divisor, dividendo,cociente=0;
        System.out.println("Ingrese un numero a dividir: ");
        dividendo=leer.nextInt();
        System.out.println("Ingrese su divisor: ");
        divisor=leer.nextInt();
        while(dividendo>=divisor){
            cociente++;
            dividendo-=divisor;
        }
        System.out.println("El cociente es: "+cociente+" y el residuo es : "+dividendo);
    }
    
}
