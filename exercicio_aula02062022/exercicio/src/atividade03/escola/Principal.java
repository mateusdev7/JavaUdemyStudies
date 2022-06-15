package atividade03.escola;

import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("====== Cadastro de Alunos ======");

        AlunoVet alunoVet = null;

        int opcao = 0;
        mostrarMenu();
        opcao = entrada.nextInt();
        while(opcao < 1 || opcao > 4) {
            System.out.print("Opçao invalida, escolha uma das opcoes abaixo: ");
            mostrarMenu();
            opcao = entrada.nextInt();
        }
        while(opcao != 4) {
            if(alunoVet == null && opcao != 1) {
                System.out.println("Voce precisa incluir alunos primeiro");
            }else {
                switch (opcao) {
                    case 1:
                        System.out.print("Qual a quantidade de alunos que serao matriculados? ");
                        int quantidade = entrada.nextInt();
                        alunoVet = new AlunoVet(quantidade);

                        for(int i = 0; i < quantidade; i++) {
                            System.out.println("====== Cadastro de Alunos no Sistema ======");

                            System.out.print("Digite o nome do aluno: ");
                            entrada.nextLine();
                            String nomeDoAluno = entrada.nextLine();

                            System.out.print("Digite a matricula do aluno: ");
                            int matricula = entrada.nextInt();

                            System.out.print("Digite a primeira nota do aluno: ");
                            double nota1 = entrada.nextDouble();

                            System.out.print("Digite a segunda nota do aluno: ");
                            double nota2 = entrada.nextDouble();

                            Aluno aluno = new Aluno(matricula, nomeDoAluno, nota1, nota2);

                            boolean resultado = alunoVet.cadastrarAluno(aluno);
                            if(resultado) {
                                System.out.println("------ Aluno cadastrado com sucesso ------\n");
                            }else {
                                System.out.println("Nao foi possivel cadastrar o aluno no momento :( ");
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Ver alunos que tem nota menor do que:  ");
                        double notaAluno = entrada.nextDouble();
                        System.out.println("Nome dos alunos com nota menor do que " + notaAluno + ": ");
                        System.out.println(alunoVet.consultarAlunos(notaAluno));
                        break;
                    case 3:
                        /*if(alunoVet.getQuantVetor() == 0) {
                            System.out.println("A lista de alunos está vazia");
                        }else {
                            List<String> alunos;
                            alunos = alunoVet.media();
                            for(int i = 0; i < alunos.size(); i++) {
                                System.out.println(alunos.get(i));
                            }
                        }*/
                        System.out.println(alunoVet.mediaString());
                        break;
                }
            }
            if(alunoVet != null) {
                mostrarMenu2();
                opcao = entrada.nextInt();
                while(opcao < 2 || opcao > 4) {
                    System.out.println("\nOpcao invalida, selecione uma das opcoes abaixo\n");
                    mostrarMenu();
                    opcao = entrada.nextInt();
                }
            }else {
                mostrarMenu();
                opcao = entrada.nextInt();
                while(opcao < 1 || opcao > 4) {
                    System.out.println("\nOpcao invalida, selecione uma das opcoes abaixo\n");
                    mostrarMenu();
                    opcao = entrada.nextInt();
                }
            }
        }
        System.out.println("Voce saiu do programa");
        entrada.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n====== MENU DE OPCOES ======");
        System.out.println(" 1 - Incluir alunos na escola (Vetor)");
        System.out.println(" 2 - Consultar alunos com nota menor que...");
        System.out.println(" 3 - Calcular a media e mostrar os alunos");
        System.out.println(" 4 - Sair do sistema");
        System.out.print("Opcao: ");
    }

    public static void mostrarMenu2() {
        System.out.println("\n====== MENU DE OPCOES ======");
        System.out.println(" 2 - Consultar alunos com nota menor que...");
        System.out.println(" 3 - Calcular a media e mostrar os alunos");
        System.out.println(" 4 - Sair do sistema");
        System.out.print("Opcao: ");
    }
}
