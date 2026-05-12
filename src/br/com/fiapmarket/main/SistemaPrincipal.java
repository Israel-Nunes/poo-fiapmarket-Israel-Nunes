package br.com.fiapmarket.main;

import br.com.fiapmarket.model.Usuario;
import br.com.fiapmarket.model.Produto;
import br.com.fiapmarket.model.Pedido;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println(
                "--- FIAPMARKET: Inicializando Sistema ---"
        );

        // 1. CRIANDO OS OBJETOS INDEPENDENTES

        Usuario cliente1 = new Usuario(
                "Ana Silva",
                100.0
        );

        Produto produto1 = new Produto(
                "Notebook Gamer",
                4500.0
        );

        // 2. CRIANDO O PEDIDO (ASSOCIAÇÃO)

        Pedido pedido1 = new Pedido(
                "Avenida Paulista, 1000",
                cliente1,
                produto1
        );

        // 3. TESTANDO A ASSOCIAÇÃO

        pedido1.exibirResumo();

        // 4. PROVA DA PASSAGEM POR REFERÊNCIA

        cliente1.adicionarSaldo(500.0);

        System.out.println(
                "Saldo consultado ATRAVÉS do pedido: R$ "
                        + pedido1.getCliente().getSaldo()
        );
    }
}