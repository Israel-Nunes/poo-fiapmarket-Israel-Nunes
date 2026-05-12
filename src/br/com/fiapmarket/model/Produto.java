package br.com.fiapmarket.model;

public class Produto {

    private String nome;
    private double preco;

    // CONSTRUTOR PADRÃO
    public Produto() {

        this("Produto sem nome", 1.0);

        System.out.println("🛒 Produto padrão criado.");
    }

    // CONSTRUTOR CUSTOMIZADO
    public Produto(String nome, double preco) {

        this.setNome(nome);
        this.setPreco(preco);

        System.out.println(
                "✅ Produto cadastrado: "
                        + this.nome
        );
    }

    // GETTERS

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    // COMPORTAMENTO

    public void atualizarPreco(double novoPreco) {

        System.out.println(
                "🔄 Atualizando preço do produto..."
        );

        this.setPreco(novoPreco);
    }

    // SETTERS PRIVADOS

    private void setNome(String nome) {

        if (nome != null && !nome.trim().isEmpty()) {

            this.nome = nome;

        } else {

            System.out.println(
                    "❌ Nome do produto inválido!"
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
}