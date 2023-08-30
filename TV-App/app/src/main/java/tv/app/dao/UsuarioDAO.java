package tv.app.dao;

import java.util.List;

import tv.app.entity.Usuario;

public class UsuarioDAO implements IUsuarioDAO {

    @Override
    public boolean registrar(Usuario u) throws Exception {
        List<Usuario> usuarios = Connection.getList();

        boolean existe = usuarios.stream()
                        .anyMatch(usr -> usr.getUsername() == u.getUsername());        
        if (existe) {
            throw new Exception("Usuario com username " + u.getUsername() + " Já existe");
        }

        usuarios.add(u);
        return true;
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = Connection.getList();
        return usuarios;
    }
     
}
