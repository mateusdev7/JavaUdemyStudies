package atividade03.emprestimos;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Emprestimos vetEmprestimos = null;
        Cliente cliente;

        int opcao;
        mostrarMenu();
        opcao = entrada.nextInt();
        while(opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida");
            mostrarMenu();
            opcao = entrada.nextInt();
        }

        while(opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.print("Quantos empréstimos serão efetuados?\n> ");
                    int total = entrada.nextInt();
                    vetEmprestimos = new Emprestimos(total);
                    for(int i = 0; i < total; i++) {
                        System.out.print("Qual o nome do cliente: ");
                        entrada.nextLine();
                        String nomeDoCliente = entrada.nextLine();
                        int j = 0;
                        while((j < vetEmprestimos.getQuantVetor()) && (!(nomeDoCliente.equalsIgnoreCase
                                (vetEmprestimos.getEmprestimosVet(j).getNomeDoCliente()))
                        )){
                            j++;
                        }
                        if(j == vetEmprestimos.getQuantVetor()) {
                            System.out.println("Cliente não possui empréstimos ainda, continue com a inserção dos dados");
                        }else {
                            while(nomeDoCliente.equalsIgnoreCase(vetEmprestimos.getEmprestimosVet(j).getNomeDoCliente())) {
                                System.out.println("Esse cliente já possui emprestimo conosco");
                                System.out.print("Insira um novo nome: ");
                                nomeDoCliente = entrada.nextLine();
                            }
                        }


                        System.out.print("Digite o valor do emprestimo: R$");
                        double valorDoEmprestimo = entrada.nextDouble();

                        System.out.print("Digite o valor do Juros por mês (valor a.m em %): ");
                        double jurosPorMes = entrada.nextDouble();

                        cliente = new Cliente(nomeDoCliente, valorDoEmprestimo, jurosPorMes);

                        boolean cadastro = vetEmprestimos.inserirCliente(cliente);
                        if(cadastro) {
                            System.out.println("\n====== Empréstimo realizado ======\n");
                        }else {
                            System.out.println("Não foi possível realizar o empréstimo");
                        }
                    }
                    break;
                case 2:
                    vetEmprestimos.juros();
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Qual o novo valor de Juros: ");
                    double juros = entrada.nextDouble();
                    int i = 0;
                    while((i < vetEmprestimos.getQuantVetor()) && vetEmprestimos.getEmprestimosVet(i).getJurosPorMes() != juros) {
                        i++;
                    }
                    if(i == vetEmprestimos.getQuantVetor()) {
                        System.out.println("Juros alterado");
                    }else {
                        while(juros == vetEmprestimos.getEmprestimosVet(i).getJurosPorMes()) {
                            System.out.print("Valor digitado é o de juros atual, escolha um novo valor: ");
                            juros = entrada.nextDouble();
                        }
                    }
                    vetEmprestimos.alterarJuros(juros);
                    break;
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
        System.out.println(" 1 - Cadastrar empréstimos");
        System.out.println(" 2 - Calcular o valor que cada cliente pagará de juros em um mês");
        System.out.println(" 3 - Alterar o juros do cliente que tem o maior valor de empréstimo");
        System.out.println(" 4 - Sair do sistema");
        System.out.print("Opcao: ");
    }
}
