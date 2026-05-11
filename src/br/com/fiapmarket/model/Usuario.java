package br.com.fiapmarket.model;

public class Usuario {

    public String nome;
    public int idade;
    public String email;

    // MÉTODO: atualizar email com validação
    public void atualizarEmail(String novoEmail) {

        if (novoEmail == null || !novoEmail.contains("@")) {
            System.out.println("Erro: email inválido.");
            return;
        }

        email = novoEmail;
        System.out.println("Email atualizado com sucesso!");
    }

    // MÉTODO: atualizar idade com validação
    public void atualizarIdade(int novaIdade) {

        if (novaIdade <= 0) {
            System.out.println("Erro: idade inválida.");
            return;
        }

        idade = novaIdade;
        System.out.println("Idade atualizada com sucesso!");
    }

    // MÉTODO: exibir dados
    public void exibirDados() {

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("----------------------");
    }
}