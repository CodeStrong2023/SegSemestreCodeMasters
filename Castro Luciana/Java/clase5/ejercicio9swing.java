
package clase5;

import javax.swing.JOptionPane;

public class ejercicio9swing {
    public static void main(String[] args) {
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número de día: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número de mes: "));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año: "));
        
        if((dia != 0)&&(dia <= 30)) {
            if((mes != 0)&&(mes <= 12)) {
                if ((año != 0)&&(año <= 2022)) {
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es: " + dia + "/" + mes +"/" + año);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Año incorrecto.");
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Mes incorrecto.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Fecha incorrecta.");
        }
    }
}
