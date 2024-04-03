package eventos.entity.ato;

import eventos.entity.Contrato;
import eventos.entity.Setor;

/*
 * Ato responsável por criar um novo contrato de trabalho 
 * para um funcionário
 */
public class Admissao extends Ato {

    private String tipoEvento;
    private Contrato contrato;

    public Admissao() {
        this.tipoEvento = "Provimento de cargo";
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    /*
     * No provimento de cargo deve comparar se o setor do gestor é
     * igual ao setor que vem no vínculo como parâmetro em proverCargo
     */
    @Override
    public boolean processar(Setor setorIdGestor, Setor setorIdInter) {
        return setorIdGestor.equals(setorIdInter);
    }

    @Override
    public String imprimir() {
        return this.tipoEvento;
    }

    // public boolean proverCargo(List<Contrato> vinculos, Long idGestor, Contrato v) {
    //     Setor s = vinculos.stream()
    //             .filter(vinculo -> vinculo.getId() == idGestor)
    //             .map(vinculo -> vinculo.getSetor())
    //             .findFirst()
    //             .orElseThrow();

    //     if (processar(s, v.getSetor())) {
    //         vinculos.add(v);
    //         return true;
    //     }
    //     return false;
    // }    
}
