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
public class Package {
    
    private ArrayList <Gift> pack;
    
    public Package() {
        pack = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        pack.add(gift);
    }
    
    public int totalWeight() {
        int total = 0;
        for(Gift weight: pack) {
            total += weight.getWeight();
        }
        return total;
    }
    
}
