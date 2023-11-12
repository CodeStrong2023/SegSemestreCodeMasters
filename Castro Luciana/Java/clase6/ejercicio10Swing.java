
package clase6;

import javax.swing.JOptionPane;

public class ejercicio10Swing {
    
    public static void main(String[] args) {
         int num, suma = 0;
         
        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            suma += num;
        } 
        
        JOptionPane.showMessageDialog(null,"La suma de todos los números es: "+suma);
    }
}
