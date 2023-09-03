package eventos.entity;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String nome;
    private String matricula;
    private Estado estado;
    private List<Contrato> contratosTrabalho;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.estado = Estado.VIVO;
        this.contratosTrabalho = new ArrayList<>();
    }

    public void falecer() {
        this.estado = Estado.MORTO;
    }

    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public List<Contrato> getContratosTrabalho() {
        return contratosTrabalho;
    }

    public Estado getEstado() {
        return estado;
    }

    
    
}
