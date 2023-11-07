/*
 * Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros números impares
 * hacerlo con JOptionPane 
 */
package Ciclos11;

import javax.swing.JOptionPane;

public class Ciclos11 {
    public static void main(String[] args) {
        int producto = 1;
        for(int i = 1; i <= 20; i++){
            if (i % 2 == 1){
            producto *= i;
            }
        }
        JOptionPane.showMessageDialog(null, "El resultado final es: "+producto);
    }
}
