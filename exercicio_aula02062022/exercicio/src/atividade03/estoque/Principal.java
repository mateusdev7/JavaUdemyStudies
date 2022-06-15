package atividade03.estoque;

import atividade03.escola.Aluno;
import atividade03.escola.AlunoVet;

import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("====== Cadastro de Produtos ======");

        Estoque estoque = null;

        int opcao = 0;
        mostrarMenu();
        opcao = entrada.nextInt();
        while(opcao < 1 || opcao > 4) {
            System.out.print("Opçao invalida, escolha uma das opcoes abaixo: ");
            mostrarMenu();
            opcao = entrada.nextInt();
        }
        while(opcao != 4) {
            if(estoque == null && opcao != 1) {
                System.out.println("Voce precisa incluir brinquedos primeiro");
            }else {
                switch (opcao) {
                    case 1:
                        System.out.print("Qual a quantidade de produtos que serao incluidos no estoque? ");
                        int quantidade = entrada.nextInt();
                        estoque = new Estoque(quantidade);

                        for(int i = 0; i < quantidade; i++) {
                            System.out.println("====== Inlcusao de Brinquedos no Estoque ======");

                            System.out.print("Digite o codigo do produto: ");
                            entrada.nextLine();
                            int codigoDoProduto = entrada.nextInt();

                            System.out.print("Digite o nome do produto: ");
                            entrada.nextLine();
                            String descricaoDoProduto = entrada.nextLine();

                            System.out.print("Digite o preco de compra: ");
                            double precoDeCompra = entrada.nextDouble();

                            System.out.print("Digite o preco de venda: ");
                            double precoDeVenda = entrada.nextDouble();

                            System.out.print("Digite a quantidade em estoque: ");
                            int quantidadeEmEstoque = entrada.nextInt();

                            System.out.print("Digite o estoque minimo desse produto: ");
                            int estoqueMinimo = entrada.nextInt();

                            Brinquedo brinquedo = new Brinquedo(codigoDoProduto, descricaoDoProduto, precoDeCompra, precoDeVenda, quantidadeEmEstoque, estoqueMinimo);

                            boolean resultado = estoque.inserirProduto(brinquedo);
                            if(resultado) {
                                System.out.println("------ Produto cadastrado com sucesso ------\n");
                            }else {
                                System.out.println("Nao foi possivel cadastrar o Produto no momento :( ");
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Codigo do produto:  ");
                        int codigoDoProduto = entrada.nextInt();
                        System.out.print("Lucro obtido: ");
                        System.out.println("R$" + String.format("%.2f, ", estoque.lucroObtido(codigoDoProduto)));
                        break;
                    case 3:
                        /*if(estoque.getQuantVetor() == 0) {
                            System.out.println("A lista de produtos está vazia");
                        }else {
                            List<String> produtos;
                            produtos = estoque.abaixoEstoqueMinimo();
                            for(int i = 0; i < produtos.size(); i++) {
                                System.out.println(produtos.get(i));
                            }
                        }*/
                        System.out.println(estoque.abaixoEstoqueMinimoString());
                        break;
                }
            }
            if(estoque != null) {
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
        System.out.println(" 1 - Inserir produto no estoque");
        System.out.println(" 2 - Lucro obtido do produto (Inserir codigo do produto): ");
        System.out.println(" 3 - Ver produtos que estão abaixo do estoque minimo");
        System.out.println(" 4 - Sair do sistema");
        System.out.print("Opcao: ");
    }

    public static void mostrarMenu2() {
        System.out.println("\n====== MENU DE OPCOES ======");
        System.out.println(" 2 - Lucro obtido do produto (Inserir codigo do produto): ");
        System.out.println(" 3 - Ver produtos que estão abaixo do estoque minimo");
        System.out.println(" 4 - Sair do sistema");
        System.out.print("Opcao: ");
    }
}
