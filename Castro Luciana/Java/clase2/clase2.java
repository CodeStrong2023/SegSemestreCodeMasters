
package segundo.semestre;

import java.util.Scanner;

public class clase2 {
    public static void main(String[]args){
        
        // EJERCICIO N1: Leer un número y mostrar su cuadrado,repetir el proceso hasta que se introduzca un número negativo
        
        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado;
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){  
            cuadrado = (int)Math.pow(numero,2);
            System.out.println("El número: "+ numero+" elevado al cuadrado es: "+cuadrado);
            System.out.println("Digite otro número: ");
            numero =Integer.parseInt(entrada.nextLine());   
        }   
        System.out.println("El programa a finalizado. Usted a colocado un número negativo. ");
        
        // EJERCICION2: Leer un n{umero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un 0
        
        Scanner entrada2 = new Scanner(System.in);
        int num2;
        System.out.println("Digite un número: ");
        num2 = Integer.parseInt(entrada2.nextLine());
        while(num2 != 0){
            if(num2 > 0){
                System.out.println("El número: "+ num2+" es POSITIVO");
            }
            else{
                System.out.println("El número: "+ num2+" es NEGATIVO");
            }
            System.out.println("Digite otro número: ");
            num2 = Integer.parseInt(entrada.nextLine()); 
        }
        System.out.println("El número "+ num2+" finaliza el programa.");
    }     
}
