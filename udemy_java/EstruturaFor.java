import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;
        System.out.println("Digite o número de repetições");
        n = entrada.nextInt();
        int x;
        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + "º número");
            x = entrada.nextInt();
            soma += x;
        }
        System.out.println("A soma é: " + soma);
        entrada.close();
    }
}
