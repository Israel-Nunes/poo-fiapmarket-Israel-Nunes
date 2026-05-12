package br.com.fiapmarket.model;

public class Pedido {

    // ATRIBUTOS SIMPLES
    private String enderecoEntrega;
    private double valorTotal;

    // ASSOCIAÇÃO (TEM-UM)
    private Usuario cliente;
    private Produto produtoComprado;

    // CONSTRUTOR
    public Pedido(
            String enderecoEntrega,
            Usuario cliente,
            Produto produtoComprado
    ) {

        this.enderecoEntrega = enderecoEntrega;
        this.cliente = cliente;
        this.produtoComprado = produtoComprado;

        // valor inicial baseado no produto
        this.valorTotal = produtoComprado.getPreco();

        System.out.println(
                "✅ Novo pedido criado para: "
                        + this.enderecoEntrega
        );
    }

    // COMPORTAMENTO

    public void exibirResumo() {

        System.out.println("\n--- RESUMO DO PEDIDO ---");

        System.out.println(
                "Endereço: "
                        + this.enderecoEntrega
        );

        // NAVEGANDO ENTRE OBJETOS

        System.out.println(
                "Cliente: "
                        + this.cliente.getNome()
        );

        System.out.println(
                "Produto: "
                        + this.produtoComprado.getNome()
        );

        System.out.println(
                "Preço: R$ "
                        + this.produtoComprado.getPreco()
        );

        System.out.println(
                "Saldo Cliente: R$ "
                        + this.cliente.getSaldo()
        );

        System.out.println("----------------------------\n");
    }

    // GETTERS

    public String getEnderecoEntrega() {
        return this.enderecoEntrega;
    }

    public Usuario getCliente() {
        return this.cliente;
    }

    public Produto getProdutoComprado() {
        return this.produtoComprado;
    }
}