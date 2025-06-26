
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int first = scanner.nextInt();
        System.out.println("Last number?");
        int last = scanner.nextInt();
        int result = 0;
        for (int i = first; i <= last; i++) {
            result += i;
        }
        System.out.println(result);
    }   
}
