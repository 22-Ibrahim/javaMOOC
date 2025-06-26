
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Suitcase {
    private ArrayList <Item> items;
    private int maxWeight;
    private int total = 0;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if ((total += item.getWeight()) <= maxWeight) {
            items.add(item);
            total += item.getWeight();
        }
    }
    
    public int totalWeight() {
        return total;
    }
    
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)" ;
        }
        if (items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg";
        }
        return items.size() + " items (" + this.totalWeight() + " kg";
    }
    
    public void printItems() {
        System.out.println(items);
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item current = items.get(0);
        for(Item item: items) {
            if (item.getWeight() > current.getWeight()) {
                current = item;
            }
        }
        return current;
    }
}

