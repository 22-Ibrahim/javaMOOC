
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class ShoppingCart {
    
    private Map<String, Item> cart;
    
    public ShoppingCart() {
        cart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            Item newItem = cart.get(product);
            newItem.increaseQuantity();
            cart.put(product, newItem);
        }
        else {

            cart.put(product, new Item(product, 1, price));
        }
    }
    
    public int price() {
        int price = 0;
        for(Item item : cart.values()) {
            price += item.price();
        }
        return price;
    }
    
    public void print() {
        for(Item item : cart.values()){
            System.out.println(item);
        }
    }
}
