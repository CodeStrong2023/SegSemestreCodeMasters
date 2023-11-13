
package test;
import dominio.Persona;

public class personPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ignacio", 97.000,true);
        System.out.println("persona1 = " + persona1);
          System.out.println("persona1 su npmbre es:"+persona1.getNombre());
        //Modificar a través de los métodos 
            persona1.setNombre("Juan Ignacio");
            //Persona1.nombre = "Juan Ignacio"; ya no
            System.out.println("persona1 con su nombre modificado es:"+persona1.getNombre());
              System.out.println("persona1 su sueldo es:"+persona1.getSueldo());
              System.out.println("persona1 obtener el booleano :"+persona1.isEliminado());
            System.out.println("persona1 = " + persona1);
              
    }
}
        

