package atividade03.estoque;

public class Brinquedo {
    private int codigo;
    private String descricao;
    private double precoDeCompra;
    private double precoDeVenda;
    private int quantidadeEmEstoque;
    private int estoqueMinimo;

    public Brinquedo() {
    }

    public Brinquedo(int codigo, String descricao, double precoDeCompra, double precoDeVenda, int quantidadeEmEstoque, int estoqueMinimo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo do produto: ");
        sb.append(codigo + "\n");
        sb.append("Descricao: ");
        sb.append(descricao + "\n");
        sb.append("Preço de compra: ");
        sb.append(String.format("%.2f", precoDeCompra) + "\n");
        sb.append("Preço de venda: ");
        sb.append(String.format("%.2f", precoDeVenda) + "\n");
        sb.append("Quantidade em estoque: ");
        sb.append(quantidadeEmEstoque + "\n");
        sb.append("Estoque minimo: ");
        sb.append(estoqueMinimo + "\n");
        return sb.toString();
    }
}
