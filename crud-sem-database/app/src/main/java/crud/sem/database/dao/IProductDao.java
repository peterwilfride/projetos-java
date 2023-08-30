package crud.sem.database.dao;

import java.util.List;

import crud.sem.database.entity.Produto;

public interface IProductDao {
    
    public List<Produto> listar() throws Exception;

    public Produto buscar(Long id) throws Exception;

    public Produto cadastrar(Produto produto) throws Exception;

    public Produto atualizar(Produto produto, Long id) throws Exception;

    public void remover(Long id) throws Exception;
}
