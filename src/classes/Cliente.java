package classes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public int id;
    public String name;
    public boolean is_vip;

    public List<Producto> carrito;

    public  List<Orden> ordenes;

    public Cliente(String name, boolean is_vip){
        this.id = (int)(Math.random() * (3000 - 1000 + 1) + 1000);
        this.name = name;
        this.is_vip = is_vip;

        this.carrito = new ArrayList<Producto>();
        this.ordenes = new ArrayList<Orden>();
    }

    public void agregar_producto(Producto p){
        this.carrito.add(p);
    }

    public void sacar_producto(Producto p){
        this.carrito.remove(p);
    }

    public void agregar_orden(Orden o){
        this.ordenes.add(o);
    }

    public void quitar_orden(Orden o){
        this.ordenes.remove(o);
    }

    public void vaciar_carrito(){
        this.carrito.removeAll(this.carrito);
    }

    public void imprimir_carrito(){
        System.out.println("CARRITO DE: \t\t\t\t"+String.valueOf(this.id)+" - "+this.name);
        System.out.println("ID \t\t\t\t PRODUCT \t\t\t\t DESCRIPTION \t\t\t\t QUANTITY \t\t\t\t COST \t\t\t\t TOTAL");
        for(Producto p : this.carrito){
            p.imprimir_linea();
        }
        System.out.println("\n");
    }

    public void imprimir_ordenes(){
        for (Orden o : this.ordenes){
            o.imprimir_orden();
        }
    }

}
