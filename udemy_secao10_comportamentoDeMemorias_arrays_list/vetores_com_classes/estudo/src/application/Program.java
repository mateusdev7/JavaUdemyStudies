package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a quantidade de produtos: ");
        int numeroDeProdutos = entrada.nextInt();

        Product[] productVect = new Product[numeroDeProdutos];

        for (int i = 0; i < productVect.length; i++) {
            entrada.nextLine();
            System.out.println("Digite o nome do " + (i+1) + "º produto");
            String nome = entrada.next();
            System.out.println("Digite o preço do " + (i+1) + "º produto");
            double preco = entrada.nextDouble();
            productVect[i] = new Product(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < productVect.length; i++) {
            soma += productVect[i].getPrice();
        }
        double media = soma / productVect.length;

        System.out.printf("A média é : %.2f%n" , media);

        entrada.close();
    }
}
