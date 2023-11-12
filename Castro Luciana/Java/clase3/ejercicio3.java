
package clase3;

/*
EJERCICION3: Pedir números hasta que se teclee uno negativo,
y mostrar cuántos números se han introducido. 
*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, conteo = 0;
        System.out.println("Ingrese un número: ");
        conteo++;
        num = Integer.parseInt(entrada.nextLine());
        while (num >= 0) {
            System.out.println("El número "+ num +" es Positivo.");
            System.out.println("Ingrese otro número: ");
             num = Integer.parseInt(entrada.nextLine());
            conteo++;
        }
        System.out.println("Se han ingresado "+ conteo +" números.");
    }
}
