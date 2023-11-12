
package clase3;

import javax.swing.JOptionPane;

public class EJERCICIO4ENswing {
    public static void main(String[] args) {
         int num, aleatorio, conteo = 0;
        aleatorio = (int) (Math.random()*100);
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            if(num < aleatorio) {
                 JOptionPane.showMessageDialog(null, "Ingrese un número mayor:");
            }
            else if(num > aleatorio){
                 JOptionPane.showMessageDialog(null, "Ingrese un número menor:");
            }
            else{
                 JOptionPane.showMessageDialog(null, "¡Felicidades, has adivinado el número!");
            }
            conteo++;
        }while (num != aleatorio);
         JOptionPane.showMessageDialog(null, "Adivinaste en: "+ conteo +" intentos.");
    }
}
