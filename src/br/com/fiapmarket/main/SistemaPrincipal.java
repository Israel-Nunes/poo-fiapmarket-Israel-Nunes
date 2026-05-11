package br.com.fiapmarket.main;

import br.com.fiapmarket.model.Usuario;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // OBJETO 1
        Usuario usuario1 = new Usuario();
        usuario1.nome = "Ana Silva";
        usuario1.idade = 25;
        usuario1.email = "ana@email.com";

        // OBJETO 2
        Usuario usuario2 = new Usuario();
        usuario2.nome = "Carlos Souza";
        usuario2.idade = 16;
        usuario2.email = "carlos@email.com";

        System.out.println("--- Sistema FiapMarket ---");

        // EXIBIÇÃO
        usuario1.exibirDados();
        usuario2.exibirDados();

        // TESTE DE MÉTODOS COM VALIDAÇÃO
        usuario1.atualizarEmail("novoemail@fiap.com");
        usuario2.atualizarEmail("emailinvalido"); // erro

        usuario1.atualizarIdade(30);
        usuario2.atualizarIdade(-5); // erro

        // EXIBIR NOVAMENTE
        System.out.println("\n--- Atualizado ---");

        usuario1.exibirDados();
        usuario2.exibirDados();
    }
}