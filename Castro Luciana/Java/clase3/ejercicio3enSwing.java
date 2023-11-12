
package clase3;

/*
EJERCICION3: Pedir números hasta que se teclee uno negativo,
y mostrar cuántos números se han introducido. 
*/

import javax.swing.JOptionPane;

public class ejercicio3enSwing {
    public static void main(String[] args) {
         int num, conteo = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        conteo++;
        while (num >= 0) {
             JOptionPane.showMessageDialog(null, "El número "+ num +" es Positivo.");
            conteo++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        }
         JOptionPane.showMessageDialog(null, "Se han ingresado "+ conteo +" números.");
    }
}
