package org.example.modulo05_desafio02;

public class Holerite {

    public Funcionario funcionario;
    public double valorTotalHorasNormais;
    public double valorTotalHorasExtras;
    public double valorAdicionalFilhos;

    public double calcular() {
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalFilhos;
    }

    public void imprimir() {
        System.out.printf("Nome do funcionario: %s%n", funcionario.nome);
        System.out.printf("Valor total horas normais R$ %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor total horas extras R$ %.2f%n", valorTotalHorasExtras);
        System.out.printf("Valor adicional filho R$ %.2f%n", valorAdicionalFilhos);
        System.out.println("-------------------------------------");
        System.out.printf("Total R$ %.2f%n", calcular());
    }
}
