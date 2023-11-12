
package clase9;

public class persona {
    
    //Atributos de herencia
    
    protected String nombre = "Luciana";
    protected char genero;
    protected int edad;
    protected String direccion;
    private String apellido = "Castro";
    
    //Constructor vacio es para crear objetivos sin inizializar los atributos de la clase 
    
    public persona(){ //constructor 1
        
    }
    
    public persona (String nombre){ //constructor 2
        this.nombre = nombre;
    }

    public persona(String nombre, char genero, int edad, String direccion) { //Constructor 3
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", apellido=").append(apellido);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
