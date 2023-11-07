package br.edu.fatecrl.demomvc.models;

public class Mercado {
    private String produto;
    private int quantidade;
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Mercado(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
