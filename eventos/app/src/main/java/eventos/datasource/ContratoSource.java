package eventos.datasource;

import java.util.ArrayList;
import java.util.List;

import eventos.entity.Contrato;

public class ContratoSource {
    
    private static List<Contrato> contratos;

    public static List<Contrato> getList() {
        if (contratos == null) {
            contratos = new ArrayList<>();
        }
        return contratos;
    }
}
