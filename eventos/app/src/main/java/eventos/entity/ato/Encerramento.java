package eventos.entity.ato;

import eventos.entity.Contrato;
import eventos.entity.Setor;

public class Encerramento extends Ato {

    private String tipoEvento;
    private Contrato contrato;

    public Encerramento() {
        this.tipoEvento = "Encerramento";
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public boolean processar(Setor setorIdGestor, Setor setorIdInter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processar'");
    }

    @Override
    public String imprimir() {
        return this.tipoEvento;
    }
    
}
