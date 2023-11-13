
package CLASE10;

/*
Uso de la palabra final. Esta palabra tiene diferentes significados dependiendo donde se aplique:
Variables: Evita cambiar el valor que almacena la variable.
Métodos: Evita que se modifique la definición o el comportamiento de un método desde una subclase (hija).
Clases: Evita que se creen clses hijas.
Otras carecterísticas es que normalmente, cuando trabajamos con variables se combina con el modificasor se acceso estático para convertir una variable en una constante, 
es decir que no se puede modificar su valor, el ejemplo de esto es la clase Math en la cuál todos sus atributos son de tipo estatic y final, 
es por esto que la variable pi* se conoce como una constatnte.
*/

import domain.Persona;

public class test {
    public static void main(String[] args) {
        final int miDni = 43353563;
        
        System.out.println("mi DNI: "+miDni);
        
        //DNI = 43353563 No se puede modificar
        //Persona.CONSTATNTE_AQUI = 9 No se modifica
        
        System.out.println("Mi atributo constante es: "+Persona.CONSTATNTE_AQUI);
        
        final Persona persona1= new Persona();
        //persona1 = new Persona(); No se puede asignar una nueva referencia
        
        persona1.setNombre("Luciana Castro");
        
        System.out.println("persona1 nombre: "+persona1.getNombre());
        persona1.setNombre("Micaela");
         
        System.out.println("persona1 nombre: "+persona1.getNombre());
    }
}
