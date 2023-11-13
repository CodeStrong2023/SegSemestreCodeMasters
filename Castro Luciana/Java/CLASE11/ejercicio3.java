
package CLASE11;

/*
Ejercicio 3:
Leer 5 números por teclado, almacenarlos en un arreglo y a continuación
realizar la media de los números positivos, la media de los negativos y contar
el número de ceros.
*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        float negativos=0, positivos=0, mediaN, mediaP;
        int conteo0=0; 
        int conteoN = 0;
        int conteoP = 0;
        
          for(int i=0; i<5; i++) {
            System.out.println("Ingrese un número: ");
            numeros[i] = entrada.nextFloat();
            if(numeros[i]>0) {
                positivos += numeros[i];
                conteoP++;
            }
            else if(numeros[i]<0) {
                negativos += numeros[i];
                conteoN++;
            }
            else {
                conteo0++;
            }
          }
          
          if(conteoP == 0) {
              System.out.println("No se puede calcular la media de los números positivos.");
          }
          else {
              mediaP = positivos/conteoP;
              System.out.println("La media de los números positivios es: " + mediaP);
          }
          
         if(conteoN == 0) {
              System.out.println("No se puede sacar la media de los números negativos. ");
          }
          else {
              mediaN = negativos/conteoN;
              System.out.println("La media de los números positivios es: " + mediaN);
          }
         
         System.out.println("La cantidad de ceros es: " + conteo0);
    }
}
