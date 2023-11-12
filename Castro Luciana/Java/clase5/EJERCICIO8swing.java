
package clase5;

import javax.swing.JOptionPane;

public class EJERCICIO8swing {
    public static void main(String[] args) {
          int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
                int i = 1;
                while ( i <= numero) {
                     JOptionPane.showMessageDialog(null, i);
                    i++; 
                }
    }
}
