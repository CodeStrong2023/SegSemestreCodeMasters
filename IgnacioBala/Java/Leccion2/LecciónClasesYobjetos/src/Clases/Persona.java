/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Persona {
    //Atributos de la clase (Características)
    String nombre;
    String apellido;
    
    //Métodos de la clase(Acciones)
    public void obtenerInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido : " +apellido);
    }
    
}
