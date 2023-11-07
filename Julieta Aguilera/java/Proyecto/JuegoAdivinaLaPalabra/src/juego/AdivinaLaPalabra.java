
package juego; //creacion de paquete

import java.util.Scanner; //importaciones 

public class AdivinaLaPalabra { //Declarar la clase 
    public static void main(String[] args){ //metodo principal
        
    //Declaracion de variables
    Scanner scanner = new Scanner(System.in); //crea un objeto sacanner para obtener la entrada del usuario
    
    String palabra, palabra2, pista; // declaracion de tres variables de tipo String 
    System.out.println("Bienvenido a Adivina la palabra"); //imprime un mensaje
    System.out.println("Aclaracion: La palabra que elijas debes escribirla con la inicial en mayúscula y con su respectivo tilde si lo requiere."); //imprime un mensaje
    
    //Obtencion de entrada del usuario
    System.out.println("Ingrese la palabra que el otro usuario adivinará: ");//imprime un mensaje 
    palabra = scanner.nextLine(); //lee la palabra ingresada y la almacena en la variable "palabra"
    
    System.out.println("Ingrese la pista: ");//imprime un mensaje 
    pista = scanner.nextLine();//lee las palabras ingresadas y la almacena en la variable "pista"
    
    //Limpieza de pantalla
    System.out.println("\n\n\n\n\n\n\n"); //imprime varias lineas en blanco para "limpiar" la pantalla
    System.out.println("La pista es: "+pista); //muestra la pista
    
    System.out.println("A continuacion ingrese la palabra: "); //imprime un mensaje
    palabra2 = scanner.nextLine();//lee la palabra ingresada y la almacena en la variable "palabra2"
    
    //Veriicacion de respuesta
    //Compara la palabra ingresada por el segundo usuario con la palabra original. si son iguales, se imprime un mensaje de felicitaciones
    //sino imprime un mensaje de "perdiste".
    
    if(palabra2.equals(palabra)){ //estructura if
        //Si la palabra ingresada es correcta se ejecutara lo siguiente:
        System.out.println("Â¡FELICIDADES, GANASTE!");
    }
    else{
        System.out.println("PERDISTE");
    }
    
    }
}
