//Los arregglos son de tipo objet, los arreglos heredan de la clase objet
package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int [3]; //el lado izq. declaramos variebles, lado derecho instanciamos un objeto de tipo objet 
        System.out.println("edades = " + edades); //se ve la direccion del arreglo
        
        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);
        
        edades [1] = 20;
        System.out.println("edades 1 = " + edades[1]);
        
        edades [2] = 29;
        System.out.println("edades 2 = " + edades[2]);
        
        //edades[3] = 7; //fuera de rango, error en tiempo de ejecucion
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades y sus elementos "+i+":"+edades[i]);
        }
        
        
        
    }
  
}
