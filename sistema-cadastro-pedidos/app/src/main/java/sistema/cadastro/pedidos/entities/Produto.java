package sistema.cadastro.pedidos.entities;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private Double preco;
    private boolean disponivel;

    public Produto(int id, String nome, String descricao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.disponivel = true;
    }

    public Double getPreco() {
        return this.preco;
    }

    public boolean estaDisponivel() {
        return this.disponivel;
    }

    public void disponibilizar() {
        this.disponivel = true;
    }

    public void indisponibilizar() {
        this.disponivel = false;
    }
}
