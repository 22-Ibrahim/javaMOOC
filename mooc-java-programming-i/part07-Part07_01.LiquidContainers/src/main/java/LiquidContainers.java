
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First; " + first + "/100" + "\n" + "Second " + second + "/100" );
     
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int number = Integer.valueOf(parts[1]);
            
            if (parts[0].equals("add") && number > 0) {
                first += number;
            }
            if (parts[0].equals("move") && number > 0) {
                if (number > first) {
                    second = first;
                    first = 0;
                } else {
                first -= number;
                second += number;
                }
            }    
            if (command.equals("remove") && number > 0) {
                second -= number;
            }
            
            if (first > 100) {
                first = 100;
            }
            if (second > 100) {
                second = 100;
            }
            
            if (second < 0) {
                second = 0;
            }
        }
    }

}
