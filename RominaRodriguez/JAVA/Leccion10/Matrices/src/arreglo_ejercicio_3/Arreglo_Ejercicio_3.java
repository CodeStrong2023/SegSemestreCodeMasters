/*
Ejercicio 3: Leer 5 números por teclado, almacenar en un
arreglo y a continuación realizar la media de los números
positivos, la media de los negativoa y contar el número de ceros
*/
package arreglo_ejercicio_3;

import java.util.Scanner;

public class Arreglo_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[]=new float[5];
        float negativos=0, positivos=0,mediaNegativos,mediaPositivos;
        int conteo0=0,conteo_negativos=0,conteo_positivos=0;
        
        System.out.println("Guardamos los elementos del arreglo");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+". Digite un número: ");
            numeros[i]=entrada.nextFloat();
            if(numeros[i]>0){
                positivos += numeros[i];
                conteo_positivos++;
            }
            else{
                conteo0++;
            }
        }
        if(conteo_positivos == 0){
            System.out.println("\nNo se puede sacar la media de los números positivos");
        }
        else{
            mediaPositivos = positivos/conteo_positivos;
            System.out.println("\nLa media de los positivos es: "+mediaPositivos);
        }
        if(conteo_negativos == 0){
            System.out.println("\nNo se puede sacar la media de los números negativos");
        }
        else{
            mediaNegativos = negativos/conteo_negativos;
            System.out.println("La media de los números negativos e: "+mediaNegativos);
        }
        System.out.println("La cantidada de ceros es: "+conteo0);
        //Ingresar:2,-5,6,-2,0
        
    }
}
