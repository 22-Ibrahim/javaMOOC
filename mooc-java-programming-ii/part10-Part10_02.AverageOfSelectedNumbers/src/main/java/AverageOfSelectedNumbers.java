
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs = new ArrayList<>();
        while(true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }
        
        double avgPositive = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
        
        double avgNegative = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number <0)
                .average()
                .getAsDouble();
         
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String answer = scanner.nextLine();
        if (answer.equals("n")) {
            System.out.println(avgNegative);
        }else {
            System.out.println(avgPositive);
        }
    }
}
