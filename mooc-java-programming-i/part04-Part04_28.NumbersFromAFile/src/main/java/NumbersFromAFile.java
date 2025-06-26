import java.util.ArrayList;

import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lower = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upper = Integer.valueOf(scanner.nextLine());
        
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        try(Scanner scanner2 = new Scanner(Paths.get(file))) {
            while(scanner2.hasNextLine()) {
                int number = Integer.valueOf(scanner2.nextLine());
                list.add(number);
            }
        } catch(Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        int count = 0;
        for(int numbers: list) {
            if (numbers >= lower && numbers <= upper) {
                count++;
            }
        }
        System.out.println("Numbers: " + count);

    }

}
