
package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades [] [] = new int [3][2]; // manera de crear una matris con iingreso manual basico
        System.out.println("edades = " + edades);
        edades [0] [0] = 5; //Lenamos manual
        edades [0] [1] = 7; // en una diferente columna
        edades [1] [0] = 8;
        edades [1] [1] = 4;
        //Tarea
        edades [2] [0] = 2 ;
        edades [2] [1] = 9;
        
        
        System.out.println("edades 0-0 = " + edades[0] [0]);
        System.out.println("edades 0-1 = " + edades[0] [1]);
        System.out.println("edades 1-0 = " + edades[1] [0]);
        System.out.println("edades 1-1 = " + edades[1] [1]);
        System.out.println("edades 2-0 = " + edades[2] [0]);
        System.out.println("edades 2-1 = " + edades[2] [1]);
        System.out.println("Recorremos la matriz a travez del ciclo for");
        for(int fila = 0; fila < edades.length; fila++){
            for (int col = 0; col < edades[fila].length ; col++) {
                System.out.println("edades "+fila+"-"+col+":"+edades[fila][col]);
                
            }
        }
        //sintaxis clasica
        //String frutas [][] = new String [3] [2];
        
        //Sintaxis simplificada
        String frutas [] [] = {{"Limon", "Pomelo"}, {"Ciruela", "kiwi"}, {"Banana", "Naranja"}};
        imprimir(frutas);
//        for(int i = 0; i < frutas.length; i++){
//            for (int col = 0; col < frutas [i].length ; col++) {
//                System.out.println("frutas "+i+"-"+col+":"+frutas[i][col]);
//                
//            }
//        }
        //Creamos una matris de objetos
        Persona personas [][] = new Persona [2][3];
        //Asignamo valores a la matris
        personas [0][0] = new Persona("Julieta");
        personas [0][1] = new Persona("Rosalia");
        personas [0][2] = new Persona("Erica");
        personas [1][0] = new Persona("Antonia");
        personas [1][1] = new Persona("Leticia");
        personas [1][2] = new Persona("Guadalupe");
        System.out.println("Matris de personas");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for (int col = 0; col < matriz [i].length ; col++) {
                System.out.println("matriz "+i+"-"+col+":"+matriz[i][col]);
                
            }
        }
    }
}
