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
                    lucro = brinquedosVet[i].getPrecoDeVenda() * brinquedosVet[i].getPrecoDeVenda();
                }
            }
        }
        return lucro;
    }

    public List<String> consultarProdutos(int estoqueMinimo){
        List<String> produtos = new ArrayList<>();
        if(!(brinquedosVet.length == 0)) {
            for(int i = 0; i < brinquedosVet.length; i++) {
                if(brinquedosVet[i].getEstoqueMinimo() < estoqueMinimo) {
                    produtos.add(brinquedosVet[i].getDescricao() + " - ");
                }
            }
        }
        return produtos;
    }
}
