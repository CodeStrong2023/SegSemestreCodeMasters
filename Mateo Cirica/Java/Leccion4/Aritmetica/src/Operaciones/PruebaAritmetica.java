package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        miMetodo();
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();

        int resultado = aritmetica1.sumaConRetorno();
        System.out.println("El resultado es: " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 18);
        System.out.println("Resultado usando argumentos = "+resultado);

        System.out.println("Aritmetica1 a: "+aritmetica1.a);
        System.out.println("Aritmetica1 b: "+aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 = "+aritmetica2.a);
        System.out.println("aritmetica2 = "+aritmetica2.b);
        Persona persona = new Persona("Mateo", "Cirica");
        System.out.println("persona = "+ persona);
        System.out.println("Persona nombre: "+persona.nombre);
        System.out.println("Persona apellido: "+persona.apellido);
    }

    public static void miMetodo(){
        //int a = 10;
        System.out.println("Aquie hay otro metodo");
    }
}

    class Persona {
        String nombre;
        String apellido;

        Persona(String nombre, String apellido){
            super();
            //Imprimir imprimir = new Imprimir();
            new Imprimir() .Imprimir(this);
            this.nombre = nombre;
            this.apellido = apellido;
            System.out.println("Objeto persona usando this: "+this);
        }
    }

    class Imprimir{
        public Imprimir(){
            super();
        }

        public void Imprimir(Persona persona) {
            System.out.println("Persona desde la clase imprimir: "+persona);
            System.out.println("Impresion del objeto actual (this): "+this);
        }
    }
