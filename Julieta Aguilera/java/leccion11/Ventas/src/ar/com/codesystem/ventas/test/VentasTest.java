
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900);
        Producto producto3 = new Producto("Remera", 4000.00);
        Producto producto4 = new Producto("Short", 7800.00);
        Producto producto5 = new Producto("Chaqueta de jeans", 15000.00);
        Producto producto6 = new Producto("Medias x3", 1500.00);
        Producto producto7 = new Producto("Zapatillas Adidas", 18500.00);
        
        Orden orden1 = new Orden();
        //Arreglamos productos al arreglo
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);
        orden1.mostrarOrden(); 
        
        Orden orden2 = new Orden();
        orden2.agregarProductos(producto1);
        orden2.agregarProductos(producto3);
        orden2.agregarProductos(producto7);
        orden2.mostrarOrden();
        
        Orden orden3 = new Orden();
        orden3.agregarProductos(producto1);
        orden3.agregarProductos(producto2);
        orden3.agregarProductos(producto4);
        orden3.agregarProductos(producto4);
        orden3.agregarProductos(producto6);
        orden3.mostrarOrden();
        
        
        //Tarea: Crear mas objetos de tipo Producto
    }
 
}
