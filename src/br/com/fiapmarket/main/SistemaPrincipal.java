package br.com.fiapmarket.main;

import br.com.fiapmarket.model.*;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println(
                "=== FIAPMARKET: TESTE DE INTERFACES ==="
        );

        System.out.println();

        // OBJETOS DIFERENTES

        Eletronico notebook =
                new Eletronico(
                        "Notebook Gamer",
                        4500.0,
                        2.5,
                        24
                );

        Alimento arroz =
                new Alimento(
                        "Arroz 5kg",
                        29.90,
                        5.0,
                        true
                );

        // POLIMORFISMO DE INTERFACE

        Promocional[] promocionais =
                new Promocional[] {

                        notebook,
                        arroz
                };

        System.out.println(
                "=== APLICANDO PROMOÇÕES ==="
        );

        for (Promocional p
                : promocionais) {

            p.aplicarDesconto(0.10);

            System.out.println(
                    "---"
            );
        }

        System.out.println();

        System.out.println(
                "=== MÚLTIPLOS TIPOS ==="
        );

        System.out.println(
                "Notebook é Produto? "
                        +
                        (notebook instanceof Produto)
        );

        System.out.println(
                "Notebook é Promocional? "
                        +
                        (notebook instanceof Promocional)
        );

        System.out.println(
                "Arroz é Produto? "
                        +
                        (arroz instanceof Produto)
        );

        System.out.println(
                "Arroz é Promocional? "
                        +
                        (arroz instanceof Promocional)
        );
    }
}