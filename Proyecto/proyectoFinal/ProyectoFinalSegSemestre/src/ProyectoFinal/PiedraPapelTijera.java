package ProyectoFinal;

import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {
        //Se crea una clase Scanner para leer los datos introducidos por teclado
        Scanner input = new Scanner(System.in);
        String respuesta = "si";
        // Se utiliza un ciclo while para el desarrolo del juego
        while (respuesta.equalsIgnoreCase("si")) {
            // Imprimir una línea en blanco para dar formato a la salida
            System.out.println(" ");
            // Imprimir el mensaje de inicio de la ronda
            System.out.println("Ronda 1");
            // Imprimir instrucciones para el jugador
            System.out.println("Elije una opción:");
            System.out.println(" ");
            System.out.println("1. para Piedra");
            System.out.println("2. para Papel");
            System.out.println("3. para Tijera");
            
            // Leer la elección del jugador desde la entrada Scanner
            int jugadaJugador;
            // Verificar que  la entrada del jugador sea la opción valida
            while (!input.hasNext()) {//se utiliza para verificar si hay más datos disponibles en el flujo de entrada.
                System.out.println("Por favor, elige una opción.");
                input.nextLine();
            }
            // Almacenar la elección del jugador como un entero
            jugadaJugador = input.nextInt();
            // Limpiar el búfer de entrada esto elimina caracteres no deseados o líneas en blanco que puedan quedar en el búfer de entrada después de leer datos
            input.nextLine(); 
            
            //Generar una jugada aleatoria para computadora en un rango [1,3]
            int jugadaComputadora = (int) (Math.random() * 3) + 1;
            // Imprimir una línea en blanco para dar formato a la salida
            System.out.println(" ");
            //Imprimimos la elección del jugador
            System.out.println("Elegiste " + jugadaJugador);
            // Imprimimos la opción elegida por el jugador a partir de su número
            System.out.println("Jugador elige: " + opcion(jugadaJugador));
            // Imprimimos la opción de computadora a partir del número aleatorio
            System.out.println("Computadora elige: " + opcion(jugadaComputadora));
            
            // Comparamos la jugada del jugador con la jugada de la computadora
            int resultado = comparar(jugadaJugador, jugadaComputadora);
            // Verificamos el resultado y mostramos un mensaje en función de quién gana o si hay un empate
            if (resultado == 0) {
                System.out.println("Empate en esta ronda.");
            } else if (resultado == 1) {
                System.out.println("Jugador gana esta ronda.");
            } else {
                System.out.println("Computadora gana esta ronda.");
            }

            System.out.println(" ");
            // Imprimimos el mensaje de la segunda ronda
            System.out.println("Ronda 2");
            // Muestra las opciones para el jugador
            System.out.println("Elije una opción:");
            System.out.println(" ");
            System.out.println("1. para Piedra");
            System.out.println("2. para Papel");
            System.out.println("3. para Tijera");
            
            // Verificar que  la entrada del jugador sea la opción valida
            while (!input.hasNext()) {
                System.out.println("Por favor, elige una opción.");
                input.nextLine();
            }
            // Almacenar la elección del jugador como un entero
            jugadaJugador = input.nextInt();
            input.nextLine(); // Limpiar el búfer de entrada
            // Generar la jugada de la computadora
            jugadaComputadora = (int) (Math.random() * 3) + 1;
            System.out.println(" ");
             // Muestra las jugadas del jugador y la computadora
            System.out.println("Elegiste " + jugadaJugador);
            System.out.println("Jugador elige: " + opcion(jugadaJugador));
            System.out.println("Computadora elige: " + opcion(jugadaComputadora));
            // Compara las jugadas y muestra el resultado de la ronda
            resultado = comparar(jugadaJugador, jugadaComputadora);
            if (resultado == 0) {
                System.out.println("Empate en esta ronda.");
            } else if (resultado == 1) {
                System.out.println("Jugador gana esta ronda.");
            } else {
                System.out.println("Computadora gana esta ronda.");
            }

            System.out.println(" ");
            // Se imprime el mensaje de la tercer vuelta
            System.out.println("Ronda 3");
            System.out.println("Elije una opción:");
            System.out.println(" ");
            System.out.println("1. para Piedra");
            System.out.println("2. para Papel");
            System.out.println("3. para Tijera");
            // Verificar que  la entrada del jugador sea la opción valida
            while (!input.hasNext()) {
                System.out.println("Por favor, elige una opción.");
                input.nextLine();
            }
            // Almacenar la elección del jugador como un entero
            jugadaJugador = input.nextInt();
            input.nextLine(); // Limpiar el búfer de entrada
            
            // Generar la jugada de la computadora
            jugadaComputadora = (int) (Math.random() * 3) + 1;
            System.out.println(" ");
            System.out.println("Elegiste " + jugadaJugador);
            System.out.println("Jugador elige: " + opcion(jugadaJugador));
            System.out.println("Computadora elige: " + opcion(jugadaComputadora));

            // Compara las jugadas y muestra el resultado de la ronda
            resultado = comparar(jugadaJugador, jugadaComputadora);
            if (resultado == 0) {
                System.out.println("Empate en esta ronda.");
            } else if (resultado == 1) {
                System.out.println("Jugador gana esta ronda.");
            } else {
                System.out.println("Computadora gana esta ronda.");
            }

            System.out.println(" ");
            // Se imprime resultado final
            System.out.println("--- Resultado Final ---");
            // Creamos unas variables para almacenar los puntos
            int puntosJugador = 0;
            int puntosComputadora = 0;
            // Incrementar los puntos según el resultado de la comparación
            if (comparar(jugadaJugador, jugadaComputadora) == 1) {
                 // Jugador gana
                puntosJugador++;
            } else if (comparar(jugadaJugador, jugadaComputadora) == -1) {
                // Computadora gana
                puntosComputadora++;
            }
            // Repite el proceso dos veces más, ya que hay tres comparaciones en total
            if (comparar(jugadaJugador, jugadaComputadora) == 1) {
                puntosJugador++;
            } else if (comparar(jugadaJugador, jugadaComputadora) == -1) {
                puntosComputadora++;
            }
            if (comparar(jugadaJugador, jugadaComputadora) == 1) {
                puntosJugador++;
            } else if (comparar(jugadaJugador, jugadaComputadora) == -1) {
                puntosComputadora++;
            }
            // Se imprime el resultado de los puntos tanto de jugador como de computadora
            System.out.println("Puntos del Jugador: " + puntosJugador);
            System.out.println("Puntos de la Computadora: " + puntosComputadora);
            // Se comparan los puntos para saber quiémn gana o si hay empate
            if (puntosJugador > puntosComputadora) {
                System.out.println("¡Jugador gana el juego!");
            } else if (puntosJugador < puntosComputadora) {
                System.out.println("¡Computadora gana el juego!");
            } else {
                System.out.println("El juego termina en empate.");
            }
            // Pregunta al usuario si desea jugar de nuevo
            System.out.print("¿Quieres jugar de nuevo? (si o no): ");
            if (input.hasNext()) {
                respuesta = input.next();
            } else {
                respuesta = "";
            }
            System.out.println();
            input.nextLine(); // Limpiar el búfer de entrada después de la respuesta
            // Fin de la ronda, continuará si el usuario quiere jugar de nuevo
        }
    }

    public static String opcion(int jugada) {
        // Convierte el número de jugada en una cadena descriptiva
        String opcion = "";
        switch (jugada) {
            case 1 -> opcion = "Piedra";
            case 2 -> opcion = "Papel";
            case 3 -> opcion = "Tijera";
        }
        return opcion;
    }

    public static int comparar(int jugadaJugador, int jugadaComputadora) {
        // Compara las jugadas del jugador y la computadora
        if (jugadaJugador == jugadaComputadora) {
            return 0;// Empate
        } else if ((jugadaJugador == 1 && jugadaComputadora == 3) || (jugadaJugador == 2 && jugadaComputadora == 1)
                || (jugadaJugador == 3 && jugadaComputadora == 2)) {
            return 1;// Jugador gana
        } else {
            return -1;// Computadora gana
        }
    }

}

