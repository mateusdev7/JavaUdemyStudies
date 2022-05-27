package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Programm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Qual o nome do funcionário");
        funcionario.nome = entrada.nextLine();

        System.out.println("Qual o salário do funcionário");
        funcionario.salarioBruto = entrada.nextDouble();

        System.out.println("Qual o desconto do funcionário");
        funcionario.desconto = entrada.nextDouble();

        System.out.println(funcionario);

        System.out.println("Qual a taxa de aumento do funcionário? ");
        double taxaDeAumento = entrada.nextDouble();
        funcionario.aumento(taxaDeAumento);

        System.out.println("Novo salário do funcionário: " + funcionario);

        entrada.close();
    }
}
