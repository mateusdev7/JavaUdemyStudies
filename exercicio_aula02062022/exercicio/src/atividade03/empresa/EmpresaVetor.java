package atividade03.empresa;

public class EmpresaVetor {
    private Vendedor[] vetor;
    private int quantVetor;

    public EmpresaVetor(int tamanho) {
        this.vetor = new Vendedor[tamanho];
        this.quantVetor = 0;
    }

    public Vendedor getVetor(int indice) {
        return this.vetor[indice];
    }

    public void setVetor(int indice, Vendedor vendedor) {
        this.vetor[indice] = vendedor;
    }

    public int getQuantVetor() {
        return quantVetor;
    }

    public void setQuantVetor(int novo) {
        this.quantVetor = novo;
    }

    public boolean inserirVendedor(Vendedor vendedor) {
        if(this.quantVetor == this.vetor.length) {
            return false;
        }else {
            this.vetor[this.quantVetor] = vendedor;
            this.quantVetor++;
            return true;
        }
    }

    public int consultarPorTipoDeMercadoria(char mercadora) {
        int total = 0;
        if(this.quantVetor == 0) {
            return 0;
        }else {
            for(int i = 0; i < this.quantVetor; i++) {
                if(this.vetor[i].getTipoDeMercadoria() == mercadora) {
                    total += 1;
                }
            }
            return total;
        }
    }

    public boolean excluirVendedor(String vendedor) {
        if(this.quantVetor == 0) {
            return false;
        }else {
            int i = 0;
            while(i < this.quantVetor && this.vetor[i].getNomeDoVendedor() != vendedor) {
                i++;
            }
            if(i == this.quantVetor) {
                return false;
            }else {
                this.vetor[i] = this.vetor[this.quantVetor -1];
                this.quantVetor--;
                return true;
            }
        }
    }

    public boolean removerVendedor(String vendedor) {
        if(this.quantVetor == 0) {
            return false;
        }else {
            for(int i = 0; i < this.quantVetor; i++) {
                if(this.vetor[i].getNomeDoVendedor().equalsIgnoreCase(vendedor)) {
                    this.vetor[i] = this.vetor[this.quantVetor - 1];
                    this.quantVetor--;
                }
            }
            return true;
        }
    }

    public String toString() {
        String resposta = "";
        for(int i = 0; i < this.quantVetor; i++) {
            resposta += (i+1) + "." + this.vetor[i].toString();
        }
        return resposta;
    }
}
