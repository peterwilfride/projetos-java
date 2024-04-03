package item.shop;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private Integer damage;
    private Integer cost;
    private List<Item> childrenItems;

    public Item(String name, Integer damage, Integer cost) {
        this.name = name;
        this.damage = damage;
        this.cost = cost;
        this.childrenItems = new ArrayList<>();
    }

    public void addChildrenItem(Item item) throws Exception {
        if (item.equals(this)) {
            throw new Exception("Não é possivel que o item seja filho dele mesmo!");
        }
        this.childrenItems.add(item);
    }

    public Integer getCost() {
        return cost;
    }

    public List<Item> getChildrenItems() {
        return childrenItems;
    }
    
    public boolean hasChildren() {
        if (this.getChildrenItems().isEmpty()) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", damage=" + damage + "]";
    }   
}
