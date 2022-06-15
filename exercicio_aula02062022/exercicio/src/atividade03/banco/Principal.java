package atividade03.banco;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Banco vetBanco = null;
        Conta conta;

        int opcao;
        mostrarMenu();
        opcao = entrada.nextInt();
        while(opcao < 1 || opcao > 4) {
            System.out.println("Opçao inválida");
            mostrarMenu();
            opcao = entrada.nextInt();
        }
        while(opcao !=4) {
            if(vetBanco == null & opcao != 1) {
                System.out.println("É necessário cadastrar contas primeiro");
            }else {
                switch (opcao) {
                    case 1:
                        System.out.print("Quantas contas serão cadastradas?\n>");
                        int total = entrada.nextInt();
                        while(total < 0 || total > 15) {
                            System.out.println("So é possível cadastrar no máximo 15 contas");
                            System.out.println("Digite um novo valor entra 1 e 15");
                            total = entrada.nextInt();
                        }

                        vetBanco = new Banco(total);
                        for(int i = 0; i < total; i++) {
                            System.out.print("Digite o número da conta: ");
                            int numeroDaConta = entrada.nextInt();
                            int j = 0;
                            while((j < vetBanco.getQuantVetor()) && (!(numeroDaConta == vetBanco.getBancoVet(j).getNumeroDaConta()))){
                                j++;
                            }
                            if(j == vetBanco.getQuantVetor()) {
                                System.out.println("Novo número de conta, prossiga com os dados");
                            }else {
                                while(numeroDaConta == vetBanco.getBancoVet(j).getNumeroDaConta()) {
                                    System.out.println("Número da conta já existe no sistema");
                                    System.out.print("Por favor, insira um número de conta que não esteja sendo utilizado: ");
                                    numeroDaConta = entrada.nextInt();
                                }
                            }

                            System.out.print("Digite o nome do títular da conta: ");
                            entrada.nextLine();
                            String titularDaConta = entrada.nextLine();

                            System.out.print("Digite o saldo inicial da conta: R$");
                            double saldoDaConta = entrada.nextDouble();

                            conta = new Conta(numeroDaConta, titularDaConta, saldoDaConta);

                            boolean inserir = vetBanco.inserirConta(conta);
                            if(inserir) {
                                System.out.println("\n====== Conta criada com sucesso ======\n");
                            }else {
                                System.out.println("Não foi possível criar a conta");
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Nome do cliente: ");
                        entrada.nextLine();
                        String nomeDoCliente = entrada.nextLine();
                        System.out.println(vetBanco.mostrarContas(nomeDoCliente));
                        break;
                    case 3:
                        vetBanco.removerConta();
                        System.out.println("Contas que restaram");
                        System.out.println(vetBanco);
                        break;
                }
            }
            mostrarMenu();
            opcao = entrada.nextInt();
            while(opcao < 1 || opcao > 4) {
                System.out.println("\nOpcao invalida, selecione uma das opcoes abaixo\n");
                mostrarMenu();
                opcao = entrada.nextInt();
            }
        }
        System.out.println("Você saiu do programa");
        entrada.close();
    }
    public static void mostrarMenu() {
        System.out.println("\n====== MENU DE OPCOES ======");
        System.out.println(" 1 - Cadastrar contas");
        System.out.println(" 2 - Visualizar todas as contas de um determinado cliente");
        System.out.println(" 3 - Excluir a conta com menor saldo");
        System.out.println(" 4 - Sair do sistema");
        System.out.print("Opcao: ");
    }
}
