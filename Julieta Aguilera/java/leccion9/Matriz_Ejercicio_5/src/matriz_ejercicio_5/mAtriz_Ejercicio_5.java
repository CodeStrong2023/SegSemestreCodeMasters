/*
Ejercicio5: crear y cargar matriz de tamaño n x m, mostrar la suma 
de cada fila y cada columna*/

package matriz_ejercicio_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class mAtriz_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][], nFilas, nCol, sumaFilas, sumaCol;
        int posFinal,posCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz = new int [nFilas][nCol];
        int filas[] = new int [nFilas];
        int columnas[] = new int [nCol];
        
        System.out.println("Rellenando la matriz: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.println("Matriz ["+i+"]["+j+"]");
                matriz[i][j]= entrada.nextInt();
            }
        }
        
        System.out.println("\nMatriz original: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.println(matriz[1][j]+"");
            }
            System.out.println("");
            
            
            //Sumando las filas
            posFila = 0;
            for(int i=0; j<nCol; j++){
                sumaCol = 0;
                
            }
        }
    }
}
