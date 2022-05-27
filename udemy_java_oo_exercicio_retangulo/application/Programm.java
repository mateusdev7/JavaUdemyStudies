package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Rectangle;

public class Programm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Digite a largura do triângulo: ");
        rectangle.largura = entrada.nextDouble();

        System.out.println("Digite a altura do triângulo: ");
        rectangle.altura = entrada.nextDouble();

        System.out.printf("A área do triângulo é: %.2f%n", rectangle.area());
        System.out.printf("O perímetro do triângulo é: %.2f%n", rectangle.perimetro());
        System.out.printf("A diagonal do triângulo é: %.2f%n", rectangle.diagonal());
        entrada.close();
    }
}
