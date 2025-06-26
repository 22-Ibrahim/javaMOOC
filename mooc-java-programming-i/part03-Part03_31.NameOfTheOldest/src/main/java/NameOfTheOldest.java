
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestPerson = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] comma = input.split(",");
            String name = comma[0];
            int age = Integer.valueOf(comma[1]);
            if (age > oldest) {
                oldest = age;
                oldestPerson = name;
            }
        }    
        System.out.println("Name of the oldest: " + oldestPerson);
    }
}
