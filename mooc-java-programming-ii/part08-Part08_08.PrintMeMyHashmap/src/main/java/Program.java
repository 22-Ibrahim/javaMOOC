
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        
    }
    public static void printKeys(HashMap<String,String> hashmap) {
        for(String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        text = cleanString(text);
        for(String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        text = cleanString(text);
        for(String key : hashmap.keySet()){
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
            
    public static String cleanString(String text) {
        text = text.toLowerCase();
        return text.trim();
    }
}
