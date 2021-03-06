package classes;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    public int id;
    public double descuento;
    public double subtotal;
    public double impuesto;
    public double total;

    public Cliente cliente;
    public Asistente asistente;
    public List<Producto> productos;

    public Orden(Cliente cliente, Asistente asistente, List<Producto> productos){
        this.id = (int)(Math.random() * (3000 - 1000 + 1) + 1000);
        this.cliente = cliente;
        this.asistente = asistente;
        this.productos = new ArrayList<Producto>();
        this.productos.addAll(productos);
        this.calcular_totales();
    }

    public void calcular_totales(){
        double porcentaje_descuento = this.cliente.is_vip ? 0.2 : 0.0;
        double acumulador = 0.0;

        for(Producto p: this.cliente.carrito){
            acumulador += p.cost * p.quantity;
        }

        this.subtotal = acumulador;
        this.descuento = acumulador * porcentaje_descuento;
        this.impuesto = (this.subtotal - this.descuento) * 0.15;
        this.total = this.subtotal + this.impuesto - this.descuento;
    }

    public void actualizar_carrito(List<Producto> productos){
        this.productos.removeAll(this.productos);
        this.productos.addAll(productos);
        this.calcular_totales();
    }

    public void imprimir_orden(){
        System.out.println("ORDEN # \t\t\t"+String.valueOf(this.id));
        System.out.println("CLIENTE ID: \t\t\t"+String.valueOf(this.cliente.id));
        System.out.println("NOMBRE CLIENTE: \t\t\t"+this.cliente.name);
        System.out.println("ATENDIDO POR: \t\t\t"+String.valueOf(this.asistente.id)+" - "+this.asistente.name);

        System.out.println("ID \t\t\t\t PRODUCT \t\t\t\t DESCRIPTION \t\t\t\t QUANTITY \t\t\t\t COST \t\t\t\t TOTAL");
        for(Producto p: this.productos){
            p.imprimir_linea();
        }

        System.out.println("SUBTOTAL: \t\t\t"+String.valueOf(this.subtotal));
        System.out.println("IMPUESTO: \t\t\t"+String.valueOf(this.impuesto));
        System.out.println("DESCUENTO: \t\t\t"+String.valueOf(this.descuento));
        System.out.println("TOTAL: \t\t\t"+String.valueOf(this.total));
        System.out.println("\n");
    }

}
