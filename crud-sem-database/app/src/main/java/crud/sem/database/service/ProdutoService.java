package crud.sem.database.service;

import java.util.List;

import crud.sem.database.dao.IProductDao;
import crud.sem.database.entity.Produto;

public class ProdutoService {
    
    private final IProductDao produtoDao;

    public ProdutoService(IProductDao produtoDao) {
        this.produtoDao = produtoDao;
    }

    public List<Produto> listar() throws Exception {
        return produtoDao.listar();
    }

    public Produto cadastrar(Produto produto) throws Exception {
        return produtoDao.cadastrar(produto);
    }

    public Produto buscar(Long id) throws Exception {
        return produtoDao.buscar(id);
    }

    public Produto atualizar(Produto produto, Long id) throws Exception {
        return produtoDao.atualizar(produto, id);
    }

    public void remover(Long id) throws Exception {
        produtoDao.remover(id);
    }
}
