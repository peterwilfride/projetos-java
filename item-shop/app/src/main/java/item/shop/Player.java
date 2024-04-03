package item.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    
    private List<Item> items;
    private Integer coins;

    public Player(Integer coins) {
        this.items = new ArrayList<>();
        this.coins = coins;
    }

    public void buyItem(Item item) throws Exception {
        if (this.items.size() > 5) {
            throw new Exception("Não há espaço!");
        }
        
        int deduction = 0;
        if (!item.hasChildren()) {
            this.items.add(item);
            deduction += item.getCost();
        } else {
            List<Item> itemsChild = item.getChildrenItems();
            List<Item> itemsChildCopy = itemsChild;
            for (Item _item : itemsChild) {
                System.out.println("imprimindo 2" + _item);
                if (this.items.contains(_item)) {
                    this.items.remove(_item);
                    itemsChildCopy.remove(_item);
                }
            }
            this.items.add(item);
            deduction += item.getCost() - itemsChildCopy.stream()
                                                        .map(i -> i.getCost())
                                                        .reduce(0, Integer::sum);
        }
        this.deductCost(deduction);
    }

    public void deductCost(Integer cost) throws Exception{
        if (this.coins - cost < 0) {
            throw new Exception("Não há dinheiro suficiente!");
        }
        this.coins -= cost;
    }

    @Override
    public String toString() {
        return "Player [coins=" + coins + "]";
    }

    public List<Item> getItems() {
        return items;
    }

    public void status() {
        System.out.println("-------------------------------");
        System.out.println(this.toString());
        this.getItems().forEach(System.out::println);
        System.out.println("-------------------------------");
    }
}