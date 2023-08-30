/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sistema.cadastro.pedidos;

import sistema.cadastro.pedidos.entities.Cliente;
import sistema.cadastro.pedidos.entities.ItemPedido;
import sistema.cadastro.pedidos.entities.Pedido;
import sistema.cadastro.pedidos.entities.Produto;
import sistema.cadastro.pedidos.entities.Status;

public class App {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente(1, "Pedro henrique", "pedro@email");
        
        Pedido pedido = new Pedido(1, cliente, Status.EM_PROCESSAMENTO);
        
        Produto produto1 = new Produto(1, "Xtudo", "hamburger", 20.0);
        Produto produto2 = new Produto(2, "Refri", "bebida", 5.0);
        Produto produto3 = new Produto(3, "Salada", "salada", 15.0);

        ItemPedido itemPedido1 = new ItemPedido(produto1, 2);
        ItemPedido itemPedido2 = new ItemPedido(produto2, 1);

        pedido.adicionarProduto(itemPedido1);
        pedido.adicionarProduto(itemPedido2);

        double total = pedido.calcularTotal();

        System.out.println(total);
    }
}
