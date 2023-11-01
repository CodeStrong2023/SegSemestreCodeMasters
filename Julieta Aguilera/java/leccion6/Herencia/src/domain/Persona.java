
package domain;

public class Persona {
    //Atributos de herencia
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    
    //Constructor vacio: este es para crear objetivos sin necesidad de inizializar
    //los atributos de la clase 
    public Persona(){ //constructor 1
        
    }
    
    public Persona (String nombre){ //constructor 2
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {//Constructor 3
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    
    
    
}
