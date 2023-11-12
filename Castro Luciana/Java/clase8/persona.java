
package clase8;


public class persona {
    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        contadorPersona = contadorPersona;
    }
    
    private int idPersona;
    private static int contadorPersona;
    private String nombre;
    
    public persona(String nombre) {
        this.nombre = nombre;
       persona.contadorPersona++;
        this.idPersona = persona.contadorPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona " + " idPersona: " + idPersona + ", nombre: " + nombre;
    }
    
}
