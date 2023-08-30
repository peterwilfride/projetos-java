package crud.sem.database.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import crud.sem.database.data.SingletonDB;
import crud.sem.database.entity.Produto;

public class ProdutoDBDao implements IProductDao {

    @Override
    public List<Produto> listar() throws Exception {
        Connection conn = null;
        Statement stm = null;
        List<Produto> produtos = new ArrayList<>();

        try {
            conn = SingletonDB.getConnection();
            stm = conn.createStatement();
            String sql = "SELECT * FROM produtos";
            ResultSet resultSet = stm.executeQuery(sql);
            
            while(resultSet.next()) {
                Produto p = new Produto();
                p.setId(resultSet.getLong("id"));
                p.setNome(resultSet.getString("nome"));
                p.setPreco(resultSet.getDouble("preco"));
                p.setQtde(resultSet.getInt("qtde"));
                produtos.add(p);
            }
            return produtos;
        } catch(Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
    }

    @Override
    public Produto buscar(Long id) throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;
        Produto p = null;
        
        try {
            conn = SingletonDB.getConnection();
            String sql = "SELECT * FROM produtos WHERE id = ?";
            stm = conn.prepareStatement(sql);
            stm.setLong(1, id);
            ResultSet resultSet = stm.executeQuery();

            if (resultSet.next()) {
                p = new Produto();
                p.setId(resultSet.getLong("id"));
                p.setNome(resultSet.getString("nome"));
                p.setPreco(resultSet.getDouble("preco"));
                p.setQtde(resultSet.getInt("qtde"));
            }
            return p;
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
    }

    // CREATE TABLE produtos (id INTEGER PRIMARY KEY, nome TEXT, preco REAL, qtde INTEGER);
    @Override
    public Produto cadastrar(Produto produto) throws Exception{
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = SingletonDB.getConnection();
            String sql = "INSERT INTO produtos (id, nome, preco, qtde) VALUES (?,?,?,?)";
            stm = conn.prepareStatement(sql);
            stm.setLong(1, produto.getId());
            stm.setString(2, produto.getNome());
            stm.setDouble(3, produto.getPreco());
            stm.setInt(4, produto.getQtde());
            stm.executeUpdate();
            return produto;
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
    }

    @Override
    public Produto atualizar(Produto produto, Long id) throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = SingletonDB.getConnection();
            String sql = "UPDATE produtos SET nome=?,preco=?,qtde=? WHERE id=?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            stm.setDouble(2, produto.getPreco());
            stm.setInt(3, produto.getQtde());
            stm.setLong(4, id);
            stm.executeUpdate();
            produto.setId(id);
            return produto;

        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
    }

    @Override
    public void remover(Long id) throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = SingletonDB.getConnection();
            String sql = "DELETE FROM produtos WHERE id=?";
            stm = conn.prepareStatement(sql);
            stm.setLong(1, id);
            stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
    }
    
}
