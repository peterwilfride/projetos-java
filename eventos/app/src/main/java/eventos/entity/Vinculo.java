package eventos.entity;

import java.util.List;

public class Vinculo {
    private Long id;
    private Setor setor;
    private boolean isActive;

    public Long getId() {
        return this.id;
    }

    public Setor getSetor() {
        return this.setor;
    }

    public Vinculo() {
    }

    public Vinculo(Long id, Setor setor) {
        this.id = id;
        this.setor = setor;
        this.isActive = true;
    }

    public void inactivate() {
        this.isActive = false;
    }

    public void realocate(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Vinculo [id=" + id + ", setor=" + setor + ", isActive=" + isActive + "]";
    }
}
