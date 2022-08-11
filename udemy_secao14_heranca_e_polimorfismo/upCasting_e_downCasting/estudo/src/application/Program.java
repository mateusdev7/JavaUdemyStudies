package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING - Atribuir um objeto da subclasse para a superClasse
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Mateus", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Julia", 0.0, 0.01);
        // Não acontece nenhum tipo de erro, pois, uma BusinessAccount e SavingsAccount também é uma Account

        // DOWNCASTING - Atribuir um objeto da superClasse para a Subclasse
        BusinessAccount acc4 = (BusinessAccount)acc2; // Só é possivel fazendo o DownCasting
        acc4.loan(100.0);
        // BusinessAccount acc5 = (BusinessAccount)acc3; // Isso vai dar um erro em tempo de execução
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(800.0);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
