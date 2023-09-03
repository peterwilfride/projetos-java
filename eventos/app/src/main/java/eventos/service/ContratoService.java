package eventos.service;

import eventos.entity.Contrato;
import eventos.entity.Setor;

public class ContratoService {
    
    public void realocar(Contrato contrato, Setor setor) {
        contrato.realocate(setor);
    }

    public void encerrar(Contrato contrato) {
        contrato.encerrar();
    }
}
