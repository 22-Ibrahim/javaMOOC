
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int last = scanner.nextInt();
        int result = 0;
        for (int i = 0; i <= last; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
