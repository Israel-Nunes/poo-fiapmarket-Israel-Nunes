package br.com.fiapmarket.model;

public class Eletronico extends Produto {

    private int garantiaMeses;

    public Eletronico(
            String nome,
            double preco,
            double peso,
            int garantiaMeses
    ) {

        super(nome, preco, peso);

        this.garantiaMeses =
                garantiaMeses;
    }

    public int getGarantiaMeses() {

        return this.garantiaMeses;
    }

    // IMPLEMENTAÇÃO OBRIGATÓRIA

    @Override

    public void exibirCategoria() {

        System.out.println(
                "Categoria: Eletrônico"
        );
    }

    // POLIMORFISMO

    @Override

    public String calcularFrete() {

        double valorFrete =
                this.getPeso() * 12.0;

        return
                "Frete eletrônico: R$ "
                        + valorFrete;
    }
}