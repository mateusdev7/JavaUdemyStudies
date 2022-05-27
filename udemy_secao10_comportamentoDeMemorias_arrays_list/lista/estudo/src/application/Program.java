package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Instancia uma lista do tipo ArrayList
        List<Integer> lista2 = new ArrayList<>();
        List<Boolean> lista3 = new ArrayList<>();
        List<Character> lista4 = new ArrayList<>();
        List<Double> lista5 = new ArrayList<>();

        // Adicionando elementos na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add("Julia");
        list.add("Joao");
        list.add("Jô");
        list.add(2, "Mateus"); // Inserir na posição 2 o elemento 'Mateus'

        System.out.println("Tamanho da lista: " + list.size()); // Tamanho da lista

        for(String obj : list) { // laço for each
            System.out.println(obj);
        }

        System.out.println("-------------------------------");
        list.remove("Ana"); // Remover comparando a String
        list.remove(1); // Remove através do index
        list.removeIf(obj -> obj.charAt(0) == 'J'); // Predicado (Lambda)

        for(String obj : list) {
            System.out.println(obj);
        }

        System.out.println("-------------------------------");
        System.out.println("Index de Bob: " + list.indexOf("Bob"));
        System.out.println("Index de Ana: " + list.indexOf("Ana"));
        System.out.println("-------------------------------");

        List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'M').toList();
        for(String obj : result) {
            System.out.println(obj);
        }

        System.out.println("-------------------------------");
        String name = list.stream().filter(obj -> obj.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);
    }
}
