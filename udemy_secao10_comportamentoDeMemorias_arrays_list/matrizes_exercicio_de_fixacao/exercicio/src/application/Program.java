package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas? ");
        int linhas = entrada.nextInt();
        System.out.print("Qual a quantidade de colunas?");
        int colunas = entrada.nextInt();

        int[][] mat = new int[linhas][colunas];

        for(int i = 0 ; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Digite o valor a ser pesquisado: ");
        int valorPesquisar = entrada.nextInt();

        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == valorPesquisar) {
                    System.out.println("Position " + i + "," + j);
                    if (j > 0) {
                        System.out.println("left: " + mat[i][j-1]);
                    }if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
        entrada.close();
    }
}
