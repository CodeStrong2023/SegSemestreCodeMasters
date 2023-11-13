
package domain;

public class Empleado extends Persona{
    @Override
    public final void imprimir(){
        System.out.println("Metodo imprimir desde la clase hija");
    }
}
