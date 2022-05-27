package entities;

public class Bank {

    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;

    // Construtor principal
    public Bank(int numeroDaConta, String nomeDoTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        deposito(depositoInicial);
    }

    // Construtor de sobrecarga
    public Bank(int numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }

    // Getters e Setters
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo -= valor + 5;
    }

    public String toString() {
        return "Account " + numeroDaConta + ", Holder: " + nomeDoTitular + ", Balance $ " + String.format("%.2f",saldo);
    }
}
