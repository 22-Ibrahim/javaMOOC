import java.util.ArrayList;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try(Scanner scanner2 = new Scanner(Paths.get(file))) {
            while(scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                
                String [] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                if (age>1) {
                System.out.println(name + ", age: " + age + " years");    
                }else {
                    System.out.println(name + ", age: " + age + " year");
                }
                
            }
        } catch(Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        
    }
}
