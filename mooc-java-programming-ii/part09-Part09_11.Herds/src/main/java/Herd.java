
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Herd implements Movable {
    
    private List <Movable> herd;
    
    public Herd() {
        herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    public void move(int dx, int dy) {
        for(Movable movable : herd) {
            movable.move(dx, dy);
        }
    }

    public String toString() {
        String output = "";
        for(Movable movable : herd) {
            output += movable.toString() + "\n";
        }
        return output;
    }
}
