package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Programm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Qual o nome do aluno? ");
        aluno.nome = entrada.nextLine();

        System.out.println("Qual a primeira nota do aluno ");
        aluno.n1 = entrada.nextDouble();

        System.out.println("Qual a segunda nota do aluno ");
        aluno.n2 = entrada.nextDouble();

        System.out.println("Qual a tericera nota do aluno ");
        aluno.n3 = entrada.nextDouble();

        System.out.printf("\nA nota final do aluno foi: %.2f", aluno.somaDasNotas());

        if (aluno.somaDasNotas() < 60.0) {
            System.out.println("\nAluno reprovado");
            System.out.printf("Faltou %.2f para o aluno passar\n", aluno.pontos());
        }else {
            System.out.println("\nAluno aprovado");
        }
        entrada.close();
    }
}
