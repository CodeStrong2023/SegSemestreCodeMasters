
package clase6;

public class valor {
    public static void main(String[] args) {
        
        int valor = 20;
        System.out.println("valor:"+valor);
        cambioValor(valor);
        System.out.println("valor: "+valor);
    }
    
    public static void cambioValor(int arg1) {
        System.out.println("arg: "+arg1);
    }
}
