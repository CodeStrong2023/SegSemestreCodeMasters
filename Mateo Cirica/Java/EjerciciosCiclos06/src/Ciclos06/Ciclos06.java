
package Ciclos06;

import java.util.Scanner;

public class Ciclos06 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        int numero, suma = 0;
        do{
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrance.nextLine());
            suma += numero;
        }while(numero != 0);
        System.out.println("\nLa suma de todos los numeros ingresados es: "+suma);

    }
}
