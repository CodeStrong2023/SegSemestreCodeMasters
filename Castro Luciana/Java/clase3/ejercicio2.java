
package clase3;

/*
EJERCICIO N°3: Leer números hasta que se introduzca un cero.
Para cada uno indicar si es par o impar.
Primero con Scanner y segundo con JoptionPage
*/

import javax.swing.JOptionPane;

public class ejercicio2 {
    public static void main(String[] args) {
         int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while(num!=0){
            if(num % 2 == 0){
                JOptionPane.showMessageDialog(null, "El número "+num+" es Par.");
            }
            else { 
                 JOptionPane.showMessageDialog(null, "El número "+num+" es Impar.");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        }
        JOptionPane.showMessageDialog(null, "El número "+num+" finaliza el programa.");
    }
}



