
package clase3;

/*
EJERCICIO N4:
Realizar un juego para adivinar un número, para ello generar un número aleatorio entre
0-100, y luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayoe
o menor con respecto a N. El proceso termina cuando el usuario acierta y mostarmos el número
de intentos hechos.
*/

import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, aleatorio, conteo = 0;
        aleatorio = (int) (Math.random()*100);
        
        do{
            System.out.println("Ingrese un número: ");
            num = Integer.parseInt(entrada.nextLine());
            if(num < aleatorio) {
                System.out.println("Ingrese un núemro mayor: ");
            }
            else if(num > aleatorio){
                System.out.println("Ingrese un número menor: ");
            }
            else{
                System.out.println("¡Felicidades, has adivinado el número!");
            }
            conteo++;
        }while (num != aleatorio);
        System.out.println("Adivinaste en: "+ conteo +" intentos.");
    }
    
}
