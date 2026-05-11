package br.com.fiapmarket.model;

public class Usuario {

    // ATRIBUTOS PRIVADOS (ENCAPSULAMENTO)
    private String nome;
    private int idade;
    private String email;

    // CONSTRUTOR
    public Usuario(String nome, int idade, String email) {

        this.setNome(nome);
        this.setIdade(idade);
        this.setEmail(email);
    }

    // GETTERS (LEITURA)

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getEmail() {
        return this.email;
    }

    // SETTERS (PRIVADOS = regras internas)

    private void setNome(String nome) {

        this.nome = nome;
    }

    private void setIdade(int idade) {

        if (idade <= 0) {
            System.out.println("Erro: idade inválida!");
            return;
        }

        this.idade = idade;
    }

    private void setEmail(String email) {

        if (email == null || !email.contains("@")) {
            System.out.println("Erro: email inválido!");
            return;
        }

        this.email = email;
    }

    // MÉTODO DE EXIBIÇÃO (COMPORTAMENTO)
    public void exibirDados() {

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("----------------------");
    }

    // MÉTODO DE COMPORTAMENTO
    public void atualizarEmail(String novoEmail) {

        if (novoEmail == null || !novoEmail.contains("@")) {
            System.out.println("Erro: email inválido.");
            return;
        }

        this.email = novoEmail;
        System.out.println("Email atualizado com sucesso!");
    }
}