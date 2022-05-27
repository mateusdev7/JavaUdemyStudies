import java.util.Scanner;

public class funcoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com 3 números");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        int maior = max(a, b, c);

        mostrarResultado(maior);

        entrada.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        }else if (y > z) {
            aux = y;
        }else {
            aux = z;
        }
        return aux;
    } 

    public static void mostrarResultado(int maiorValor) {
        System.out.println("Maior valor é: " + maiorValor);
    }
}
