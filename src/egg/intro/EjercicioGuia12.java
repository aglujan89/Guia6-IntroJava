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
public class EjercicioGuia12 {

//Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
//segundo, sino informe que no lo son.
    
    /**
     * @param num1
     * @param num2
     * @return 
     */
    
    public static String EsMultiplo (int num1, int num2){
        String retorno;
        
        if (num1%num2==0){
           retorno = "Es multiplo.";
        } else {
            retorno = "No es multiplo.";
        }
        return retorno;
       }
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número.");   
       
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número.");
        int num2 = leer.nextInt();
        
        String retorno = EsMultiplo(num1,num2);
        System.out.println(retorno);
        
    }
    
}
