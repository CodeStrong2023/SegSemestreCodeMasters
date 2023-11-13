/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro; //Importación
    private boolean vip;
    private static int contadoClientes;
    
    //Constructor
    public Cliente(Date fechaRegistro, boolean vip, String nombre,
            char género, int edad, String dirección){
        super(nombre, género, edad, dirección);
        this.idCliente = ++Cliente.contadoClientes;
        this.fechaRegistro =fechaRegistro;
        this.vip = vip;
        
    }

    public int getIdCliente() {
        return this.idCliente;
    }

 

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
         sb.append(", vip=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
