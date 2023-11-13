
package CLASE11;

/*
Ejercicio N2:
lEER 5 NÚMEROS, guardarlos en un arreglo y mostrarlos en el orden inverso al introducirlos.
*/

import java.util.Scanner;

public class ejercicio2 {
      public static void main(String[] args) {
          
        Scanner entrada = new Scanner(System.in);
        
        float[] num = new float[5];
         for(int i=0; i<5; i++) {
             System.out.println("Ingrese un número: ");
            num[i] = entrada.nextFloat();
         }
         
         for(int i=4; i>=0; i--) {
             System.out.println(i+" " + num[i]);
    }
         System.out.println("\n");
    }
}
