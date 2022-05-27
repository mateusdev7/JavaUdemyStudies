package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        // Criando dois triângulo
        Triangulo x, y; 

        // Instanciando o triângulo x e y com os objetos a, b, c
        x = new Triangulo();
        y = new Triangulo();

        Triangulo.perguntaX();
        x.ladoA = entrada.nextDouble();
        x.laboB = entrada.nextDouble();
        x.ladoC = entrada.nextDouble();

        Triangulo.perguntaY();
        y.ladoA = entrada.nextDouble();
        y.laboB = entrada.nextDouble();
        y.ladoC = entrada.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do triângulo X = %.4f%n ", areaX);
        System.out.printf("Área do triângulo Y = %.4f%n ", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área é a do triângulo: X");
        }else {
            System.out.println("Maior área é a do triângulo: Y");

        }
        entrada.close();
    }
}