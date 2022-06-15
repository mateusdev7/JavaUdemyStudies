package atividade03.banco;

public class Banco {
    private Conta[] bancoVet;
    private int quantVetor;

    public Banco(int quantidade) {
        this.bancoVet = new Conta[quantidade];
        this.quantVetor = 0;
    }

    public Conta getBancoVet(int indice) {
        return this.bancoVet[indice];
    }

    public void setBancoVet(int indice, Conta conta) {
        this.bancoVet[indice] = conta;
    }

    public Conta[] getBancoVet() {
        return bancoVet;
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
            resposta += (i+1) + "\n" + this.bancoVet[i].toString();
        }
        return resposta;
    }

    public boolean inserirConta(Conta conta) {
        if(this.quantVetor == this.bancoVet.length) {
            return false;
        }else {
            this.bancoVet[this.quantVetor] = conta;
            this.quantVetor++;
            return true;
        }
    }

    public String mostrarContas(String nome) {
        String resposta = "";
        for(int i = 0; i < bancoVet.length; i++) {
            if(bancoVet[i].getNomeDoCliente().equalsIgnoreCase(nome)) {
                resposta += "\nConta:\n" + "Numero da conta: " + bancoVet[i].getNumeroDaConta() + "\n" +
                        "Saldo da conta: R$" + String.format("%.2f", bancoVet[i].getSaldo()) + "\n";
            }
        }
        if(resposta.isEmpty()) {
            resposta = "Conta com o nome " + nome + " nao foi encontrada.";
        }
        return resposta;
    }

    public String removerConta() {
        String resposta = "";
        double menorValor = bancoVet[0].getSaldo();
        int j = 0;
        while((j < bancoVet.length) && (bancoVet[j].getSaldo() > menorValor)){
            j++;
        }
        menorValor = bancoVet[j].getSaldo();
        for(int i = 0; i < this.quantVetor; i++) {
            if(bancoVet[i].getSaldo() == menorValor) {
                bancoVet[i] = bancoVet[quantVetor - 1];
                quantVetor--;
            }
        }
        resposta = "Conta removida";
        return resposta;
    }
}
