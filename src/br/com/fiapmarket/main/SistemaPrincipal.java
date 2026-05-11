package br.com.fiapmarket.main;

import br.com.fiapmarket.model.Produto;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Sistema FIAPMarket ---\n");

        // TESTE 1: CADASTRO CORRETO
        Produto produto1 = new Produto(
                "Notebook Gamer",
                4500.00
        );

        System.out.println();

        Produto produto2 = new Produto(
                "Mouse Gamer",
                250.00
        );

        System.out.println();

        // EXIBIÇÃO VIA GETTERS
        System.out.println(
                "Produto: " + produto1.getNome()
        );

        System.out.println(
                "Preço: R$ " + produto1.getPreco()
        );

        System.out.println();

        // TESTE 2: ALTERAÇÃO DE PREÇO
        produto1.atualizarPreco(3999.99);

        System.out.println();

        // TESTE 3: VALIDAÇÃO
        produto2.atualizarPreco(-50);

        System.out.println();

        // TESTE 4: TENTATIVA DE BURLAR O SISTEMA
        // Produto produtoFantasma = new Produto();
        // ❌ ERRO DE COMPILAÇÃO
        // O construtor vazio não existe mais.

        // produto1.preco = 1;
        // ❌ bloqueado pelo private
    }
}