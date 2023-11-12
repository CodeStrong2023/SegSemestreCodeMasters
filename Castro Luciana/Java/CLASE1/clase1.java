
package segundo.semestre;

public class clase1 {
    public static void main(String[]args){
        
        // CICLO WHILE
        int conteo = 0; // inferencia de tipos
        while(conteo < 7){
            System.out.println("conteo = "+ conteo);
            conteo++; // vamos aumentando en uno la variable
        }
        
        // CICLO DO WHILE
        int contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 4);
        
        // CICLO FOR
        for(int num = 0; num < 6; num++){
            // en el primer espacio se declara la variable. en el segundo colocamos la condicion y en el ulltimo el incremento
            if(num % 2 == 0){
                System.out.println("contar = " + num);
                break;
            }  
        }
        
        // BREAK, CONTINUEY ETIQUETAS LEABLES
        
        inicio:
        for(int num = 0; num < 6; num++){
            // en el primer espacio se declara la variable. en el segundo colocamos la condicion y en el ulltimo el incremento
            if(num % 2 != 0){
                continue; // se empieza la siguiente iteracion
            }  
            System.out.println("contar = " + num);
        }
    }
}
