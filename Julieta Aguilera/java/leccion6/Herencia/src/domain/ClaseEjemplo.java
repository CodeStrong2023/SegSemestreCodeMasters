
package domain;

public class ClaseEjemplo {
    public ClaseEjemplo(){
    }
    
    public String getNameAndLastName(){
        int numero = 10; 
        Persona persona = new Persona();
        String nombreapellido = persona.getNombre() +" "+persona.getApellido();
        return nombreapellido;
        
    }
}
