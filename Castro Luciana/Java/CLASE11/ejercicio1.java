
package CLASE11;

/*
Ejercicio 1:
Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido.
*/

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] arreglo = new float[5];
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Ingrese un número: ");
            arreglo[i] = entrada.nextFloat();
        }

        for(float i:arreglo) {
            System.out.println(i+" ");
        }
        System.out.println("\n");
    }
}
