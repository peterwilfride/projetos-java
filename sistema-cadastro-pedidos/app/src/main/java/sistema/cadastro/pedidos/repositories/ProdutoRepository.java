package sistema.cadastro.pedidos.repositories;

import java.util.ArrayList;
import java.util.List;

import sistema.cadastro.pedidos.entities.Produto;

public class ProdutoRepository {
    
    List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }
}
