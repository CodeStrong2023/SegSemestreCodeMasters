package Tateti;

import java.util.Scanner;

public class tateti {
    private static char[][] tablero = new char[3][3];
    private static char jugadorActual = 'X';

    public static void main(String[] args) {
        inicializarTablero();
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            mostrarTablero();
            int[] movimiento = obtenerMovimientoJugador();
            int fila = movimiento[0];
            int columna = movimiento[1];

            if (esMovimientoValido(fila, columna)) {
                realizarMovimiento(fila, columna);
                if (verificarGanador()) {
                    mostrarTablero();
                    System.out.println("¡Jugador " + jugadorActual + " gana!");
                    juegoTerminado = true;
                } else if (tableroCompleto()) {
                    mostrarTablero();
                    System.out.println("¡Empate!");
                    juegoTerminado = true;
                } else {
                    jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Movimiento inválido. Inténtalo de nuevo.");
            }
        }
    }

    private static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    private static void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private static int[] obtenerMovimientoJugador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador " + jugadorActual + ", ingresa tu movimiento (fila y columna): ");
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();
        return new int[]{fila, columna};
    }

    private static boolean esMovimientoValido(int fila, int columna) {
        return (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ');
    }

    private static void realizarMovimiento(int fila, int columna) {
        tablero[fila][columna] = jugadorActual;
    }

    private static boolean verificarGanador() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true;
            }
            if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                return true;
            }
        }
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true;
        }
        return tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual;
    }

    private static boolean tableroCompleto() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

