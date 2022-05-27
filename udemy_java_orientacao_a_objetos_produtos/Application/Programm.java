package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Programm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Product product = new Product(); // Instância do objeto com os atributos name, price e quantity

        System.out.println("Enter product data: ");

        // Nome do produto
        System.out.print("Name: ");
        product.name = entrada.nextLine();

        // Preço do produto
        System.out.print("Price: ");
        product.price = entrada.nextDouble();
        
        // Quantidade no estoque desse produto
        System.out.print("Quantity in Stock: ");
        product.quantity = entrada.nextInt();

        System.out.println("\nProduct data: " + product); // Printando com o toString

        System.out.println("\nEnter the number of products to be added in stock: ");
        int quantity = entrada.nextInt();
        product.addProducts(quantity);
        System.out.println("\nUpdated data: " + product);
        
        System.out.println("\nEnter the number of products to be removed from stock: ");
        quantity = entrada.nextInt();
        product.RemoverProducts(quantity);
        System.out.println("\nUpdated data: " + product);

        entrada.close();
    }
}
