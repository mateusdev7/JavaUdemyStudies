package atividade03.emprestimos;

public class Cliente {
    private String nomeDoCliente;
    private double valorDoEmprestimo;
    private double jurosPorMes;

    public Cliente(){
    }

    public Cliente(String nomeDoCliente, double valorDoEmprestimo, double jurosPorMes) {
        this.nomeDoCliente = nomeDoCliente;
        this.valorDoEmprestimo = valorDoEmprestimo;
        this.jurosPorMes = jurosPorMes;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public double getValorDoEmprestimo() {
        return valorDoEmprestimo;
    }

    public void setValorDoEmprestimo(double valorDoEmprestimo) {
        this.valorDoEmprestimo = valorDoEmprestimo;
    }

    public double getJurosPorMes() {
        return jurosPorMes;
    }

    public void setJurosPorMes(double jurosPorMes) {
        this.jurosPorMes = jurosPorMes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome do cliente: ");
        sb.append(nomeDoCliente + "\n");
        sb.append("Valor do emprestimo: ");
        sb.append(String.format("%.2f",valorDoEmprestimo) + "\n");
        sb.append("Juros por mês: ");
        sb.append(jurosPorMes + "\n");

        return sb.toString();
    }
}
