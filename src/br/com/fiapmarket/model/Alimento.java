package br.com.fiapmarket.model;

public class Alimento extends Produto {

    // ATRIBUTO EXCLUSIVO
    private boolean perecivel;

    // CONSTRUTOR
    public Alimento(
            String nome,
            double preco,
            boolean perecivel
    ) {

        // CHAMA A MÃE
        super(nome, preco);

        this.perecivel = perecivel;
    }

    // GETTER

    public boolean isPerecivel() {
        return this.perecivel;
    }
}