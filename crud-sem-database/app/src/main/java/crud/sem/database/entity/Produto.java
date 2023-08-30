package crud.sem.database.entity;

public class Produto {
    private Long id;
    private String nome;
    private Double preco;
    private Integer qtde;

    public Produto() {
    }

    public Produto(String nome, Double preco, Integer qtde) {
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public Produto(Long id, String nome, Double preco, Integer qtde) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtde() {
        return this.qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public String toString() {
        return id + " " + nome + " " + preco.toString() + " " + qtde;
    }
}
