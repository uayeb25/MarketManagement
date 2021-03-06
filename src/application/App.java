package application;

import classes.Asistente;
import classes.Cliente;
import classes.Producto;

public class App {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Corina", false);
        Cliente c2 = new Cliente("Aurora", true);
        Cliente c3 = new Cliente("Allison", true);

        Asistente a1 = new Asistente("Imix");
        Asistente a2 = new Asistente("Uayeb");

        Producto p1 = new Producto("P1", 200.4, 4, "descripcion de p1");
        Producto p2 = new Producto("P2", 100.9, 7, "descripcion de p2");
        Producto p3 = new Producto("P3", 200.8, 8, "descripcion de p3");
        Producto p4 = new Producto("P4", 500.5, 9, "descripcion de p4");

        c1.agregar_producto(p1);
        c1.agregar_producto(p3);

        c1.imprimir_carrito();
        a1.crear_orden(c1);
        c1.imprimir_carrito();
        c1.imprimir_ordenes();

        c1.agregar_producto(p2);

        c1.imprimir_carrito();
        a2.crear_orden(c1);

        c1.imprimir_carrito();
        c1.imprimir_ordenes();

        c2.agregar_producto(p1);
        c2.agregar_producto(p2);
        c2.agregar_producto(p3);
        c2.agregar_producto(p4);

        c2.imprimir_carrito();

        a1.crear_orden(c2);

        c2.imprimir_carrito();
        c2.imprimir_ordenes();

        a1.imprimir_ordenes();
        a2.imprimir_ordenes();


    }
}
