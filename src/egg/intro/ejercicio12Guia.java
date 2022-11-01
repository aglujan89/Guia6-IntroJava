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
public class ejercicio12Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ok = 1;
        int nook = -1;
        String frase;
        do {
            System.out.println("Ingrese una frase de 5 digitos de que inicie en X y termine en O");
            frase = leer.next();
            if (frase.substring(0, 1).equals("X") && frase.substring(4, 5).equals("O") && frase.length() == 5) {
                ok++;
            } else {
                nook++;
            }

        } while (!frase.equals("&&&&&"));
    
        System.out.println("La cantidad de secuencias correctas es de " + ok + " Y la cantidad de secuencias incorrectas es de: "+ nook);
}
}

