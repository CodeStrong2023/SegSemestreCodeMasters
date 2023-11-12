
package clase9;

import domain.clase9;
import domain.ejercicioCLIENTE;
import domain.empleado;
import java.util.Date;

public class herencia {
    public static void main(String[] args) {
        empleado empleado1 = new empleado("Luciana", 80000.00);
        System.out.println("empleado1 = " + empleado1);
        clase9 claseEjemplo = new clase9();
        System.out.println("Nombre y Apellido: " + claseEjemplo.getNameAndLastName());
        
        ejercicioCLIENTE cliente = new ejercicioCLIENTE(new Date(), true, "Carmen", 'F', 22, "San Rafael");
        System.out.println("cliente: " + cliente);
    }
}
