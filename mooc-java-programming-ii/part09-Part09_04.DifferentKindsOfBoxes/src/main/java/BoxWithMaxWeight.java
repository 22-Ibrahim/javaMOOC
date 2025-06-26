
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
public class BoxWithMaxWeight extends Box {
    
    private int capacity = 0;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {

        items = new ArrayList<>();
        this.capacity = capacity;    
    }
    
    public int boxWeight() {
        int weight = 0;
        for(Item item : items) {
            weight += item.getWeight();
        }
        return weight;
    }
    
    public void add(Item item) {
        if (item.getWeight() + this.boxWeight() <= capacity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
       return items.contains(item);
    }
}
