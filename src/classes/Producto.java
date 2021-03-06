package classes;

public class Producto {
    public int id;
    public String name;
    public double cost;
    public int quantity;
    public String description;

    public Producto(String name, double cost, int quantity, String description){
        this.id = (int)(Math.random() * (3000 - 1000 + 1) + 1000);
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.description = description;
    }

    public void imprimir_linea(){
        System.out.println( String.valueOf(this.id) + " \t\t\t\t " + this.name + " \t\t\t\t " + this.description + " \t\t\t\t " + String.valueOf(this.quantity) + " \t\t\t\t " + String.valueOf(this.cost)+ " \t\t\t\t " + String.valueOf(this.cost*this.quantity));
    }

}
