package eventos.entity;

import java.util.List;

public class Falecimento extends Evento {

    public Falecimento() {}

    @Override
    boolean processar(Setor setorIdGestor, Setor setorIdInter) {
        // TODO Auto-generated method stub
        return false;
    }

    public void registrarFalecimento(List<Vinculo> vinculos, Long id) {
        Vinculo vinculo = vinculos.stream()
                    .filter(v -> v.getId() == id)
                    .findFirst()
                    .orElseThrow();
        vinculo.inactivate();
    }
    
}
