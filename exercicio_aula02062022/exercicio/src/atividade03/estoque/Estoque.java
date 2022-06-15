package atividade03.estoque;

import atividade03.escola.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private Brinquedo[]  brinquedosVet;
    private int quantVetor;

    public Estoque(int tamanho){
        this.brinquedosVet = new Brinquedo[tamanho];
        this.quantVetor = 0;
    }

    public Brinquedo getBrinquedosVet(int indice) {
        return this.brinquedosVet[indice];
    }

    public void setBrinquedosVet(int indice, Brinquedo brinquedo) {
        this.brinquedosVet[indice] = brinquedo;
    }

    public int getQuantVetor() {
        return quantVetor;
    }

    public void setQuantVetor(int quantVetor) {
        this.quantVetor = quantVetor;
    }

    public boolean inserirProduto(Brinquedo brinquedo) {
        if(this.quantVetor == this.brinquedosVet.length) {
            return false;
        }else {
            this.brinquedosVet[this.quantVetor] = brinquedo;
            this.quantVetor++;
            return true;
        }
    }

    public double lucroObtido(int codigoDoProduto) {
        double lucro = 0.0;
        if(!(brinquedosVet.length == 0)) {
            for(int i = 0; i < brinquedosVet.length; i++) {
                if(brinquedosVet[i].getCodigo() == codigoDoProduto) {
                    lucro += brinquedosVet[i].getPrecoDeVenda() * brinquedosVet[i].getQuantidadeEmEstoque();
                }
            }
        }
        return lucro;
    }

    public List<String> abaixoEstoqueMinimo(){
        List<String> produtos = new ArrayList<>();
        if(!(brinquedosVet.length == 0)) {
            for(int i = 0; i < brinquedosVet.length; i++) {
                if(brinquedosVet[i].getQuantidadeEmEstoque() < brinquedosVet[i].getEstoqueMinimo()) {
                    produtos.add(brinquedosVet[i].getDescricao() + ((i > 1) ? " - " : ""));
                }
            }
        }
        return produtos;
    }

    public String abaixoEstoqueMinimoString() {
        String resposta = "";
        if(!(brinquedosVet.length == 0)) {
            for(int i = 0; i < brinquedosVet.length; i++) {
                if(brinquedosVet[i].getQuantidadeEmEstoque() < brinquedosVet[i].getEstoqueMinimo()) {
                    resposta += brinquedosVet[i].getDescricao() + "\nEstoque: " + brinquedosVet[i].getQuantidadeEmEstoque() +
                    "\nEstoque minimo: " + brinquedosVet[i].getEstoqueMinimo() + "\n";
                }
            }
        }
        return resposta;
    }

    public String toString() {
        String resposta = "";
        for(int i = 0; i < this.quantVetor; i++) {
            resposta += (i+1) + "\n" + this.brinquedosVet[i].toString();
        }
        return resposta;
    }
}
