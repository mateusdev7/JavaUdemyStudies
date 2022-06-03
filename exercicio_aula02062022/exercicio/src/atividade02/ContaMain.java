package atividade02;

import java.util.Scanner;

public class ContaMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Conta conta = null;

        int opcao = 0;
        menuDeEscolhas();
        opcao = entrada.nextInt();
        while(opcao < 1 || opcao > 5) {
            System.out.println("\nOpcao invalida, selecione uma das opcoes abaixo\n");
            menuDeEscolhas();
            opcao = entrada.nextInt();
        }
        while(opcao != 5) {
            if(conta == null && opcao != 1) {
                System.out.println("\nVoce precisa cadastrar uma conta primeiro\n");
            }else {
                switch (opcao) {
                    case 1:
                        System.out.println("======= CADASTRO DE CONTA DO CLIENTE =======");

                        System.out.print("Digite o numero da conta: ");
                        int numeroConta = entrada.nextInt();

                        System.out.print("Digite o nome do titular da conta: ");
                        entrada.nextLine();
                        String titular = entrada.nextLine();

                        System.out.print("Qual o saldo inicial da conta? ");
                        double saldoInicial = entrada.nextDouble();
                        if(saldoInicial == 0.0) {
                            conta = new Conta(numeroConta, titular);
                        }else {
                            conta = new Conta(numeroConta, titular,saldoInicial);
                        }
                        System.out.println("\nConta criada com sucesso!!!\n");
                        break;
                    case 2:
                        System.out.println("R$" + String.format("%.2f", conta.getSaldo()) + "\n");
                        break;
                    case 3:
                        System.out.print("Qual o valor voce deseja sacar? R$");
                        double saque = entrada.nextDouble();
                        boolean resultado = conta.sacarDinheiro(saque);
                        if(resultado) {
                            System.out.println("Saque realizado com sucesso.\n");
                        }else {
                            System.out.println("Nao foi possivel realizar o saque - Saldo insuficiente\n");
                        }
                        break;
                    case 4:
                        System.out.print("Qual o valor voce deseja depositar? ");
                        double deposito = entrada.nextDouble();
                        conta.depositar(deposito);
                        System.out.println("\nDeposito realizado com sucesso\n");
                        break;
                    }
                }
            menuDeEscolhas();
            opcao = entrada.nextInt();
            while(opcao < 1 || opcao > 5) {
                System.out.println("\nOpcao invalida, selecione uma das opcoes abaixo\n");
                menuDeEscolhas();
                opcao = entrada.nextInt();
            }
        }

        System.out.println("Voce finalizou as operacoes");
        entrada.close();
    }

    static void menuDeEscolhas() {
        System.out.println("======= Escolha uma opcao ======");
        System.out.println("1 - Cadastrar uma conta de cliente");
        System.out.println("2 - Mostrar saldo da conta");
        System.out.println("3 - Sacar dinheiro da conta");
        System.out.println("4 - Depositar dinheiro na conta");
        System.out.println("5 - Finalizar operaçoes\n");
        System.out.print("Opcao:\n> ");
    }
}
