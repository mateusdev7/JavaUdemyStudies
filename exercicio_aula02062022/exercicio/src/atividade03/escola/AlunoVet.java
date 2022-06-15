package atividade03.escola;

import java.util.ArrayList;
import java.util.List;

public class AlunoVet {
    private Aluno[] alunoVet;
    private int quantVetor;

    public AlunoVet(int tamanho){
        this.alunoVet = new Aluno[tamanho];
        this.quantVetor = 0;
    }

    public Aluno getAlunoVet(int indice) {
        return this.alunoVet[indice];
    }

    public void setAlunoVet(int indice, Aluno aluno) {
        this.alunoVet[indice] = aluno;
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
            resposta += (i+1) + "\n" + this.alunoVet[i].toString();
        }
        return resposta;
    }

    public boolean cadastrarAluno(Aluno aluno) {
        if(this.quantVetor == this.alunoVet.length) {
            return false;
        }else {
            this.alunoVet[this.quantVetor] = aluno;
            this.quantVetor++;
            return true;
        }
    }

    public String consultarAlunos(double nota) {
        String nomes = "";
        if(alunoVet.length == 0) {
            nomes = "Não possuem alunos para serem consultados";
        }else {
            for (int i = 0; i < alunoVet.length; i++) {
                if (alunoVet[i].getNota1() < nota || alunoVet[i].getNota2() < nota) {
                    nomes += (alunoVet[i].getNomeDoAluno()) + ((i < alunoVet.length) ? " - " : "");
                }
                if(nomes.isEmpty()){
                    return "Não existem alunos com nota menor do que " + nota;
                }
            }
        }
        return nomes;
    }

    public List<String> consultar(double nota) {
        List<String> alunos = new ArrayList<>();
        if (!(alunoVet.length == 0)) {
            for(int i = 0; i < alunoVet.length; i++) {
                if(alunoVet[i].getNota1() < nota || alunoVet[i].getNota2() < nota) {
                    alunos.add(alunoVet[i].getNomeDoAluno() + " - ");
                }
            }
        }
        return alunos;
    }

    public List<String> media() {
        List<String> nomes = new ArrayList<>();
        if(!(alunoVet.length == 0)) {
            for(int i = 0; i < alunoVet.length; i++) {
                double media = (alunoVet[i].getNota1() + alunoVet[i].getNota2()) / 2;
                nomes.add(alunoVet[i].getNomeDoAluno() + " - " + media);
            }
        }
        return nomes;
    }

    public String mediaString() {
        double media = 0.0;
        String resposta = "";
        if(!(alunoVet.length == 0)) {
            for(int i = 0; i < alunoVet.length; i++) {
                media = (alunoVet[i].getNota1() + alunoVet[i].getNota2()) / 2;
                resposta += alunoVet[i].getNomeDoAluno() + " - " + media + "\n";
            }
        }
        return resposta;
    }
}
