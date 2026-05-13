package br.com.fiapmarket.model;

public class Eletronico
        extends Produto
        implements Promocional {

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

    @Override
    public void exibirCategoria() {

        System.out.println(
                "Categoria: Eletrônico"
        );
    }

    @Override
    public String calcularFrete() {

        double valorFrete =
                this.getPeso() * 12.0;

        return String.format(
                "Frete eletrônico: R$ %.2f",
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
                " Desconto aplicado no eletrônico!"
        );

        System.out.println(
        String.format(
                "Novo preço: R$ %.2f",
                novoPreco
        )
);
    }
}