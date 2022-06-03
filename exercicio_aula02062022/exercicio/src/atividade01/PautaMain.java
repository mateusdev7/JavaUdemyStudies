package atividade01;

import java.util.Scanner;

public class PautaMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pauta pauta = null;

        int opcao = 0;
        menuDeEscolhas();
        opcao = entrada.nextInt();
        while(opcao < 1 || opcao > 6) {
            System.out.println("\nOpcao invalida, selecione uma das opcoes abaixo\n");
            menuDeEscolhas();
            opcao = entrada.nextInt();
        }
        while(opcao != 6) {
            if(pauta == null && opcao != 1) {
                System.out.println("\nVoce precisa cadastrar um aluno primeiro\n");
            }else {
                switch (opcao) {
                    case 1:
                        System.out.println("======= CADASTRO DE ALUNO NA PAUTA =======");

                        System.out.print("Digite o nome do aluno: ");
                        entrada.nextLine();
                        String nomeDoAluno = entrada.nextLine();

                        System.out.print("Digite a matricula do aluno: ");
                        int matriculAluno = entrada.nextInt();

                        System.out.print("Qual a quantidade de faltas: ");
                        int numFaltas = entrada.nextInt();

                        System.out.print("Qual a primeira nota do aluno? ");
                        double nota1 = entrada.nextDouble();
                        while (nota1 < 0 || nota1 > 10) {
                            System.out.println("Apenas notas de 0 a 10");
                            System.out.print("Digite novamente a primeira nova: ");
                            nota1 = entrada.nextDouble();
                        }

                        System.out.print("Qual a segunda nota do aluno? ");
                        double nota2 = entrada.nextDouble();
                        while (nota2 < 0 || nota2 > 10) {
                            System.out.println("Apenas notas de 0 a 10");
                            System.out.print("Digite novamente a segunda nova: ");
                            nota2 = entrada.nextDouble();
                        }

                        pauta = new Pauta(matriculAluno, nomeDoAluno, numFaltas, nota1, nota2);

                        System.out.println("\nAluno adicionado a pauta com sucesso!!!\n");
                        break;
                    case 2:
                        System.out.println(pauta);
                        break;
                    case 3:
                        boolean resultado = pauta.reprovadoPorFalta();
                        if(resultado) {
                            System.out.println("O aluno esta reprovado por falta.\n");
                        }else {
                            System.out.println("O aluno nao esta reprovado por falta.\n");
                        }
                        break;
                    case 4:
                        System.out.println("A media do aluno vale: " + pauta.calcularMedia() + "\n");
                        break;
                    case 5:
                        boolean resultado2 = pauta.situacaoDeReprovacao();
                        if(resultado2){
                            System.out.println("O aluno esta aprovado.\n");
                        }else {
                            System.out.println("O aluno esta reprovado.\n");
                        }
                }
            }
            menuDeEscolhas();
            opcao = entrada.nextInt();
            while(opcao < 1 || opcao > 6) {
                System.out.println("\nOpcaoo inválida, selecione uma das opções abaixo\n");
                menuDeEscolhas();
                opcao = entrada.nextInt();
            }
        }
        System.out.println("Voce saiu do programa");
        entrada.close();
    }

    static void menuDeEscolhas() {
        System.out.println("======= Escolha uma opcao ======");
        System.out.println("1 - Cadastrar um aluno");
        System.out.println("2 - Mostrar todos os dados do aluno");
        System.out.println("3 - Verificar se o aluno esta reprovado por falta");
        System.out.println("4 - Mostrar a media do aluno");
        System.out.println("5 - Mostrar situacao de aprovacao ou reprovacaoo");
        System.out.println("6 - Finalizar operacoes\n");
        System.out.print("Opcao:\n> ");
    }
}
