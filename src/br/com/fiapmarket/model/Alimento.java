package br.com.fiapmarket.model;

public class Alimento
        extends Produto
        implements Promocional {

    private boolean perecivel;

    public Alimento(
            String nome,
            double preco,
            double peso,
            boolean perecivel
    ) {

        super(nome, preco, peso);

        this.perecivel =
                perecivel;
    }

    public boolean isPerecivel() {

        return this.perecivel;
    }

    @Override
    public void exibirCategoria() {

        System.out.println(
                "Categoria: Alimento"
        );
    }

    @Override
    public String calcularFrete() {

        double valorFrete =
                this.getPeso() * 5.0;

        return String.format(
                "Frete alimento: R$ %.2f",
                valorFrete
        );
    }

    // IMPLEMENTAÇÃO DA INTERFACE

    @Override
    public void aplicarDesconto(
            double percentual
    ) {

        if (percentual <
                Promocional.DESCONTO_MINIMO
                ||
                percentual >
                        Promocional.DESCONTO_MAXIMO) {

            System.out.println(
                    " Desconto inválido!"
            );

            return;
        }

        double desconto =
                this.getPreco()
                        * percentual;

        double novoPreco =
                this.getPreco()
                        - desconto;

        System.out.println(
                " Desconto aplicado no alimento!"
        );

        System.out.println(
        String.format(
                "Novo preço: R$ %.2f",
                novoPreco
        )
);
    }
}