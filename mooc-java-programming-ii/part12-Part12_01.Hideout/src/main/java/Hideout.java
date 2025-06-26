
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
public class Hideout<T> {
    
    private List<T> hide;
    public Hideout() {
        hide = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide){
        if (!hide.isEmpty()) {
            hide.clear();
            hide.add(toHide);
        }
        hide.add(toHide);
    }
    
    public T takeFromHideout(){
        if (hide.isEmpty()) {
            return null;
        }
        T take = hide.get(0);
        hide.clear();
        return take;
    }
    
    public boolean isInHideout(){
        if (hide.isEmpty()) {
            return false;
        }
        return true;
    }
}
