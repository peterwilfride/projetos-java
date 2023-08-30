package pagination;

import java.util.List;

public class Pagination<T> {

    private List<T> content;
    private List<T> allContent;
    private int page;
    private int total;
    private int itemsPerPage;
    private int currentItemsPerPage;

    public Pagination(List<T> lista) {
        this.page = 1;
        this.itemsPerPage = lista.size();
        this.total = lista.size();
        this.allContent = lista;
        this.content = this.buildContent(lista);
    }

    private List<T> buildContent(List<T> lista) {
        return lista.stream()
            .skip(this.itemsPerPage * (this.page - 1))
            .limit(this.itemsPerPage)
            .toList();
    }

    public List<T> getContent() {
        return this.content;
    }

    public int getTotal() {
        return total;
    }
    
    public int getPage() {
        return page;
    }

    public int getCurrentItemsPerPage() {
        return this.content.size();
    }
    
    public void setPage(int page) {
        this.page = page;
        this.content = this.buildContent(this.allContent);
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemPerPage) {
        this.itemsPerPage = itemPerPage;
        this.content = this.buildContent(this.allContent);
    }

    public List<T> getAllContent() {
        return allContent;
    }
}
