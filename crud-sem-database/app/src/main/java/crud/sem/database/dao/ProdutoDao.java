package crud.sem.database.dao;

import java.util.List;

import crud.sem.database.data.SingletonList;
import crud.sem.database.entity.Produto;

public class ProdutoDao implements IProductDao {

    @Override
    public List<Produto> listar() {
        List<Produto> produtos = SingletonList.getList();
        return produtos; 
    }

    @Override
    public Produto buscar(Long id) {
        List<Produto> produtos = SingletonList.getList();
        Produto produto = produtos.stream()
                                    .filter(p -> p.getId() == id)
                                    .findFirst()
                                    .orElseThrow();
        return produto;
    }

    @Override
    public Produto cadastrar(Produto produto) {
        List<Produto> produtos = SingletonList.getList();
        produtos.add(produto);
        return produto;
    }

    @Override
    public Produto atualizar(Produto newProduto, Long id) {
        Produto produto = buscar(id);

        produto.setNome(newProduto.getNome());
        produto.setPreco(newProduto.getPreco());
        produto.setQtde(newProduto.getQtde());

        return produto;
    }    

    @Override
    public void remover(Long id) {
        List<Produto> produtos = SingletonList.getList();
        Produto produto = buscar(id);
        produtos.remove(produto);
    }
    
}
