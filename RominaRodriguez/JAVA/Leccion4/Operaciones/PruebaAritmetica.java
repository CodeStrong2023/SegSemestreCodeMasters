
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10;//Variables locales
        int b = 7;//Memoria stack funciona solo con las variables locales
        miMetodo();//Llamamos al metodo
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        
        //Para almacenar un objeto o atributos se utiliza la memoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12,26);
        System.out.println("Resultado usando argumentos = "+resultado);
        
        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica2 b: "+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        //Aritmetica1 = null;     
        //System.gc(); Método pra limpiar residuos
    }
    public static void miMetodo(){
        int a = 10;
        System.out.println("Aqui hay otro método");
    }
    
}
