package eventos.entity;

import java.util.List;

/*
 * Ato responsável por registrar o falecimento de um funcionário
 * inativando seu vínculo
 */
public class Falecimento extends Ato {

    private String tipoEvento;
    private Funcionario funcionario;

    public Falecimento() {
        this.tipoEvento = "Falecimento";
    }

    @Override
    public boolean processar(Setor setorIdGestor, Setor setorIdInter) {
        return false;
    }

    public void setFuncionario(Funcionario f) {
        this.funcionario = f;
    }

    @Override
    public String imprimir() {
        return this.tipoEvento;
    }

    // public void registrarFalecimento(List<Contrato> vinculos, Long id) {
    //     Contrato vinculo = vinculos.stream()
    //                 .filter(v -> v.getId() == id)
    //                 .findFirst()
    //                 .orElseThrow();
    //     vinculo.inactivate();
    // }

    
}
