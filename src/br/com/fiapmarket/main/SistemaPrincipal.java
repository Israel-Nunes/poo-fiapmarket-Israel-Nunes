package br.com.fiapmarket.main;

import br.com.fiapmarket.model.Eletronico;
import br.com.fiapmarket.model.Alimento;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println(
                "--- FIAPMARKET: Teste de Produtos ---"
        );

        // 1. INSTANCIANDO OBJETOS ESPECÍFICOS

        Eletronico notebook = new Eletronico(
                "Notebook Gamer",
                4500.0,
                24
        );

        Alimento arroz = new Alimento(
                "Arroz 5kg",
                29.90,
                false
        );

        // 2. TESTE DA HERANÇA

        System.out.println(
                "\nEletrônico: "
                        + notebook.getNome()
                        + " | Preço: R$ "
                        + notebook.getPreco()
        );

        System.out.println(
                "Garantia: "
                        + notebook.getGarantiaMeses()
                        + " meses"
        );

        System.out.println(
                "\nAlimento: "
                        + arroz.getNome()
                        + " | Preço: R$ "
                        + arroz.getPreco()
        );

        // TESTE EXCLUSIVO DA FILHA

        if (arroz.isPerecivel()) {

            System.out.println(
                    "⚠ Produto perecível!"
            );

        } else {

            System.out.println(
                    "✅ Produto não perecível."
            );
        }
    }
}