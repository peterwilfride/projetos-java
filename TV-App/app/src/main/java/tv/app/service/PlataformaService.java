package tv.app.service;

import java.util.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import tv.app.dao.IUsuarioDAO;
import tv.app.entity.Usuario;

public class PlataformaService {

    private final IUsuarioDAO iUsuarioDAO;
    private static final int TEMPO_EXPIRACAO = 10;

    public PlataformaService(IUsuarioDAO iUsuarioDAO) {
        this.iUsuarioDAO = iUsuarioDAO;
    }

    public void realizarPagamento(Usuario usuario) {
        Calendar cal = Calendar.getInstance();

        Date y;
        if (usuario.getExpiration() == null) {
            y = new Date(System.currentTimeMillis());
        } else {
            y = usuario.getExpiration();
        }
        cal.setTime(y);
        cal.add(Calendar.SECOND, TEMPO_EXPIRACAO);
        usuario.setExpiration(cal.getTime());

        System.out.println("Pagamento confirmado");
        System.out.println("Seu período de uso do serviço é " + TEMPO_EXPIRACAO +" segundos");
        System.out.println("expira em: " + usuario.getDataExpiracao());
    }

    public boolean login(String username, String password) {
        List<Usuario> usuarios = iUsuarioDAO.listar();

        Optional<Usuario> usuarioOp = usuarios.stream()
        .filter(u -> ( u.getUsername() == username && u.getPassword() == password))
        .findFirst();

        if (usuarioOp.isEmpty()) {
            System.out.println("Falha na autenticação. Usuário ou senha incorretos ou o usuário não realizou o pagamento da mensalidade.");
            return false;
        }

        Usuario usuario = usuarioOp.get();

        if (usuario.estaExpirado()) {
            System.out.println("Falha na autenticação. Usuário ou senha incorretos ou o usuário não realizou o pagamento da mensalidade.");
            return false;
        }

        System.out.println("Autenticação feita com sucesso");
        return true;
    }
}
