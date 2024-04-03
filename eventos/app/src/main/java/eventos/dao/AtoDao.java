package eventos.dao;

import java.util.List;

import eventos.datasource.AtoSource;
import eventos.entity.ato.Ato;

public class AtoDao {
    
    public void create(Ato ato) {
        AtoSource.getList().add(ato);
    }

    public List<Ato> getAll() {
        return AtoSource.getList();
    }
}
