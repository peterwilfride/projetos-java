package funcionarios.entity;

public class Funcionario {
    private Long id;
    private String nome;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
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

    public Double getSalario() {
        return this.salario;
    }

    public void aumentarSalario(int percentual) {
        this.salario += this.salario * ((double)percentual / 100.0);
    }

    public String toString() {
        return "id:" + id + " Nome: " + nome + " Salário: " + salario.toString();
    }
}
