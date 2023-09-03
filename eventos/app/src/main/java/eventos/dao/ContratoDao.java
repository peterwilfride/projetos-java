package eventos.dao;

import eventos.datasource.ContratoSource;
import eventos.entity.Contrato;

public class ContratoDao {

    public void create(Contrato contrato) {
        ContratoSource.getList().add(contrato);
    }
    
}
