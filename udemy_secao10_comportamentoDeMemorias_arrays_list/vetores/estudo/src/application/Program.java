package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o tamanho do vetor");
        int n = entrada.nextInt();
        double [] vect = new double[n];
        double soma = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o valor da " + (i+i) + "º altura: ");
            double altura = entrada.nextDouble();
            vect[i] = altura;
            soma += vect[i];
        }
        System.out.println("Vetor: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("A média das alturas é: " + soma / n);
        entrada.close();
    }
}
