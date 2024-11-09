package exercicios.two.entities;

public class Product {
    // Atributos
    private String name;
    private double price;

    //Construtor
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    // Métodos
    //getters e setters
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public double getPrice(){return price;}
    public void setPrice(double price){this.price = price;}

}
