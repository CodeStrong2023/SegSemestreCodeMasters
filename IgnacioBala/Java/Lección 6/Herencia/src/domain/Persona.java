
package domain;


public class Persona {
    //Atributos de herencia
    protected String nombre;
    protected char Género;
    protected int edad;
    protected String dirección;
    //Constructor vacío este es para crear objetos sin necesidad de inicializar los atributos de la clase
    public Persona(){
        
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, char Género, int edad, String dirección) {
        this.nombre = nombre;
        this.Género = Género;
        this.edad = edad;
        this.dirección = dirección;
    }

    public String getDirección() {
        return this.dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGénero() {
        return this.Género;
    }

    public void setGénero(char Género) {
        this.Género = Género;
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
        sb.append(", G\u00e9nero=").append(Género);
        sb.append(", edad=").append(edad);
        sb.append(", direcci\u00f3n=").append(dirección);   
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

   
    }
    
    
    

