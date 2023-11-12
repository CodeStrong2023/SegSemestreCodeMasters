
package clase7;

/*
EJERCICIO N12:
Pedir un número y calcular su factorial.
*/

import java.util.Scanner;

public class EJERCICIO12 {
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
         long factorial = 1;
         
         System.out.println("Ingrese un número: ");
         int num = Integer.parseInt(entrada.nextLine());
         
         for (int i=1; i<=num; i++) {
             factorial *=i;
         }
         System.out.println("El factorial del número " + num + " es: " +factorial);
    }
}
