
package Ciclos12;


import java.util.Scanner;

public class Ciclos12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular su factorial: ");
        int num = scanner.nextInt();
        int factorial = 1;
        if (num < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            for(int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }
        System.out.println("El factorial de "+num +" es: "+factorial);
    }
}

