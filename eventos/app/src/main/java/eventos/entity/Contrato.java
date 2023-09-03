package eventos.entity;

import java.sql.Date;
import java.util.List;

public class Contrato {
    private Long id;
    private Setor setor;
    private Date dataOcorrido;
    private boolean isActive;
    private List<Ato> atos;

    public Contrato() {
    }

    public Contrato(Long id, Setor setor, Date dataOcorrido) {
        this.id = id;
        this.setor = setor;
        this.dataOcorrido = dataOcorrido;
        this.isActive = true;
    }

    public Long getId() {
        return this.id;
    }

    public Setor getSetor() {
        return this.setor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void inactivate() {
        this.isActive = false;
    }

    public void realocate(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Contrato [id=" + id + ", setor=" + setor + ", isActive=" + isActive + "]";
    }

    public Date getDataOcorrido() {
        return dataOcorrido;
    }

    public void setDataOcorrido(Date dataOcorrido) {
        this.dataOcorrido = dataOcorrido;
    }

    public List<Ato> getAtos() {
        return atos;
    }

    public void encerrar() {
        this.inactivate();
    }

    public boolean isActive() {
        return isActive;
    }
}
