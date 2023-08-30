package sistema.cadastro.pedidos.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private List<ItemPedido> produtos;
    private Status status;
    private Instant dataHora;
    private Double total;

    public Pedido(int id, Cliente c, Status status) {
        this.id = id;
        this.cliente = c;
        this.produtos = new ArrayList<>();
        this.status = status;
    }

    // Os produtos só podem ser adicionados ao pedido 
    // se estiverem disponíveis para compra.
    public boolean adicionarProduto(ItemPedido ItemPedido) {
        Produto produto = ItemPedido.getProduto();
        if (!produto.estaDisponivel()) {
            return false;
        }

        this.produtos.add(ItemPedido);

        return true;
    }

    // O valor total do pedido deve ser calculado
    // corretamente a partir dos itens adicionados.
    public Double calcularTotal() {
        double total = 0.0; 
        for(ItemPedido item : this.produtos) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return total;
    }

}   
