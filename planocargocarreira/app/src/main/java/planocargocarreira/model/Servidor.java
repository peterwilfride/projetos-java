package planocargocarreira.model;

public class Servidor {
    
    private String matricula;
    private IPlanoCarreira planoCarreira;
    private int nivelPromossao;
    private int nivelProgressao;

    public Servidor() {
        this.nivelPromossao = 0;
        this.nivelProgressao = 0;
    }

    public Servidor(String matricula, IPlanoCarreira planoCarreira) {
        this.matricula = matricula;
        this.planoCarreira = planoCarreira;
        this.nivelPromossao = 0;
        this.nivelProgressao = 0;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPlanoCarreira(IPlanoCarreira planoCarreira) {
        this.planoCarreira = planoCarreira;
    }

    public void promossao() {
        int[] novosNiveis = this.planoCarreira.promossao(this.nivelPromossao, this.nivelProgressao);
        this.nivelPromossao = novosNiveis[0];
        this.nivelProgressao = novosNiveis[1];
    }

    public void progressao() {
        int[] novosNiveis = this.planoCarreira.progressao(this.nivelPromossao, this.nivelProgressao);
        this.nivelPromossao = novosNiveis[0];
        this.nivelProgressao = novosNiveis[1];
    }

    public Cargo getCargo() {
        return this.planoCarreira.getPlano()
                        .get(this.nivelProgressao)
                        .get(this.nivelPromossao);
    }
}
