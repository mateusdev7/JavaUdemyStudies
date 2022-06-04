package atividade02;

public class Conta {
    private int numeroConta;
    private String titular;
    private double saldo;

    public Conta(){
    }

    public Conta(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacarDinheiro(double saque){
        if(saque <= saldo) {
            saldo -= saque;
            return true; // Saque sucessido
        }else {
            return false; // Saque não sucessido
        }
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }
}
