package atividade03.fabrica;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private Funcionario[] vetorDefuncionarios;
    private int quantVetor;

    public Empresa(int quantidade) {
        this.vetorDefuncionarios = new Funcionario[quantidade];
        this.quantVetor = 0;
    }

    public Funcionario getVetorDeFuncionarios(int indice) {
        return this.vetorDefuncionarios[indice];
    }

    public void setVetorDefuncionarios(int indice, Funcionario funcionario) {
        this.vetorDefuncionarios[indice] = funcionario;
    }

    public Funcionario[] getVetorDefuncionarios() {
        return vetorDefuncionarios;
    }

    public void setVetorDefuncionarios(Funcionario[] vetorDefuncionarios) {
        this.vetorDefuncionarios = vetorDefuncionarios;
    }

    public int getQuantVetor() {
        return quantVetor;
    }

    public void setQuantVetor(int quantVetor) {
        this.quantVetor = quantVetor;
    }

    public String toString() {
        String resposta = "";
        for(int i = 0; i < vetorDefuncionarios.length; i++) {
            resposta += (i+1) + ":\n" + this.vetorDefuncionarios[i].toString();
        }
        return resposta;
    }

    public boolean inserirFuncionario(Funcionario funcionario) {
        if(this.quantVetor == this.vetorDefuncionarios.length) {
            return false;
        }else {
            this.vetorDefuncionarios[quantVetor] = funcionario;
            this.quantVetor++;
            return true;
        }
    }

    public String alterarHorasTrabalhadas(String nome, double horas) {
        String resposta = "";
        if(!(this.quantVetor == 0)) {
            for(int i = 0; i < vetorDefuncionarios.length; i++) {
                if(vetorDefuncionarios[i].getNomeDoFuncionario().equalsIgnoreCase(nome)) {
                    vetorDefuncionarios[i].setNumeroDeHorasTrabalhadas(horas);
                    resposta += "Horas do funcionário " + vetorDefuncionarios[i].getNomeDoFuncionario() + " foi alterado";
                }
            }
        }
        return resposta;
    }

    public List<String> salarioBruto() {
        double resultado = 0.0;
        List<String> lista = new ArrayList<>();
        if(!(vetorDefuncionarios.length == 0)) {
            for(int i = 0; i < vetorDefuncionarios.length; i++) {
                if(vetorDefuncionarios[i].getCategoria() == 'O' || vetorDefuncionarios[i].getCategoria() == 'o') {
                    double salario = (vetorDefuncionarios[i].getNumeroDeHorasTrabalhadas() / 30) * 112;
                    double acrescimo = 0.10 * salario;
                    resultado += salario + acrescimo;
                    lista.add("Nome do funcionário: " + vetorDefuncionarios[i].getNomeDoFuncionario() + "\nR$" + String.format("%.2f", resultado) + "\n");
                }else if(vetorDefuncionarios[i].getCategoria() == 'G' || vetorDefuncionarios[i].getCategoria() == 'g') {
                    double salario = (vetorDefuncionarios[i].getNumeroDeHorasTrabalhadas() / 30) * 112;
                    double acrescimo = 0.15 * salario;
                    resultado += salario + acrescimo;
                    lista.add("Nome do funcionário: " + vetorDefuncionarios[i].getNomeDoFuncionario() + "\nR$" + String.format("%.2f", resultado) + "\n");
                }
            }
        }
        return lista;
    }
}
