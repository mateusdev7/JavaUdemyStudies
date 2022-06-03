package atividade01;

public class Pauta {
    private int matricula;
    private String nomeDoAluno;
    private int numFalta;
    private double nota1, nota2;

    public Pauta(){
    }

    public Pauta(int matricula, String nomeDoAluno, int numFalta, double nota1, double nota2) {
        this.matricula = matricula;
        this.nomeDoAluno = nomeDoAluno;
        this.numFalta = numFalta;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public int getNumFalta() {
        return numFalta;
    }

    public void setNumFalta(int numFalta) {
        this.numFalta = numFalta;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public boolean reprovadoPorFalta() {
        if(numFalta > 25) {
            return true; // reprovado
        }else {
            return false; // aprovado
        }
    }

    public boolean situacaoDeReprovacao() {
        if(calcularMedia() >= 7 && numFalta <= 25) {
            return true; // aprovado
        }else {
            return false; // reprovado
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matricula: ");
        sb.append(matricula + "\n");
        sb.append("Nome: ");
        sb.append(nomeDoAluno + "\n");
        sb.append("Numero de faltas: ");
        sb.append(numFalta + "\n");
        sb.append("A primeira e segunda nota do aluno foram, respectivamente: ");
        sb.append(nota1 + ", ");
        sb.append(nota2 + "\n");
        sb.append("\n");
        return sb.toString();
    }
}
