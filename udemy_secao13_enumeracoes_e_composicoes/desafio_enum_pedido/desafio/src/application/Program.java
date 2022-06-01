package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String clientName = entrada.nextLine();

        System.out.print("Email: ");
        String clientEmail = entrada.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirth = sdf.parse(entrada.next());

        Client client = new Client(clientName, clientEmail, clientBirth);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(entrada.next());

        Order order = new Order(status, new Date(), client);

        System.out.print("How many items to this order? ");
        int n = entrada.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Enter #" + i + " item data:");

            System.out.print("Product name: ");
            entrada.nextLine();
            String productName = entrada.nextLine();

            System.out.print("Product price: ");
            double productPrice = entrada.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = entrada.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMARY: ");
        System.out.println(order);



        entrada.close();
    }
}
