package org.example;

import org.example.modulo05_desafio01.Cachorro;
import org.example.modulo05_desafio02.ContrataDeTrabalho;
import org.example.modulo05_desafio02.FolhaDePagamento;
import org.example.modulo05_desafio02.Funcionario;
import org.example.modulo05_desafio02.Holerite;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();

        cachorro1.nome = "caramelo";
        cachorro1.raça = "Vira-lata";
        cachorro1.sexo = true;
        cachorro1.idade = 5;

        Funcionario pedro = new Funcionario();
        pedro.nome = "Pedro";
        pedro.qtdeFilhos = 1;
        pedro.qtdeHorasNormaisTrabalhadas = 150;
        pedro.qtdeHorasExtrasTrabalhadas = 20;

        ContrataDeTrabalho c = new ContrataDeTrabalho();
        c.funcionario = pedro;
        c.valorHoraNormal = 50.0;
        c.valorHoraExtra = 10.0;

        FolhaDePagamento fp = new FolhaDePagamento();
        Holerite holeritePedro = fp.calcularSalario(c);
        holeritePedro.imprimir();
    }
}