
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Warehouse {
    
    private Map<String, Integer> warehousePrice;
    private Map<String, Integer> warehouseStock;
    
    public Warehouse() {
        warehousePrice = new HashMap<>();
        warehouseStock = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock) {
        warehousePrice.put(product, price);
        warehouseStock.put(product, stock);
    }
    
    public int price(String product) {
        return warehousePrice.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return warehouseStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (warehouseStock.containsKey(product)) {
            if (stock(product) >= 1) {
                warehouseStock.put(product, stock(product) -1 );
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> productsSet = warehouseStock.keySet();
        return productsSet;
    }
}
