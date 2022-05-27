package entities;

public class Product {
    public String name; // Atributo
    public double price; // Atributo
    public int quantity; // Atributo

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        // O this serve para referênciar o atributo da classe, nesse caso o quantity lá de cima
        this.quantity += quantity; 
    }

    public void RemoverProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price)+ ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());  
    }
}
