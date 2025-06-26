/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName,capacity);
        super.addToWarehouse(initialBalance);
        history = new ChangeHistory();
        history.add(super.getBalance());
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return taken;
    }
    public String history() {
        return history.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history);
        System.out.println("Largest amount of product: " +  history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
