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
public class Ej_ExtraJava10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
//dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
//si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
//al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
//utilizar la función Math.random() de Java
        Scanner leer = new Scanner(System.in);
        int n,m,res,ad;
        n=(int) (Math.random()*10);
        m=(int) (Math.random()*10);
        boolean correcta=false;
        res=n*m;
        while(!correcta){
            System.out.println("Adivine el resultado de la multiplicacion: ");
            ad=leer.nextInt();
            if(ad==res){
                correcta=true;
                System.out.println("Adivinaste! El resultado es: "+res);                
            }
            else
            {
                System.out.println("No has adivinado...");
            }
            
        }
    }
    
}
