/*Pedir 10 números y escribir la suma total.
 */
package ciclos10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese un número: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        } 
        System.out.println("La suma de todos los números es: "+suma);
    }
}
