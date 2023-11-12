
package clase7;

import javax.swing.JOptionPane;
        
public class ejercicio12Swing {
    public static void main(String[] args) {
         long factorial = 1;
         
         int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
         
         for (int i=1; i<=num; i++) {
             factorial *=i;
         }
           JOptionPane.showMessageDialog(null, "El factorial del número " + num + " es: " +factorial);
    }
}
