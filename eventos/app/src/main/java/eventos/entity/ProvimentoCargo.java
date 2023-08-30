package eventos.entity;

import java.util.List;

public class ProvimentoCargo extends Evento {

    private String tipoEvento;

    public ProvimentoCargo() {
        this.tipoEvento = "Provimento de cargo";
    }

    /*
     * No provimento de cargo deve comparar se o setor do gestor é
     * igual ao setor que vem no vínculo como parâmetro em proverCargo
     */
    @Override
    protected boolean processar(Setor setorIdGestor, Setor setorIdInter) {
        return setorIdGestor.equals(setorIdInter);
    }

    public boolean proverCargo(List<Vinculo> vinculos, Long idGestor, Vinculo v) {
        Setor s = vinculos.stream()
                .filter(vinculo -> vinculo.getId() == idGestor)
                .map(vinculo -> vinculo.getSetor())
                .findFirst()
                .orElseThrow();

        if (processar(s, v.getSetor())) {
            vinculos.add(v);
            return true;
        }
        return false;
    }    
}
