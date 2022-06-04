package atividade03.escola;

public class Aluno {
    private int matricula;
    private String nomeDoAluno;
    private double nota1, nota2;

    public Aluno(){
    }

    public Aluno(int matricula, String nomeDoAluno, double nota1, double nota2) {
        this.matricula = matricula;
        this.nomeDoAluno = nomeDoAluno;
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

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Matricula: ");
        sb.append(matricula + "\n");
        sb.append("Nome do Aluno: ");
        sb.append(nomeDoAluno + "\n");
        sb.append("Nota 1 e nota 2, respectivamente, ");
        sb.append(nota1);
        sb.append(nota2);
        sb.append("\n");
        return sb.toString();
    }
}
