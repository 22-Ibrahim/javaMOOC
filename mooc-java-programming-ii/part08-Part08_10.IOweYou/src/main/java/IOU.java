
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class IOU {
    
    private HashMap <String , Double> debt;
    
    public IOU() {
        debt = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        double current = this.debt.getOrDefault(toWhom, 0.0);
        current = current + amount;
        debt.put(toWhom, current);
        
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return debt.getOrDefault(toWhom, 0.0);
    }
}
