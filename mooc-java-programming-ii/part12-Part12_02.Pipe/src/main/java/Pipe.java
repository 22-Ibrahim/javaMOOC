
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
public class Pipe<T> {
    
    List<T> queue;
    
    public Pipe(){
        queue = new ArrayList<>();
    }
    public void putIntoPipe(T value){
        queue.add(value);
    }
    public T takeFromPipe(){
        if (queue.isEmpty()) {
            return null;
        }
        T current = queue.get(0);
        queue.remove(0);
        return current;
    }
    public boolean isInPipe(){
        if (queue.isEmpty()) {
            return false;
        }
        return true;
    }
}
