
package clase6;

public class pruebacaja {
    public static void main(String[] args) {
        int Ancho =3;
        int Alto = 2;
        int Profundidad = 6;
        
        cajita caja1 = new cajita();
        caja1.ancho = Ancho;
        caja1.alto = Alto;
        caja1.profundidad = Profundidad;
        int resultado = caja1.calcularVolumen();
        System.out.println("Volúmen de caja 1: "+resultado);
        
        cajita caja2 = new cajita(2, 4, 6);
        System.out.println("Volúmen de caja 2:"+ caja2.calcularVolumen());
    }
}
