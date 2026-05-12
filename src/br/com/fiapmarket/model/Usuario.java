package br.com.fiapmarket.model;

public class Usuario {

    private String nome;
    private double saldo;

    // CONSTRUTOR PADRÃO
    public Usuario() {

        this("Usuário sem nome", 0.0);

        System.out.println("👤 Usuário padrão criado.");
    }

    // CONSTRUTOR CUSTOMIZADO
    public Usuario(String nome, double saldo) {

        this.setNome(nome);
        this.setSaldo(saldo);

        System.out.println(
                "✅ Usuário criado: "
                        + this.nome
        );
    }

    // GETTERS

    public String getNome() {
        return this.nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // COMPORTAMENTO

    public void adicionarSaldo(double valor) {

        if (valor > 0) {

            this.saldo += valor;

            System.out.println(
                    "💰 Saldo adicionado com sucesso!"
            );

        } else {

            System.out.println(
                    "❌ Valor inválido!"
            );
        }
    }

    // SETTERS PRIVADOS

    private void setNome(String nome) {

        if (nome != null && !nome.trim().isEmpty()) {

            this.nome = nome;

        } else {

            System.out.println(
                    "❌ Nome inválido!"
            );
        }
    }

    private void setSaldo(double saldo) {

        if (saldo >= 0) {

            this.saldo = saldo;

        } else {

            System.out.println(
                    "❌ Saldo inválido!"
            );
        }
    }
}