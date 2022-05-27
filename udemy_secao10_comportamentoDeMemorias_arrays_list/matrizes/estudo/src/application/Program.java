package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual vai ser o tamanho N da matriz?");
        int n = entrada.nextInt();

        int[][] mat = new int[n][n];

        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for(int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ") ;
        }

        System.out.println();
        int numerosNegativos = 0;

        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] < 0) {
                    numerosNegativos++;
                }
            }
        }

        System.out.println("Negative numbers" + numerosNegativos);

        entrada.close();
    }
}
