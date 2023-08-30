package org.example.modulo05_desafio02;

public class FolhaDePagamento {

    static final int ADICIONAL_FILHO_PERCENTUAL = 5;

    public Holerite calcularSalario(final ContrataDeTrabalho contrataDeTrabalho) {
        Funcionario funcionario = contrataDeTrabalho.funcionario;

        double valorTotalHorasNormais = funcionario.qtdeHorasNormaisTrabalhadas * contrataDeTrabalho.valorHoraNormal;
        double valorTotalHorasExtras = funcionario.qtdeHorasExtrasTrabalhadas * contrataDeTrabalho.valorHoraExtra;

        double salario = valorTotalHorasNormais + valorTotalHorasExtras;

        Holerite holerite = new Holerite();
        holerite.funcionario = funcionario;
        holerite.valorTotalHorasNormais = valorTotalHorasNormais;
        holerite.valorTotalHorasExtras = valorTotalHorasExtras;
        holerite.valorAdicionalFilhos = funcionario.possuiFilho() ? salario * ADICIONAL_FILHO_PERCENTUAL/100.0 : 0;

        return holerite;
    }
}
