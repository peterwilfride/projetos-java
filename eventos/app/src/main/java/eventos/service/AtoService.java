package eventos.service;

import java.util.List;

import eventos.dao.AtoDao;
import eventos.entity.Ato;

public class AtoService {

    private final AtoDao atoDao;

    public AtoService(AtoDao atoDao) {
        this.atoDao = atoDao;
    }

    public void add(Ato ato) {
        atoDao.create(ato);
    }

    public List<Ato> list() {
        return atoDao.getAll();
    }

}
