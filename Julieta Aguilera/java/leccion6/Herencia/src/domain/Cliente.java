
package domain;

import java.util.Date;

public class Cliente {
    //Atributos 
    private int idCliente;
    private Date fechaRegistro; //Import la clase Date
    private boolean vip; //Very important person
    private static int contadorCliente; //Tipo estatico
    
    //Constructor 
    public Cliente(Date fechaRegistro, boolean vip, String nombre,
            char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
    }
    
}
