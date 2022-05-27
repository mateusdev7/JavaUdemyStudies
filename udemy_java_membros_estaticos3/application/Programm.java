package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;


// Como o Calculator é static, não é necessário instanciar
// Mas, pra chamar o classe, escreve-se o nome da classe + metodo
// Ex: Calculator.circunferencia 

public class Programm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o valor do raio");
        double raio = entrada.nextDouble();

        System.out.printf("Circunferência: %.2f%n", Calculator.circunferencia(raio));
        System.out.printf("Volume: %.2f%n", Calculator.volume(raio));
        System.out.printf("Valor de PI: %.2f%n", Calculator.PI);

        entrada.close();
    }
}
