package eventos.datasource;

import java.util.ArrayList;
import java.util.List;

import eventos.entity.Ato;

public class AtoSource {
        
    private static List<Ato> atos;

    public static List<Ato> getList() {
        if (atos == null) {
            atos = new ArrayList<>();
        }
        return atos;
    }
}
