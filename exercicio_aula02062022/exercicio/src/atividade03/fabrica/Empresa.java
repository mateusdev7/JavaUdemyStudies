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

    public String salarioBrutoString() {
        // Operário
        double resultadoOperario;
        double salarioOperario;
        double acrescimoOperario;

        // Gerente
        double resultadoGerente;
        double salarioGerente;
        double acrescimoGerente;
        String resposta = "";
        if(!(vetorDefuncionarios.length == 0)){
            for(int i = 0; i < vetorDefuncionarios.length; i++) {
                if(vetorDefuncionarios[i].getCategoria() == 'O' || vetorDefuncionarios[i].getCategoria() == 'o') {
                    salarioOperario = (vetorDefuncionarios[i].getNumeroDeHorasTrabalhadas() / 30) * 112;
                    acrescimoOperario = 0.10 * salarioOperario;
                    resultadoOperario = salarioOperario + acrescimoOperario;
                    resposta += "Nome do funcionário: " + vetorDefuncionarios[i].getNomeDoFuncionario() +
                            "\nSalário bruto: " + "R$" + String.format("%.2f", resultadoOperario) + "\n";
                }else if(vetorDefuncionarios[i].getCategoria() == 'G' || vetorDefuncionarios[i].getCategoria() == 'g') {
                    salarioGerente = (vetorDefuncionarios[i].getNumeroDeHorasTrabalhadas() / 30) * 112;
                    acrescimoGerente = 0.15 * salarioGerente;
                    resultadoGerente = salarioGerente + acrescimoGerente;
                    resposta += "Nome do funcionário: " + vetorDefuncionarios[i].getNomeDoFuncionario() +
                            "\nSalário bruto: " + "R$" + String.format("%.2f", resultadoGerente) + "\n";
                }
            }
        }
        return resposta;
    }

    public List<String> salarioBruto() {
        // Operário
        double resultadoOperario;
        double salarioOperario;
        double acrescimoOperario;

        // Gerente
        double resultadoGerente;
        double salarioGerente;
        double acrescimoGerente;
        String resposta = "";
        List<String> lista = new ArrayList<>();
        if(!(vetorDefuncionarios.length == 0)) {
            for(int i = 0; i < vetorDefuncionarios.length; i++) {
                if(vetorDefuncionarios[i].getCategoria() == 'O' || vetorDefuncionarios[i].getCategoria() == 'o') {
                    salarioOperario = (vetorDefuncionarios[i].getNumeroDeHorasTrabalhadas() / 30) * 112;
                    acrescimoOperario = 0.10 * salarioOperario;
                    resultadoOperario = salarioOperario + acrescimoOperario;
                    lista.add("Nome do funcionário: " + vetorDefuncionarios[i].getNomeDoFuncionario() +
                            "Salário bruto: "+"\nR$" + String.format("%.2f", resultadoOperario) + "\n");
                }else if(vetorDefuncionarios[i].getCategoria() == 'G' || vetorDefuncionarios[i].getCategoria() == 'g') {
                    salarioGerente = (vetorDefuncionarios[i].getNumeroDeHorasTrabalhadas() / 30) * 112;
                    acrescimoGerente = 0.15 * salarioGerente;
                    resultadoGerente = salarioGerente + acrescimoGerente;
                    lista.add("Nome do funcionário: " + vetorDefuncionarios[i].getNomeDoFuncionario() +
                            "Salário bruto: "+"\nR$" + String.format("%.2f", resultadoGerente) + "\n");
                }
            }
        }
        return lista;
    }

}
