package br.com.fiapmarket.main;

import br.com.fiapmarket.model.Usuario;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Sistema FiapMarket ---\n");

        // INSTANCIAÇÃO COM CONSTRUTOR
        Usuario usuario1 = new Usuario(
                "Ana Silva",
                25,
                "ana@email.com"
        );

        Usuario usuario2 = new Usuario(
                "Carlos Souza",
                16,
                "carlos@email.com"
        );

        // EXIBIÇÃO INICIAL
        usuario1.exibirDados();
        usuario2.exibirDados();

        // ACESSO VIA GETTERS
        System.out.println("Nome usuario1: " + usuario1.getNome());
        System.out.println("Idade usuario2: " + usuario2.getIdade());

        // USO DE MÉTODO DE COMPORTAMENTO
        usuario1.atualizarEmail("novoemail@fiap.com");
        usuario2.atualizarEmail("emailinvalido");

        // EXIBIÇÃO FINAL
        System.out.println("\n--- Atualizado ---\n");

        usuario1.exibirDados();
        usuario2.exibirDados();

        // TESTE DE SEGURANÇA
        // usuario1.email = "hack@hack.com"; // bloqueado pelo private
    }
}