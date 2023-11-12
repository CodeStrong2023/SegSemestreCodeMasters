
package segundo.semestre;

/*
EJERCICIO N°3: Leer números hasta que se introduzca un cero.
Para cada uno indicar si es par o impar.
Primero con Scanner y segundo con JoptionPage
*/
import java.util.Scanner;

public class clase3 {
    public static void main(String[]args){
  
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = Integer.parseInt(entrada.nextLine());
            
        while(num!=0){
            if(num % 2 == 0){
                System.out.println("El número "+num+" es Par.");
            }
            else { 
                System.out.println("El número "+num+" es Impar.");
            }
            System.out.println("Ingrese otro número: ");
            num= Integer.parseInt(entrada.nextLine());
        System.out.println("El número "+num+" finaliza el programa.");
        }
    } 
}