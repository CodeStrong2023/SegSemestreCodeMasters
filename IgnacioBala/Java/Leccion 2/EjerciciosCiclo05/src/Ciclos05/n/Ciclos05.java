
package Ciclos05.n;

import java.util.Scanner;


public class Ciclos05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,aleatorio, conteo = 0 ;
        aleatorio = (int)(Math.random()*100); //Estop genera un número aleatorio
        do{
            
            System.out.println("Digite un número:");
            numero = Integer.parseInt(entrada.nextLine());
            if(numero<aleatorio){
                System.out.println("Digite un número mayor ");
                
            }
            else if(numero>aleatorio){
                System.out.println("Digite un número menor");
            }
            else{
                System.out.println("Felicidades has adivinado el numero");
                
            }
            conteo++ ;
            
        }while(numero!=aleatorio);
        System.out.println("Adivinaste el número en : " +conteo+ "intentos");
        
    }
}
