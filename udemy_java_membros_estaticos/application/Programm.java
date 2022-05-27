import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.setDefault;

// Nesse caso, tudo foi criado na classe main, sendo assim, os métodos devem ser
// obrigatoriamente, static
// E para chamar os métodos, escreve-se apenas o nome dele
// ex: circunferencia(raio)

public class Programm {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o valor do raio");
        double raio = entrada.nextDouble();

        System.out.printf("Circunferência: %.2f%n", circunferencia(raio));
        System.out.printf("Volume: %.2f%n", volume(raio));
        System.out.printf("Valor de PI: %.2f%n", PI);

        entrada.close();
    }

    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume(double raio) {
        return 4.0 * PI * Math.pow(raio, 3) / 3;
    }
}
