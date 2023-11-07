package Ciclos12;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicios12 {
        public static void main(String[] args) {

            
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para calcular su factorial: "));
            int factorial = 1;
            if (num < 0) {
                JOptionPane.showMessageDialog(null, "El factorial no está definido para números negativos.");
            } else {
                for(int i = 1; i <= num; i++) {
                    factorial *= i;
                }
        }
        JOptionPane.showMessageDialog(null, "El factorial de "+num +" es: "+factorial);
    }
}
