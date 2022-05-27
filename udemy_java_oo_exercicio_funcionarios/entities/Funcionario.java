package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double desconto;

    public double salarioLiquido() {
        return salarioBruto - desconto;
    }

    public double aumento(double taxaDeAumento) {
        return salarioBruto += salarioBruto * taxaDeAumento / 100.0;
    }

    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }
}
