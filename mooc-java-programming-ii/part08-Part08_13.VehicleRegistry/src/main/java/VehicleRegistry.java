
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
public class VehicleRegistry {
    
    private HashMap<LicensePlate , String> plateOwner;
    
    public VehicleRegistry() {
        plateOwner = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        String toBeOwner = plateOwner.getOrDefault(licensePlate, "null");
        if (toBeOwner.equals("null")) {
            this.plateOwner.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.plateOwner.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (plateOwner.containsKey(licensePlate)) {
            this.plateOwner.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for(LicensePlate plate : this.plateOwner.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        
        for(LicensePlate plate : plateOwner.keySet()) {
            String owner = this.plateOwner.get(plate);
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
