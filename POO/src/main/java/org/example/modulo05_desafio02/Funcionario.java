package org.example.modulo05_desafio02;

public class Funcionario {
    public String nome;
    public int qtdeFilhos;
    public int qtdeHorasNormaisTrabalhadas;
    public int qtdeHorasExtrasTrabalhadas;

    public boolean possuiFilho() {
        return qtdeFilhos > 0;
    }
}
