package atividade03.fabrica;

public class Funcionario {
    private String nomeDoFuncionario;
    private double numeroDeHorasTrabalhadas;
    private char categoria;

    public Funcionario(){
    }

    public Funcionario(String nomeDoFuncionario, double numeroDeHorasTrabalhadas, char categoria) {
        this.nomeDoFuncionario = nomeDoFuncionario;
        this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
        this.categoria = categoria;
    }

    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
    }

    public double getNumeroDeHorasTrabalhadas() {
        return numeroDeHorasTrabalhadas;
    }

    public void setNumeroDeHorasTrabalhadas(double numeroDeHorasTrabalhadas) {
        this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome do funcionário: ");
        sb.append(nomeDoFuncionario + "\n");
        sb.append("Número de horas trabalhas: ");
        sb.append(numeroDeHorasTrabalhadas + "\n");
        sb.append("Categoria: ");
        if(categoria == 'O' || categoria == 'o'){
            sb.append("Operário");
        }else if(categoria == 'G' || categoria == 'g') {
            sb.append("Gerente");
        }
        return sb.toString();
    }
}
