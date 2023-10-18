
package test;

import dominio.Persona;

public class PersonaPruba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Julieta", 57.000, false);
        
     //Modificar a travéz de los metodos   
     persona1.setNombre("Erica Aguilera");
     //persona1.nombre = "Erica Aguilera"; //ya no se puede utilizar
     //System.out.ptintln("Nombre es:"+persona1.nombre); //Error
        System.out.println("persona1 su nombre modificado es: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo es: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
    }
}
