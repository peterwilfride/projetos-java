package org.example;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    double calcularValorRevenda() {
        int tempoUsoEmAnos = 2023 - anoFabricacao;
        int vidaUtilAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilAnos) * (vidaUtilAnos - tempoUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }
        return valorRevenda;
    }
}
