import java.util.Scanner;
import java.util.Locale;

public class UsoDoDebugger {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura");
        double largura = sc.nextDouble();
        System.out.println("Digite o comprimento");
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();
    }
}
