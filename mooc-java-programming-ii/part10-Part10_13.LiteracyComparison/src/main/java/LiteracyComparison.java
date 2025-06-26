
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        try {
        Files.lines(Paths.get("literacy.csv")).map(row -> row.split(","))
            .sorted((f,s) -> {
                return f[5].compareTo(s[5]);})
                .forEach(row -> System.out.println(row[3] + " (" + row[4] + "), " + row[2].split(" ")[1]+", " + row[5]));
         
        } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }
    }
    
    
}
