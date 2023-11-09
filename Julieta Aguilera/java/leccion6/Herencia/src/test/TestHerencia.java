
package test;

import domain.ClaseEjemplo;
import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Julieta", 57000.00);
        System.out.println("empleado1 = " + empleado1);
        ClaseEjemplo claseEjemplo = new ClaseEjemplo();
        System.out.println("Nombre y Apellido: " + claseEjemplo.getNameAndLastName());
        
//        Date fecha1 = new Date();
//        
//        Cliente cliente = new Cliente(fecha1, true, "Rosi", 'F', 22, "Villa Atuel");
//        System.out.println("cliente = " + cliente);
//        
//        Persona persona1 = new Persona();
    }
    
}
