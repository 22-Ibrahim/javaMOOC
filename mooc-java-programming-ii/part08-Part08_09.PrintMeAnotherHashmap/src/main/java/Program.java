
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printValues(HashMap<String,Book> hashmap) {
        for(Book book : hashmap.values()) {
            System.out.println(book);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        text = cleanString(text);
        for(Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }
    public static String cleanString(String text) {
        text = text.toLowerCase();
        return text.trim();
    }
}
