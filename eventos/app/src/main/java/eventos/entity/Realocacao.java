package eventos.entity;

import java.util.List;

/*
 * Ato responsável por realizar mudança de setor para determinado
 * contrato de trabalho
 */
public class Realocacao extends Ato {

    private String tipoEvento;
    private Contrato contrato;

    public Realocacao() {
        this.tipoEvento = "Realocação";
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    /*
     * No realocação deve comparar se o setor do gestor é
     * igual ao setor no id vínculo como parâmetro em realocar
     */
    @Override
    public boolean processar(Setor setorIdGestor, Setor setorIdInter) {
        return setorIdGestor.equals(setorIdInter);
    }

    @Override
    public String imprimir() {
        return this.tipoEvento;
    }

    // public boolean realocar(List<Contrato> vinculos, Long idGestor, Long idInter, Setor setor) {
    //     Contrato vinculo = vinculos.stream()
    //                     .filter(v -> v.getId() == idInter)
    //                     .findFirst()
    //                     .orElseThrow();

    //     Setor s = vinculos.stream()
    //                     .filter(v -> v.getId() == idGestor)
    //                     .map(v -> v.getSetor())
    //                     .findFirst()
    //                     .orElseThrow();
        
    //     if (processar(s, setor)) {
    //         vinculo.realocate(setor);
    //         return true;
    //     }
    //     return false;
    // }
}
