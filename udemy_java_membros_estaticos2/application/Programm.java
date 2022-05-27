package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

// Como o Calculator não é static, é necessário instanciar
// E para chamar o método usa-se o nome que se deu na instância + o método ->
// "Calculator calc = new Calculator();"
// Ex: calc.circunferencia

public class Programm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.println("Entre com o valor do raio");
        double raio = entrada.nextDouble();

        System.out.printf("Circunferência: %.2f%n", calc.circunferencia(raio));
        System.out.printf("Volume: %.2f%n", calc.volume(raio));
        System.out.printf("Valor de PI: %.2f%n", calc.PI);

        entrada.close();
    }
}
