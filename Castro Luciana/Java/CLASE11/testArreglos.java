
package CLASE11;

import domain.persona;

public class testArreglos {
    public static void main(String[] args) {
        
        persona personas[] = new persona[2];
        personas[0] = new persona("Lu");
        personas[1] = new persona("Nacho");
        
        System.out.println("persona 0: "+personas[0]);
        System.out.println("persona 1: "+personas[1]);
        
        for(int i = 0; i < personas.length; i++) {
            System.out.println("personas "+i+" : "+personas[i]);
        }
        
        String frutas[] = {"Pera", "Frutilla", "Kiwi", "Arandano"};
        
        for(int i = 0; i < frutas.length; i++) {
            System.out.println("frutas "+i+" = "+frutas[i]);
        } 
    }
}
