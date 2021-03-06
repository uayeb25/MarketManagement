package classes;

import java.util.ArrayList;
import java.util.List;

public class Asistente {
    public int id;
    public String name;

    public List<Orden> ordenes;

    public Asistente(String name){
        this.id = (int)(Math.random() * (3000 - 1000 + 1) + 1000);
        this.name = name;

        this.ordenes = new ArrayList<Orden>();
    }

    public void crear_orden(Cliente c){
        Orden o = new Orden(c,this, c.carrito);
        this.ordenes.add(o);
        c.agregar_orden(o);
        c.vaciar_carrito();
    }

    public void imprimir_ordenes(){
        for (Orden o : this.ordenes){
            o.imprimir_orden();
        }
    }

}
