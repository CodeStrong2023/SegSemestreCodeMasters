package ar.com.codesystem.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);

        Orden orden1 = new Orden();
        //Agregamos productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        System.out.println("");

        //Tarea:
        //Crear mas objetos de tipo Producto=10
        //Crear mas objetos de tipo Orden=2
        Producto producto3 = new Producto("Camisa", 9900.00);
        Producto producto4 = new Producto("Remera", 4900.00);
        Producto producto5 = new Producto("Bermuda", 49900.00);
        Producto producto6 = new Producto("Musculosa", 9900.00);
        Producto producto7 = new Producto("Vestido", 19900.00);
        Producto producto8 = new Producto("Buzo", 7800.00);
        Producto producto9 = new Producto("Short", 5900.00);
        Producto producto10 = new Producto("Jardinero", 29900.00);
        Producto producto11 = new Producto("Zapatilla_Deportivas", 49900.00);
        Producto producto12 = new Producto("Zapatillas_Urbanas", 39900.00);

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto8);
        orden2.agregarProducto(producto12);
        orden2.mostrarOrden();
        System.out.println("");

        Orden orden3 = new Orden();
        orden3.agregarProducto(producto6);
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto11);
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto10);
        orden3.mostrarOrden();
    }

}
