package programa;

import entidade.Retangulo;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite o valor da base do retângulo:");
        retangulo.largura = entrada.nextDouble();

        System.out.println("Digite o valor da altura do retângulo:");
        retangulo.altura = entrada.nextDouble();

        System.out.printf("Área: %.2f", retangulo.area());
        System.out.printf("\nPerimetro: %.2f", retangulo.perimetro());
        System.out.printf("\nDiagonal: %.2f", retangulo.diagonal());

        entrada.close();
    }
}
