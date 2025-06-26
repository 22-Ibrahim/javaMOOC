/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Container {
    private int container;
    
    public int contains() {
        return container;
    }
    public void add(int amount) {
        container += amount;
    }
    public void remove(int amount) {
        container -= amount;
    }
    public String toString() {
        return container + "/100";
    }
}
