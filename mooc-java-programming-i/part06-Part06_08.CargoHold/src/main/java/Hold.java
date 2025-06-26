
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
public class Hold {
    private int maxWeight;
    private ArrayList <Suitcase> luggages;
    private int total = 0;
    private int finalWeight = 0;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        luggages = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if((total += suitcase.totalWeight()) <= this.maxWeight) {
            luggages.add(suitcase);
            total += suitcase.totalWeight();
            total++;
        }
    }
    
    public String toString() {
        return this.total + " suitcases (" + this.finalWeight + " kg";
    }
    
    public void printItems() {
        System.out.println(luggages);
    }
}
