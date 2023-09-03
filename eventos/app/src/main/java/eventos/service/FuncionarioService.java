package eventos.service;

import eventos.entity.Contrato;
import eventos.entity.Funcionario;

public class FuncionarioService {

    public void admitir(Funcionario funcionario, Contrato contrato) {
        funcionario.getContratosTrabalho().add(contrato);
    }

    public void registrarFalecimento(Funcionario funcionario) {
        funcionario.falecer();
        funcionario.getContratosTrabalho().forEach(x -> x.inactivate());
    }
}
