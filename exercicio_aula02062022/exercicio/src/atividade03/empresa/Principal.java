package atividade03.empresa;

import atividade03.locadora.Filme;
import atividade03.locadora.LocadoraVetor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("====== CADASTRO DE VENDEDORES ======");

        EmpresaVetor empresa = null;

        int opcao = 0;
        mostrarMenu();
        opcao = entrada.nextInt();
        while(opcao < 1 || opcao > 4) {
            System.out.print("Opçao invalida, escolha uma das opcoes abaixo: ");
            mostrarMenu();
            opcao = entrada.nextInt();
        }
        while(opcao != 4) {
            if(empresa == null && opcao != 1) {
                System.out.println("Voce precisa incluir vendedores primeiro");
            }else {
                switch (opcao) {
                    case 1:
                        System.out.print("Qual a quantidade de vendedores que serao cadastrados? ");
                        int quantidade = entrada.nextInt();
                        empresa = new EmpresaVetor(quantidade);

                        for(int i = 0; i < quantidade; i++) {
                            System.out.println("====== Inclusao de vendedores ======");

                            System.out.print("Digite o nome do vendedor: ");
                            entrada.nextLine();
                            String nomeDoVendedor = entrada.nextLine();

                            System.out.print("Digite o tipo da mercadoria (P: perecivel, N: nao perecivel): ");
                            char tipoDeMercadoria = entrada.next().charAt(0);

                            System.out.print("Digite o codigo do vendedor: ");
                            int codigoDoVendedor = entrada.nextInt();

                            Vendedor vendedor = new Vendedor(codigoDoVendedor, nomeDoVendedor, tipoDeMercadoria);

                            boolean resultado = empresa.inserirVendedor(vendedor);
                            if(resultado) {
                                System.out.println("------ Vendedor cadastrado com sucesso ------\n");
                            }else {
                                System.out.println("Nao foi possivel cadastrar o vendedor :( ");
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Digite a letra inicial do tipo de mercadoria (P: perecivel, N: nao perecivel): ");
                        char mercadoria = entrada.next().charAt(0);
                        System.out.println("A quantidade de mercadorias do tipo " + mercadoria + " vale: " +
                                empresa.consultarPorTipoDeMercadoria(mercadoria));
                        break;
                    case 3:
                        System.out.println("Lista dos vendedores: ");
                        System.out.println(empresa);
                        System.out.print("\nDigite o nome do vendedor que voce deseja excluir: ");
                        entrada.nextLine();
                        String nomeDoVendedor = entrada.nextLine();

                        boolean resultado2 = empresa.removerVendedor(nomeDoVendedor);
                        if(resultado2) {
                            System.out.println("------ Vendedor removido com sucesso ------\n");
                        }else {
                            System.out.println("Nao foi possivel remover o vendedor :( ");
                        }
                        break;
                }
            }
            if(empresa != null) {
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
        System.out.println(" 1 - Incluir vendedores na empresa (Vetor)");
        System.out.println(" 2 - Consultar o total de vendedores de um determinado tipo de mercadoria");
        System.out.println(" 3 - Excluir um vendedor do arquivo procurando pelo nome");
        System.out.println(" 4 - Sair do sistema");
        System.out.print("Opcao: ");
    }

    public static void mostrarMenu2() {
        System.out.println("\n====== MENU DE OPCOES ======");
        System.out.println(" 2 - Consultar o total de vendedores de um determinado tipo de mercadoria");
        System.out.println(" 3 - Excluir um vendedor do arquivo procurando pelo nome");
        System.out.println(" 4 - Sair do sistema");
        System.out.print("Opcao: ");
    }
}
