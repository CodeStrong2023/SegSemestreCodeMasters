
package clase6;

/*
Pedir 10 números y escribir la suma.
*/

import java.util.Scanner;

public class ejercicio10 {
    
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, suma = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese un número: ");
            num = Integer.parseInt(entrada.nextLine());
            suma += num;
        } 
        
        System.out.println("La suma de todos los números es: "+suma);
    }
}
