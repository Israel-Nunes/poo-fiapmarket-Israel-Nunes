package br.com.fiapmarket.main;

import br.com.fiapmarket.model.*;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println(
                "=== FIAPMARKET: Teste de Classes Abstratas ==="
        );

        System.out.println();

        // TESTE 1
        // NÃO PODE INSTANCIAR ABSTRACT

        // Produto produto =
        //     new Produto(
        //         "Genérico",
        //         10.0,
        //         1.0
        // );

        // ❌ ERRO:
        // Produto is abstract;
        // cannot be instantiated

        // TESTE 2
        // OBJETOS CONCRETOS

        Produto notebook =
                new Eletronico(
                        "Notebook Gamer",
                        4500.0,
                        2.5,
                        24
                );

        Produto arroz =
                new Alimento(
                        "Arroz 5kg",
                        29.90,
                        5.0,
                        false
                );

        // TESTE 3
        // MÉTODO ABSTRATO IMPLEMENTADO

        System.out.println(
                "Categorias:"
        );

        notebook.exibirCategoria();

        arroz.exibirCategoria();

        System.out.println();

        System.out.println(
                "=== POLIMORFISMO COM ABSTRACT ==="
        );

        Produto[] produtos =
                new Produto[] {

                        new Eletronico(
                                "Smartphone",
                                2500.0,
                                0.8,
                                12
                        ),

                        new Alimento(
                                "Feijão 1kg",
                                8.50,
                                1.0,
                                true
                        ),

                        new Eletronico(
                                "Monitor Gamer",
                                1800.0,
                                4.5,
                                24
                        )
                };

        for (Produto produto : produtos) {

            produto.exibirCategoria();

            System.out.println(
                    produto.calcularFrete()
            );

            System.out.println(
                    "---"
            );
        }
    }
}