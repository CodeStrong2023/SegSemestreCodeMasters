
package CLASE10;

import operaciones.Operaciones;

public class testOperaciones {
    public static void main(String[] args) {
        
        int resultado = Operaciones.sumar(7,9);
        System.out.println("resultado: "+ resultado);
        
        int resultado2 = Operaciones.sumar(5.0, 7);
        System.out.println("resultado2: "+ resultado2);
        
        int resultado3 = Operaciones.sumar(8, 6L);
          System.out.println("resultado3: "+ resultado3);
    }
}
