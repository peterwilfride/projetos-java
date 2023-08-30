package tv.app.service;

import java.util.List;

import tv.app.dao.IUsuarioDAO;
import tv.app.entity.Usuario;

public class UsuarioService {

    private final IUsuarioDAO iUsuarioDAO;

    public UsuarioService(IUsuarioDAO iUsuarioDAO) {
        this.iUsuarioDAO = iUsuarioDAO;
    }

    public boolean registrar(Usuario u) throws Exception {
        return iUsuarioDAO.registrar(u);
    }

    public List<Usuario> listar() {
        return iUsuarioDAO.listar();
    }
    
}
