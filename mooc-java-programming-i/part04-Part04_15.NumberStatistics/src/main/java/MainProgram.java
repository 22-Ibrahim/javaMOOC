
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers: ");
        Statistics test = new Statistics();
        Statistics test2 = new Statistics();
        Statistics test3 = new Statistics();
        while(true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            test.addNumber(input);
            if (input % 2 == 0) {
                test2.addNumber(input);
            }
            if (input % 2 != 0) {
                test3.addNumber(input);
            }
        }
        System.out.println(test.sum());
        System.out.println(test2.sum());
        System.out.println(test3.sum());
        
        
    }   
}
