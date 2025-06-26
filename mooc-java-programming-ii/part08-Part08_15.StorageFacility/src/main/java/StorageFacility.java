
import java.util.ArrayList;
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
public class StorageFacility {
    
    private HashMap <String , ArrayList<String>> storage;
    
    public StorageFacility() {
        storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (storage.containsKey(storageUnit)) {
            return storage.get(storageUnit);
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item) {
        storage.get(storageUnit).remove(item);
        if (storage.get(storageUnit).size() < 1) {
            storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for(String unit : storage.keySet()) {
            units.add(unit);
        }
        return units;
    }
}
