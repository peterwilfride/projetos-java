package tv.app.dao;

import java.util.ArrayList;
import java.util.List;

import tv.app.entity.Usuario;

public class Connection {
    
    private static List<Usuario> usuarios;

    private Connection() {}

    public static List<Usuario> getList() {
        if (usuarios == null) {
            usuarios = new ArrayList<>();
        }
        return usuarios;
    }
}
