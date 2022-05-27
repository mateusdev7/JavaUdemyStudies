import java.util.Scanner;

public class CondicionalWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x;
        System.out.println("Digite um número");
        x = entrada.nextInt();
        int soma = 0;
        while(x != 0) {
            soma += x;
            System.out.println("digite um número");
            x = entrada.nextInt();
        }
        System.out.println("A soma dos números é: " + soma);
        entrada.close();
    }
}
