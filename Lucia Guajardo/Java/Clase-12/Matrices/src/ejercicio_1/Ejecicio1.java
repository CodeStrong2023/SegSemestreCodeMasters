/*
 Ejecicio 1: Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla.
 */
package ejercicio_1;

import java.util.Scanner;

public class Ejecicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][] = new int [3][3];
        
        System.out.println("Rrellenar la matriz: ");
        for(int i = 0; i <3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
        }
        }
        System.out.println("Matriz original");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.println(matriz[i][j]+" ");
            }
        }
    }
}
