
package CLASE12;

import domain.persona;

public class testMatriz {
     public static void main(String[] args) {
        int edades [] [] = new int [3] [2];
        
        System.out.println("edades: " + edades);
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 9;
        edades[1][1] = 4;
        edades[2][0] = 2;
        edades[2][1] = 9;
        
        System.out.println("edades 0-0:" + edades[0][0]);
        System.out.println("edades 0-0:" + edades[0][1]);
        System.out.println("edades 0-0:" + edades[1][0]);
        System.out.println("edades 0-0:" + edades[1][1]);
        System.out.println("edades 0-0:" + edades[2][0]);
        System.out.println("edades 0-0:" + edades[2][1]);
        
        for(int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("Edades: "+fila+"-"+col+": " + edades[fila][col]);
            }
        
        }
        
        //Sintaxis simplificada:
        
        String frutas[][] = {{"pera", "frutillita"}, {"Limon", "arandano"}, {"Frutilla", "Kiwi"}};
        imprimir(frutas);
        
         persona personas[][] = new persona[2][3];
         
         personas[0][0] = new persona("Lu");
         personas[0][1] = new persona("Nacho");
         personas[0][2] = new persona("Guajardo");
         personas[1][0] = new persona("Pablo");
         personas[1][1] = new persona("Jose");
         personas[1][2] = new persona("Lucas");
         System.out.println("Matriz de personas: ");
         imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]) {
         for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz " + i + "-" + j + ": "+matriz[i][j]);
            }
        }
    }
}