package application;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = entrada.nextLine();

        System.out.println("Enter Worker data:");

        System.out.print("Name:");
        String workerName = entrada.nextLine();

        System.out.print("Level:");
        String workerLevel = entrada.nextLine();

        System.out.print("Base Salary:");
        Double workerBaseSalary = entrada.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Departament(departmentName));

        System.out.print("How many contracts to this worker?");
        int n = entrada.nextInt();

        // criação dos contratos e associação nele ao trabalhador
        for(int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(entrada.next());
            System.out.print("Value per hour: ");
            double valuePerHor = entrada.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = entrada.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHor, hours);
            worker.addContracts(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = entrada.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName()); // Associando o objeto que está dentro do objeto trabalhador
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month))) ;

        entrada.close();
    }
}
