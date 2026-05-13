package br.com.fiapmarket.model;

public class Alimento extends Produto {

    private boolean perecivel;

    public Alimento(
            String nome,
            double preco,
            double peso,
            boolean perecivel
    ) {

        super(nome, preco, peso);

        this.perecivel = perecivel;
    }

    public boolean isPerecivel() {
        return this.perecivel;
    }

    // POLIMORFISMO

    @Override

    public String calcularFrete() {

        double valorFrete =
                this.getPeso() * 5.0;

        return
                "Frete alimento: R$ "
                        + valorFrete;
    }
}