package application;

import entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Aluguel[] aluguel = new Aluguel[10];

        System.out.println("Quantos quartos serao alugados? ");
        int quantidadeDeQuartos = entrada.nextInt();

        for(int i = 0; i < quantidadeDeQuartos; i++) {
            System.out.println("\n#" + (i+1) + "º Aluguel:");
            System.out.print("Qual é o seu nome? ");
            entrada.nextLine();
            String nome = entrada.nextLine();

            System.out.print("Digite é o seu Email: ");
            String email = entrada.nextLine();

            System.out.print("Qual o numero do quarto que deseja alugar? ");
            int quarto = entrada.nextInt();

            while(aluguel[quarto] != null) {
                System.out.println("\nEsse quarto ja foi alugado");
                System.out.print("Insira um novo numero de quarto para alugar? ");
                quarto = entrada.nextInt();
            }
            aluguel[quarto] = new Aluguel(nome,email);
        }

        System.out.println();
        System.out.println("Ordem dos quartos: ");
        for (int i = 0; i < 10; i++) {
            if(aluguel[i] != null) {
                System.out.println("Quarto " + i + ", está alugado por: " + aluguel[i]);
            }
        }
        entrada.close();
    }
}
