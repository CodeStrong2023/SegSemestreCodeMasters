
package clase9;

public class clase9 {
   public clase9(){
    }
    
    public String getNameAndLastName(){ 
        persona persona = new persona();
        String nombreapellido = persona.getNombre() +" "+persona.getApellido();
        return nombreapellido;
        
    } 
}
