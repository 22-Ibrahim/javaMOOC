
public class Statistics {
    private int count = 0;
    private int sum = 0;
    
    
    public Statistics() {
        
    }
    public void addNumber(int number) {
        sum += number;
        count ++;
    }
    public int getCount() {
        return count;
    }
    public int sum() {
        return sum;
    }
    public double average () {
        return 1.0 * sum / count;
    }
    
    
}
