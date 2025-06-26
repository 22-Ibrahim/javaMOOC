
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int inputs = 0;
        while (true) {
            
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            if (number > 0) {
                total = total + number;
                inputs = inputs + 1;
            }else {
                System.out.println("Cannot calculate the average");
                continue;
            }
        }
        System.out.println(total / inputs);

    }
}
