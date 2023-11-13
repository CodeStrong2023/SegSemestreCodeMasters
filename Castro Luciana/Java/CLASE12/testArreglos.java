
package CLASE12;

import domain.persona;

public class testArreglos {
    public static void main(String[] args) {
        
        persona personas[] = new persona[2];
        personas[0] = new persona("Luciana");
        personas[1] = new persona("Lucia");
        
        System.out.println("personas 0: "+personas[0]);
        System.out.println("personas 1: "+personas[1]);
        
        for(int i = 0; i < personas.length; i++) {
            System.out.println("personas " +i+": "+personas[i]);
        }

        String frutas[] = {"Frutilla", "Kiwi"};
        for(int i = 0; i < frutas.length; i++) {
            System.out.println("frutas "+i+" = "+frutas[i]);
        } 
    }
}
