package atividade03.empresa;

public class Vendedor {
    private int codigoDoVendedor;
    private String nomeDoVendedor;
    private char tipoDeMercadoria;

    public Vendedor(){
    }

    public Vendedor(int codigoDoVendedor, String nomeDoVendedor, char tipoDeMercadoria) {
        this.codigoDoVendedor = codigoDoVendedor;
        this.nomeDoVendedor = nomeDoVendedor;
        this.tipoDeMercadoria = tipoDeMercadoria;
    }

    public int getCodigoDoVendedor() {
        return codigoDoVendedor;
    }

    public void setCodigoDoVendedor(int codigoDoVendedor) {
        this.codigoDoVendedor = codigoDoVendedor;
    }

    public String getNomeDoVendedor() {
        return nomeDoVendedor;
    }

    public void setNomeDoVendedor(String nomeDoVendedor) {
        this.nomeDoVendedor = nomeDoVendedor;
    }

    public char getTipoDeMercadoria() {
        return tipoDeMercadoria;
    }

    public void setTipoDeMercadoria(char tipoDeMercadoria) {
        this.tipoDeMercadoria = tipoDeMercadoria;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo do Vendedor: ");
        sb.append(codigoDoVendedor + "\n");
        sb.append("Nome do vendedor: ");
        sb.append(nomeDoVendedor + "\n");
        sb.append("Tipo de mercadoria: ");
        if(tipoDeMercadoria == 'p') {
            sb.append("Perecivel" + "\n");
        }else if(tipoDeMercadoria == 'n') {
            sb.append("Nao perecivel" + "\n");
        }
        sb.append("\n");
        return sb.toString();
    }
}
