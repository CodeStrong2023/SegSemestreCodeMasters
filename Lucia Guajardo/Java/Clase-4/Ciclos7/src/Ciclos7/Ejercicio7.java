/*Pedir números hasta que se introduzca
uno negativo y calcular la media.
 */
package Ciclos7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Ingrese un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >=0) {
            suma += numero;
            conteo++;
            System.out.println("Ingrese otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if(conteo==0) {
            System.out.println("Error, la división entre cero no existe. ");
        }
        else{
            promedio = (float)suma/conteo;
            System.out.println("El promedio es: "+promedio);
        }
    }
    
}
