package br.com.fiapmarket.model;

// HERANÇA
public class Eletronico extends Produto {

    // ATRIBUTO EXCLUSIVO
    private int garantiaMeses;

    // CONSTRUTOR
    public Eletronico(
            String nome,
            double preco,
            int garantiaMeses
    ) {

        // CHAMA O CONSTRUTOR DA MÃE
        super(nome, preco);

        // RESOLVE O QUE É DA FILHA
        this.setGarantiaMeses(garantiaMeses);
    }

    // GETTER

    public int getGarantiaMeses() {
        return this.garantiaMeses;
    }

    // SETTER PRIVADO

    private void setGarantiaMeses(int garantiaMeses) {

        if (garantiaMeses >= 0) {

            this.garantiaMeses = garantiaMeses;

        } else {

            System.out.println(
                    "❌ Garantia inválida!"
            );
        }
    }
}