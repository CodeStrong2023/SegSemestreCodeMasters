
package test;

import domain.ClaseEjemplo;
import domain.Empleado;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Julieta", 57000.00);
        //System.out.println("empleado1 = " + empleado1);
        ClaseEjemplo claseEjemplo = new ClaseEjemplo();
        System.out.println("Nombre y Apellido: " + claseEjemplo.getNameAndLastName());
    }
    
}
