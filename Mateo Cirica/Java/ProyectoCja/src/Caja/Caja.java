package Caja;

public class Caja {

    int ancho;
    int alto;
    int profundo;
    //Metodods y constructores (acciones)
    public Caja() { //Constructor 1 = vacio
    }

    //Constructor con parametros
    public Caja (int ancho, int alto, int profundo) { //Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen() {  //Metodo para calcular
    return ancho * alto * profundo;
    }
}
