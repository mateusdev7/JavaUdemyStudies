package atividade03.fabrica;

import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Empresa vetEmpresa = null;
        Funcionario funcionario;

        int opcao;
        mostrarMenu();
        opcao = entrada.nextInt();
        while(opcao < 1 || opcao > 4){
            System.out.println("Opção inválida");
            mostrarMenu();
            opcao = entrada.nextInt();
        }
        while(opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.println("Quantos funcionários serão cadastradas? ");
                    int total = entrada.nextInt();
                    while(total < 1 || total > 18) {
                        System.out.println("So é possível cadastrar no máximo 18 funcionários");
                        System.out.print("Por favor, digite um novo valor entra 1 e 18: ");
                        total = entrada.nextInt();
                    }

                    vetEmpresa = new Empresa(total);
                    for(int i = 0; i < total; i++) {
                        System.out.print("\nNome do funcionário: ");
                        entrada.nextLine();
                        String nomeDoFuncionario = entrada.nextLine();

                        System.out.print("Número de horas trabalhadas no mês: ");
                        double numeroDeHorasTrabalhadas = entrada.nextDouble();

                        System.out.print("Categoria (O - Operário; G - Gerente): ");
                        char categoria = entrada.next().charAt(0);

                        funcionario = new Funcionario(nomeDoFuncionario, numeroDeHorasTrabalhadas, categoria);

                        boolean insercao = vetEmpresa.inserirFuncionario(funcionario);
                        if(insercao) {
                            System.out.println("Funcionário cadastrado com êxito");
                        }else{
                            System.out.println("Ops... Aconteceu algo, não foi possível cadastrar o funcionário");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Nome do funcionário: ");
                    entrada.nextLine();
                    String nome = entrada.nextLine();

                    System.out.print("Nova quantidade de horas trabalhadas: ");
                    double novoValor = entrada.nextDouble();

                    System.out.println(vetEmpresa.alterarHorasTrabalhadas(nome, novoValor));
                    break;
                case 3:
                    List<String> funcionarios;
                    funcionarios = vetEmpresa.salarioBruto();
                    for(int i = 0; i < funcionarios.size(); i++) {
                        System.out.println(funcionarios.get(i));
                    }
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
        System.out.println(" 1 - Cadastrar funcionário");
        System.out.println(" 2 - Alterar o número de horas trabalhadas de um determinado funcionário");
        System.out.println(" 3 - Mostrar todos os dados dos funcionários e seus respectivos salários brutos");
        System.out.println(" 4 - Sair do sistema");
        System.out.print("Opcao:\n>");
    }
}
