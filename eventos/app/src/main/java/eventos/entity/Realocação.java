package eventos.entity;

import java.util.List;

public class Realocação extends Evento {

    public Realocação() {}

    /*
     * No realocação deve comparar se o setor do gestor é
     * igual ao setor no id vínculo como parâmetro em realocar
     */
    @Override
    boolean processar(Setor setorIdGestor, Setor setorIdInter) {
        return setorIdGestor.equals(setorIdInter);
    }

    public boolean realocar(List<Vinculo> vinculos, Long idGestor, Long idInter, Setor setor) {
        Vinculo vinculo = vinculos.stream()
                        .filter(v -> v.getId() == idInter)
                        .findFirst()
                        .orElseThrow();

        Setor s = vinculos.stream()
                        .filter(v -> v.getId() == idGestor)
                        .map(v -> v.getSetor())
                        .findFirst()
                        .orElseThrow();
        
        if (processar(s, setor)) {
            vinculo.realocate(setor);
            return true;
        }
        return false;
        
    }
}
