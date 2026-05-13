package br.com.fiapmarket.model;

// INTERFACE
// Define um contrato de promoção
public interface Promocional {

    // Constantes
    double DESCONTO_MAXIMO = 0.50;
    double DESCONTO_MINIMO = 0.05;

    // Método abstrato
    // Toda classe que implementar
    // DEVE criar este método
    void aplicarDesconto(double percentual);
}