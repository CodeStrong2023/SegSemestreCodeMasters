/*
Ejercicio 1: Leer 5 numeros, guardarlos en un arreglo y
mostrarlos en el mismo orden introducidos.
*/
package arreglos_ejercicio_1;

import java.util.Scanner;

public class Arreglos_Ejercicio_1 {
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float[] arreglo = new float[5];
    
    System.out.println("Guardamos los datos en el arreglo");
        for(int i = 0; i < 5; i++){
            System.out.println((i+1)+". Digite los datos del arreglo");
            arreglo[i] = entrada.nextFloat();
        }
    System.out.println("\nImprimir los elementos del arreglo");
        for(float i:arreglo){
            System.out.println(i+ " ");   
        }
        System.out.println("\n");
    }
    
}
