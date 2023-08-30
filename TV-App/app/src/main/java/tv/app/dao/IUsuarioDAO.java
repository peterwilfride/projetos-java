package tv.app.dao;

import java.util.List;

import tv.app.entity.Usuario;

public interface IUsuarioDAO {
    
    public boolean registrar(Usuario u) throws Exception;

    public List<Usuario> listar();
}
