package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); //Llamamos al constructor
        persona1.nombre = "Mateo";
        persona1.apellido = "Cirica";
        persona1.obtenerInformacion();

        Persona persona2 = new Persona();
        System.out.println("persona2 = "+persona2);
        System.out.println("persona1 = "+persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "Joaquin";
        persona2.apellido = "Cirica";
        persona2.obtenerInformacion();
    }
}
