
package CLASE4;

import javax.swing.JOptionPane;

public class ejercicio6Swing {
    public static void main(String[] args) {
         int num, suma = 0;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            suma+= num;
        }while(num != 0);
         JOptionPane.showMessageDialog(null, "La suma de los números es: "+suma);
    }
}
