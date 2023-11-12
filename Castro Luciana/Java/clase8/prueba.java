
package clase8;

public class prueba {
    public static void main(String[] args) {
        
        persona1 persona2 = new persona1("Luciana", 50.000, false);
        System.out.println("persona1 su nombre es: " +persona2.getNombre());
        persona2.setNombre("Luci");
        
        System.out.println("persona2 con su nombre modificado: "+persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo: "+persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: "+persona2.isEliminado());
    }
}
