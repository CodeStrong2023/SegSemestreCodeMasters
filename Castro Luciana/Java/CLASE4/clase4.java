
package segundo.semestre;

/*
EJERCICIO N6:
Pedir numeros hasta que se teclee un 0,
mostrar la suma de todo los números introducidos.
*/

import java.util.Scanner;

public class clase4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, suma = 0;
        do{
            System.out.println("Ingrese un número: ");
            num = Integer.parseInt(entrada.nextLine());
            suma+= num;
        }while(num != 0);
        System.out.println("La suma de los números es: "+suma);
    }
}
