import java.util.Scanner;

public class funcaoSoma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Entre com o primeiro valor: ");
        int numero1 = entrada.nextInt();

        System.out.println("Entre com o segundo valor: ");
        int numero2 = entrada.nextInt();

        int resultado = soma(numero1, numero2); // return somaDosNumeros

        mostrarResultado(resultado); // resultadoDaSoma

        entrada.close();
    }
    // Função para realizar a soma
    public static int soma(int x, int y) {
        int somaDosNumeros;
        somaDosNumeros = x + y;
        return somaDosNumeros;
    }
    // Função para mostrar o resultado da soma
    public static void mostrarResultado(int resultadoDaSoma) {
        System.out.println("O resultado da soma é: " + resultadoDaSoma);
    }
}
