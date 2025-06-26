
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            Container first = new Container();
            Container second = new Container();
            String[] parts = input.split(" ");
            String command = parts[0];
            int number = Integer.valueOf(parts[1]);
            
            if (parts[0].equals("add") && number > 0) {
                first.add(number);
            }
            if (parts[0].equals("move") && number > 0) {
                if (number > first.contains()) {
                    second = first;
                    first.remove(number); = 0;
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
