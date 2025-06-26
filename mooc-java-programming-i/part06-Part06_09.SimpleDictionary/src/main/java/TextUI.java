
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class TextUI {
    private Scanner scanner = new Scanner(System.in);
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                
                break;
            }
            if (input.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                dict.add(word, translation);
                continue;
            }
            if (input.equals("search")) {
                System.out.println("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                String translation = dict.translate(toBeTranslated);
                if (translation.equals(null)) {
                    System.out.println("Word "+ toBeTranslated + " was not found");
                    continue;
                }
                System.out.println(translation);
                continue;
            }
            System.out.println("Unknown command");
            continue;
        }
        System.out.println("Bye bye!");
    }
}

