package application;

import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Bank bank = null;

        System.out.print("Enter account number: ");
        int number = entrada.nextInt();

        System.out.print("Enter account holder: ");
        entrada.nextLine();
        String holder = entrada.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char option = entrada.next().charAt(0);

        if (option == 'y' || option == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = entrada.nextDouble();
            bank = new Bank(number, holder, initialDeposit);

            System.out.println("\nAccount data: ");
            System.out.println(bank);
        }else if (option == 'n' || option == 'N') {
            bank = new Bank(number, holder);

            System.out.println("\nAccount data: ");
            System.out.println(bank);
        }

        System.out.print("Enter a deposit value: ");
        double depositValue = entrada.nextDouble();
        bank.deposito(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        depositValue = entrada.nextDouble();
        bank.saque(depositValue);

        System.out.println("Updated account data: ");
        System.out.println(bank);

        entrada.close();
    }
}
