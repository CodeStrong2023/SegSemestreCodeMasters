package test;

import dominio.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Mateo", 57.000, false);
        System.out.println("personal su nombre es: "+persona1.getNombre());
        //Modificar a traves de los metodos
        persona1.setNombre("Joaquin");
        //persona1.nombre= "Joaquin"; //Ya no se puede utilizar
        //System.out.println("Nombre es: "+persona1.nombre); //Error
        System.out.println("persona1 con su nombre medificado: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        //Tarea: Crear otro objeto tipo persona, y asignar valores de manera inicial
        //e imprimir, luego modificar sus valores
    }
}
