
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
                }
            String[] wordByWord = input.split(" ");
            for (int i = 0; i < wordByWord.length; i++) {
            System.out.println(wordByWord[i]);
            }
                           
        }
        
        

    }
}
