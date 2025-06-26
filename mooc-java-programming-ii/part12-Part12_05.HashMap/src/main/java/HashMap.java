
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
public class HashMap<K, V> {
    private ArrayList<Pair<K,V>> [] values;
    private int firstFreeIndex;
    
    public HashMap() {
        this.values = new ArrayList [32];
        this.firstFreeIndex = 0;
    }
    
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }
        
        ArrayList<Pair<K,V>> searchValues = this.values[hashValue];
        
        for (int i = 0; i < searchValues.size(); i++) {
            if(searchValues.get(i).getKey().equals(key)){
                return searchValues.get(i).getValue();
            }
                
        }
        return null;
    }
    
    public void add (K key, V value) {
        int hashValue = (Math.abs(key.hashCode() % values.length));
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }
        for (int i = 0; i < values[hashValue].size(); i++) {
            if (values[hashValue].get(i).getKey().equals(key)) {
                values[hashValue].get(i).setValue(value);
                break;
            }
            values[hashValue].add(new Pair<>(key, value));
        }
    }
}
