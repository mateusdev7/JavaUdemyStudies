package atividade03.locadora;

public class Filme {
    private int codigoDoFilme;
    private String tituloDoFilme;
    private char generoDoFilme;

    public Filme(){
    }

    public Filme(int codigoDoFilme, String tituloDoFilme, char generoDoFilme) {
        this.codigoDoFilme = codigoDoFilme;
        this.tituloDoFilme = tituloDoFilme;
        this.generoDoFilme = generoDoFilme;
    }

    public int getCodigoDoFilme() {
        return codigoDoFilme;
    }

    public void setCodigoDoFilme(int codigoDoFilme) {
        this.codigoDoFilme = codigoDoFilme;
    }

    public String getTituloDoFilme() {
        return tituloDoFilme;
    }

    public void setTituloDoFilme(String tituloDoFilme) {
        this.tituloDoFilme = tituloDoFilme;
    }

    public char getGeneroDoFilme() {
        return generoDoFilme;
    }

    public void setGeneroDoFilme(char generoDoFilme) {
        this.generoDoFilme = generoDoFilme;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do filme: ");
        sb.append(tituloDoFilme + "\n");
        sb.append("Codigo do filme: ");
        sb.append(codigoDoFilme + "\n");
        sb.append("Genero do filme: ");
        sb.append(generoDoFilme + "\n");
        return sb.toString();
    }
}
