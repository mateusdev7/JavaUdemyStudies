package atividade03.locadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("========== CADASTRO DE FILMES ==========");



        LocadoraVetor locadora = null;

        int opcao = 0;
        mostrarMenu();
        opcao = entrada.nextInt();
        while(opcao < 1 || opcao > 4) {
            System.out.print("Opçao invalida, escolha uma das opcoes abaixo: ");
            mostrarMenu();
            opcao = entrada.nextInt();
        }

        while(opcao != 4) {
            if(locadora == null && opcao != 1) {
                System.out.println("Voce precisa incluir filmes primeiro");
            }else {
                switch (opcao) {
                    case 1:
                        System.out.print("Qual a quantidade de filmes que serao cadastrados? ");
                        int quantidade = entrada.nextInt();
                        locadora = new LocadoraVetor(quantidade);

                        for(int i = 0; i < quantidade; i++) {
                            System.out.println("====== Inclusao de filmes ======");

                            System.out.print("Digite o nome do filme: ");
                            entrada.nextLine();
                            String tituloDoFilme = entrada.nextLine();

                            System.out.print("Digite o genero do filme A: acao; T: terror; D: drama): ");
                            char generoDoFilme = entrada.next().charAt(0);

                            System.out.print("Digite o codigo do filme: ");
                            int codigoDoFilme = entrada.nextInt();

                            Filme filme = new Filme(codigoDoFilme, tituloDoFilme, generoDoFilme);

                            boolean resultado = locadora.inserirFilme(filme);
                            if(resultado) {
                                System.out.println("------ Filme cadastrado com sucesso ------\n");
                            }else {
                                System.out.println("Nao foi possivel cadastrar o filme :( ");
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Digite a letra inicial do genero (A: acao; T: terror; D: drama): ");
                        char genero = entrada.next().charAt(0);
                        System.out.println("A quantidade de filmes do genero " + genero + " vale: " + locadora.totalDeFilmes(genero));
                        break;
                    case 3:
                        System.out.println("Lista dos filmes: ");
                        System.out.println(locadora);
                        System.out.print("\nDigite o nome do filme que voce deseja excluir");
                        entrada.nextLine();
                        String tituloDoFilme = entrada.nextLine();

                        boolean resultado2 = locadora.removerFilme(tituloDoFilme);
                        if(resultado2) {
                            System.out.println("------ Filme removido com sucesso ------\n");
                        }else {
                            System.out.println("Nao foi possivel remover o filme :( ");
                        }
                        break;
                }
            }
            if(locadora != null) {
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
        System.out.println(" 1 - Incluir filme no arquivo (Vetor)");
        System.out.println(" 2 - Consultar o total de filmes de um determinado genero");
        System.out.println(" 3 - Excluir um filme do arquivo procurando pelo nome");
        System.out.println(" 4 - Sair do sistema");
        System.out.print("Opcao: ");
    }

    public static void mostrarMenu2() {
        System.out.println("\n====== MENU DE OPCOES ======");
        System.out.println(" 2 - Consultar o total de filmes de um determinado genero");
        System.out.println(" 3 - Excluir um filme do arquivo procurando pelo nome");
        System.out.println(" 4 - Sair do sistema");
        System.out.print("Opcao: ");
    }
}
