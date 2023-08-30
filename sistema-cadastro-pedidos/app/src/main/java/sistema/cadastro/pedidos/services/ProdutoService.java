package sistema.cadastro.pedidos.services;

import sistema.cadastro.pedidos.entities.Produto;
import sistema.cadastro.pedidos.repositories.ProdutoRepository;

public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    
    public void criarProduto(Produto produto) {
        produtoRepository.adicionarProduto(produto);
    }
}
