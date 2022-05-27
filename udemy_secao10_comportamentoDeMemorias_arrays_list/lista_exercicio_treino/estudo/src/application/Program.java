package application;

import entities.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        List<Cliente> listaDeClientes = new ArrayList<>();

        int id, idade;
        String nome, telefone;

        System.out.println("----------------- CADASTRO DE CLIENTES -----------------");

        while(true) {
            System.out.println();
            System.out.println("Caso queira sair, digite um ID negativo");
            System.out.print("Informe o ID do cliente: ");
            id = entrada.nextInt();

            if(id < 0) {
                System.out.println("Você saiu do programa");
                break;
            }

            System.out.print("Informe o nome do cliente: ");
            entrada.nextLine();
            nome = entrada.nextLine();

            System.out.print("Informe a idade do cliente: ");
            idade = entrada.nextInt();

            System.out.print("Informe o número de telefone do cliente: ");
            telefone = entrada.next();

            Cliente cliente = new Cliente(id, nome, idade, telefone);

            listaDeClientes.add(cliente);
        }

        for (Cliente cliente : listaDeClientes) {
            System.out.println(cliente);
        }

        entrada.close();
    }
}
