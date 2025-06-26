
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
public class Box implements Packable {
    
    private ArrayList<Packable> items;
    private double maxWeight;
    private double currentWeight;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.currentWeight = 0;
    }
    
    public void add(Packable item) {
        currentWeight += item.weight();
        
        if (currentWeight <= maxWeight) {    
            items.add(item);
        }
    }
    
    public double weight() {
        double boxWeight = 0;
        for(Packable item : items) {
            boxWeight += item.weight();
        }
        return boxWeight;
    }
    
        public String toString() {
            return "Box: " + items.size() + " items," + " total weight " + this.weight() + " kg";
        }
}
