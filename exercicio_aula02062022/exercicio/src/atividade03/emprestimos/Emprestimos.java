package atividade03.emprestimos;

import java.net.JarURLConnection;

public class Emprestimos {
    private Cliente[] emprestimosVet;
    private int quantVetor;

    public Emprestimos(int quantidade) {
        this.emprestimosVet = new Cliente[quantidade];
        this.quantVetor = 0;
    }

    public Cliente getEmprestimosVet(int indice) {
        return this.emprestimosVet[indice];
    }

    public void setEmprestimosVet(int indice, Cliente cliente) {
        this.emprestimosVet[indice] = cliente;
    }

    public Cliente[] getEmprestimosVet() {
        return emprestimosVet;
    }

    public int getQuantVetor() {
        return quantVetor;
    }

    public void setQuantVetor(int quantVetor) {
        this.quantVetor = quantVetor;
    }

    public String toString() {
        String resposta = "";
        for(int i = 0; i < this.quantVetor; i++) {
            resposta += (i+1) + "\n" + this.emprestimosVet[i].toString();
        }
        return resposta;
    }

    public boolean inserirCliente(Cliente cliente){
        if(this.quantVetor == this.emprestimosVet.length) {
            return false;
        }else {
            this.emprestimosVet[this.quantVetor] = cliente;
            this.quantVetor++;
            return true;
        }
    }

    public void juros() {
        if(this.emprestimosVet.length != 0) {
            for(int i = 0; i < this.emprestimosVet.length; i++) {
                double jurosTotal = (this.emprestimosVet[i].getJurosPorMes() / 100) * this.emprestimosVet[i].getValorDoEmprestimo();
                String nome = this.emprestimosVet[i].getNomeDoCliente();
                System.out.println(nome + " - " + "R$" + String.format("%.2f", jurosTotal));
            }
        }
    }

    public void alterarJuros(double juros) {
        double maiorValor = emprestimosVet[0].getValorDoEmprestimo();
        int posicao = 0;
        String nome = "";
        for(int i = 0; i < emprestimosVet.length; i++) {
            if(emprestimosVet[i].getValorDoEmprestimo() > maiorValor) {
                maiorValor = emprestimosVet[i].getValorDoEmprestimo();
                posicao = i;
                // posicao = 0;
                // posicao = 1;
                // posicao = 2;
            }
        }
        // 0 = 5000
        // 1 = 6000 maiorValor
        // 2 = 7000


        nome = emprestimosVet[posicao].getNomeDoCliente();
        System.out.println("A pessoa com o maior valor do emprestimo se chama: " + nome);
        System.out.println("Novo valor do juros alterado com sucesso");
        emprestimosVet[posicao].setJurosPorMes(juros);
        double novoValor = (emprestimosVet[posicao].getJurosPorMes() / 100) * emprestimosVet[posicao].getValorDoEmprestimo();
        System.out.println("Novo valor de Juros por mês: R$" + String.format("%.2f", novoValor));
    }
}
