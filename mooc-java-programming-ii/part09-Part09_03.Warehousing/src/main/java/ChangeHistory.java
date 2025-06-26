
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
public class ChangeHistory {
    
    private ArrayList <Double> changes;
    
    public ChangeHistory() {
        changes = new ArrayList<>();
    }
    public void add(double status) {
        changes.add(status);
    }
    
    public void clear() {
        changes.clear();
    }
    public String toString() {
        return changes.toString();
    }
    
    public double maxValue() {
        if (changes.isEmpty()) {
            return 0;
        }
        double max = changes.get(0);
        
        for(double i : changes) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    
    public double minValue() {
        if (changes.isEmpty()) {
            return 0;
        }
        double min = changes.get(0);
        
        for(double i : changes) {
            if(i < min) {
                min = i;
            }
        }
        return min;
    }
    
    public double average() {
        double sum = 0;
        
        for(double i : changes) {
            sum += i;
        }
        double avg = sum / changes.size();
        return avg;
    }
}
