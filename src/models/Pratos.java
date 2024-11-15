package models;

public class Pratos{
    private int id;
    private String nome;
    private String descricao;
    private float preco;

    public Pratos(){
    }

    public Pratos(int id, String nome, String descricao, float preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String toString() {
        return "ID: " + getId() + "\nNome: " + getNome() + "\nDescrição: " + getDescricao() + "\nPreço: " + getPreco();
    }
}
