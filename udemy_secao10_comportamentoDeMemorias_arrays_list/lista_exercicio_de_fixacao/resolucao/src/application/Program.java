package application;

import entities.Pessoa;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int quantidadeDePessoas = entrada.nextInt();

        for(int i = 0; i < quantidadeDePessoas; i++) {
            System.out.println();
            System.out.println("Pessoa #" + (i+1) + ": ");

            System.out.print("Id: ");
            Integer id = entrada.nextInt();
            while(hasId(list, id)) {
                System.out.println("Id already taken! Try again:");
                id = entrada.nextInt();;
            }

            System.out.print("Name: ");
            entrada.nextLine();
            String name = entrada.nextLine();

            System.out.print("Salary: ");
            Double salary = entrada.nextDouble();

            Pessoa pessoa = new Pessoa(id, name, salary);

            list.add(pessoa);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase :");
        int idForIncrease = entrada.nextInt();
        Integer pos = position(list, idForIncrease);
        if(pos == null) {
            System.out.println("This id does not exist!");
        }else {
            System.out.print("Enter the percentage: ");
            double percentage = entrada.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Pessoa pessoa : list) {
            System.out.println(pessoa);
        }

        entrada.close();
    }

    public static Integer position(List<Pessoa> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Pessoa> list, int id) {
        Pessoa emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
