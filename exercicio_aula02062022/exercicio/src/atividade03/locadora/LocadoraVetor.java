package atividade03.locadora;

public class LocadoraVetor {
    private Filme[] vetor;
    private int quantVetor;

    public LocadoraVetor(int tamanho) {
        this.vetor = new Filme[tamanho];
        this.quantVetor = 0;
    }

    public Filme getVetor(int indice) {
        return this.vetor[indice];
    }

    public void setVetor(int indice, Filme novo) {
        this.vetor[indice] = novo;
    }

    public int getQuantVetor() {
        return quantVetor;
    }

    public void setQuantVetor(int novo) {
        this.quantVetor = novo;
    }

    public String toString() {
        String resposta = "";
        for(int i = 0; i < this.quantVetor; i++) {
            resposta += (i+1) + ":\n" + this.vetor[i].toString();
        }
        return resposta;
    }

    public boolean inserirFilme(Filme novoFilme) {
        if(this.quantVetor == this.vetor.length) {
            return false;
        }else {
            this.vetor[this.quantVetor] = novoFilme;
            quantVetor++;
            return true;
        }
    }

    public boolean removerFilme(String filme) {
        if(this.quantVetor == 0) {
            return false;
        }else {
            for(int i = 0; i < this.quantVetor; i++) {
                if(this.vetor[i].getTituloDoFilme().equalsIgnoreCase(filme)) {
                    this.vetor[i] = this.vetor[this.quantVetor - 1];
                    this.quantVetor--;
                }
            }
            return true;
        }
    }

    public int totalDeFilmes(char genero) {
        int total = 0;
        if(this.quantVetor == 0) {
            return 0;
        }else {
            for(int i = 0; i < this.quantVetor; i++) {
                if(this.vetor[i].getGeneroDoFilme() == genero){
                    total += 1;
                }
            }
            return total;
        }
    }

}
