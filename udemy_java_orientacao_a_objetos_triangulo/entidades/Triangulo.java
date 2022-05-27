package entidades;

public class Triangulo {
    
    public double ladoA; // atributo
    public double laboB; // atributo 
    public double ladoC; // atributo

    public double area() {
        double p = (ladoA + laboB + ladoC) / 2.0;
        return Math.sqrt(p * (p - ladoA) * (p - laboB) * (p - ladoC));
    }

    public static void perguntaX() {
        System.out.println("Digite os lados do triângulo x");
    }

    public static void perguntaY() {
        System.out.println("Digite os lados do triângulo y");
    }
}
