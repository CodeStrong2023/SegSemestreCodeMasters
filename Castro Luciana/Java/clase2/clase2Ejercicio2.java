
package clase2;

import javax.swing.JOptionPane;

public class clase2Ejercicio2 {
    public static void main(String[]args){
        
        int num2;
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(num2 != 0){
            if(num2 > 0){
                JOptionPane.showMessageDialog(null, "El número: "+ num2+" es POSITIVO");
            }
            else{
                JOptionPane.showMessageDialog(null,"El número: "+ num2+" es NEGATIVO");
            }
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: ")); 
        }
        JOptionPane.showMessageDialog(null,"El número "+ num2+" finaliza el programa.");
    }
    
}
