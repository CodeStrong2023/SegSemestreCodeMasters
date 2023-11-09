/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo donde 
se aplique:
    variables:Evita cambir el valor que almacena la varieble 
    métodos:Evita que se modifique la definicion o el comportamiento
            de un método desde una subclase (hija)
    clases: Evita que se cree clases hijas 
Otra caracteristica es que normalmente, cuando trabajamos con variables
se combina con el modificador de acceso estatico para convertir una 
variable es una contante, es decir que no se pueden modificar su valor,
el ejemplo de esto es la clase Math en la cual todos sus atributos
son de tipo static y final, es por esto que la varible pi* se conoce
como una constante.
*/

package test;

import domain.Persona;

public class Testfinal {
    public static void main(String[] args) {
        final int miDni = 45142384;
        System.out.println("miDni = " + miDni);
        //miDni = 45142385; No se puede modificar
        //Persona.CONSTANTE_AQUI = 9; No se modiica 
        System.out.println("Mi atributo es:" +Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); No se puede asignar una nueva referencia
        persona1.setNombre("Julieta Aguilera");
        System.out.println("persona1 nombre: "+ persona1.getNombre());
        persona1.setNombre("Rosi");
        System.out.println("persona1 nombre: "+persona1.getNombre());
        
    }
}
