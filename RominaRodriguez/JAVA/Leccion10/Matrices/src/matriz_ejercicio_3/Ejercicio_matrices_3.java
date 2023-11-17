/*
Ejercicio 3: crear y cargar una matriz de tamaño 3*3,
transponerla y mostrarla
 */
package matriz_ejercicio_3;

import java.util.Scanner;

public class Ejercicio_matrices_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Rellenar la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz [" + i + "] [" + j + "]: ");
                matriz[i][j] = entrada.nextInt();

            }

        }
        System.out.println();
        System.out.println("Matriz original: ");
        visualizarMatriz(matriz);

        //Matriz Transpuesta
        System.out.println("Matriz transpuesta: ");
        visualizarMatriz(transponerMatriz(matriz));

    }
    public static void visualizarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Bucle para recorrer cada fila de la matriz
        for (int i = 0; i < filas; i++) {
            // Bucle para recorrer cada columna de la fila actual
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            // Salto de línea al final de cada fila
            System.out.println();
        }
    }

    // Función para obtener la matriz transpuesta
    public static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        return matrizTranspuesta;
    }
}
