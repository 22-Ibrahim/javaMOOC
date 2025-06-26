
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter points totals, -1 stops:");
        Point point = new Point();
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            point.add(input);
        }
        System.out.println("Point average (all): " + point.average() );
        System.out.println("Point average (passing): " + point.passingAvg());
        System.out.println("Pass percentage: " + point.passPercentage());
        System.out.println("Grade distribution:");
        point.printGradeDistribution();
    }
}
