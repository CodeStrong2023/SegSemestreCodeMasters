/*Pedir un número N y mostrar todos los números del 1 al N.
 */
package Ciclos8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
                int numero = Integer.parseInt(entrada.nextLine());
                int i = 1;
                while ( i <= numero) {
                    System.out.println(i);
                    i++;
                }
    }
    
}
