package atividade03.banco;

public class Conta {
    private int numeroDaConta;
    private String nomeDoCliente;
    private double saldo;

    public Conta() {
    }

    public Conta(int numeroDaConta, String nomeDoCliente, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCliente = nomeDoCliente;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Número da conta: ");
        sb.append(numeroDaConta + "\n");
        sb.append("Nome do Cliente: ");
        sb.append(nomeDoCliente + "\n");
        sb.append("Saldo da conta: R$");
        sb.append(String.format("%.2f",saldo) + "\n");

        return sb.toString();
    }
}
