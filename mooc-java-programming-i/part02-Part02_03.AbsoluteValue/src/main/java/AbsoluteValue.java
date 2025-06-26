
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int absolute = scanner.nextInt();
        if (absolute < 0) {
            System.out.println(absolute * -1);
        } else  {
            System.out.println(absolute);
        }
            
    }
}
