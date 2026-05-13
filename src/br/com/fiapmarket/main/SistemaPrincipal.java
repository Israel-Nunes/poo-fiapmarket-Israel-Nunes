package br.com.fiapmarket.main;

import br.com.fiapmarket.model.*;

import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // LISTA DA SUPERCLASSE
        List<Produto> produtos =
                new ArrayList<>();

        // OBJETOS DIFERENTES

        produtos.add(
                new Eletronico(
                        "Notebook Gamer",
                        4500.0,
                        2.5,
                        24
                )
        );

        produtos.add(
                new Alimento(
                        "Arroz 5kg",
                        29.90,
                        5.0,
                        false
                )
        );

        System.out.println(
                "--- 🚚 RELATÓRIO DE FRETE ---"
        );

        // POLIMORFISMO

        for (Produto produto : produtos) {

            System.out.println(
                    "\nProduto: "
                            + produto.getNome()
            );

            // O JAVA DECIDE QUAL MÉTODO USAR

            System.out.println(
                    produto.calcularFrete()
            );

            System.out.println(
                    "-------------------------"
            );
        }
    }
}