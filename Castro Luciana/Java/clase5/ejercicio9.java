
package clase5;

/*
EJERCICIO 9:
Pedir el día, mes y año de una fecha e indicar
si la fecha es correcta,Suponiendo que todos los meses 
son de 30 días.
*/

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el día: ");
        int dia = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese el número de mes: ");
        int mes = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese el año: ");
        int año = Integer.parseInt(entrada.nextLine());
        
        if((dia != 0)&&(dia <= 30)) {
            if((mes != 0)&&(mes <= 12)) {
                if ((año != 0)&&(año <= 2022)) {
                    System.out.println("La fecha ingresada es: " + dia + "/"+ mes +"/" + año);
                }
                else {
                    System.out.println("Año incorrecto.");
                }
            }
            else {
                System.out.println("Mes incorrecto.");
            }
        }
        else {
            System.out.println("Fecha incorrecta.");
        }
    }
}
