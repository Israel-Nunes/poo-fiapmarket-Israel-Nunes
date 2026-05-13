package br.com.fiapmarket.model;

// CLASSE ABSTRATA
public abstract class Produto {

    private String nome;
    private double preco;
    private double peso;

    // CONSTRUTOR

    public Produto(
            String nome,
            double preco,
            double peso
    ) {

        this.setNome(nome);
        this.setPreco(preco);
        this.setPeso(peso);
    }

    // GETTERS

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public double getPeso() {
        return this.peso;
    }

    // MÉTODO CONCRETO

    public void exibirInformacoes() {

        System.out.println(
                "Produto: " + this.nome
        );

        System.out.println(
                "Preço: R$ " + this.preco
        );
    }

    // MÉTODO ABSTRATO
    // OBRIGA AS FILHAS A IMPLEMENTAREM

    public abstract void exibirCategoria();

    // MÉTODO POLIMÓRFICO

    public abstract String calcularFrete();

    // SETTERS PRIVADOS

    private void setNome(String nome) {

        if (nome != null
                && !nome.trim().isEmpty()) {

            this.nome = nome;

        } else {

            System.out.println(
                    "❌ Nome inválido!"
            );
        }
    }

    private void setPreco(double preco) {

        if (preco > 0) {

            this.preco = preco;

        } else {

            System.out.println(
                    "❌ Preço inválido!"
            );
        }
    }

    private void setPeso(double peso) {

        if (peso > 0) {

            this.peso = peso;

        } else {

            System.out.println(
                    "❌ Peso inválido!"
            );
        }
    }
}