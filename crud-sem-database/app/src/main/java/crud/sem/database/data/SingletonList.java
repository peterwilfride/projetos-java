package crud.sem.database.data;

import java.util.ArrayList;
import java.util.List;

import crud.sem.database.entity.Produto;

public class SingletonList {

    private static List<Produto> produtos;
    
    private SingletonList() {
    }

    public static List<Produto> getList() {
        if (produtos == null) {
            produtos = new ArrayList<>();
        }
        return produtos;
    }

}
