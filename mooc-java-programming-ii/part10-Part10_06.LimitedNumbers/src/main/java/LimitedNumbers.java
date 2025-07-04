
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input < 0){
                break;
            }
            numbers.add(input);
        }
        
        numbers.stream().filter(x -> x > 0 && x < 6)
                .forEach(number -> System.out.println(number));
    }
}
