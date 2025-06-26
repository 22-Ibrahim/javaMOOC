
import java.util.Random;
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
public class UserInterface {
    private Scanner scan;
    private JokeManager joker;
    
    public UserInterface(JokeManager joker, Scanner scan) {
        this.scan = scan;
        this.joker = joker;
    }
    
    public void start() {
        System.out.println("What a joke!");
        this.readJokes();
    }
    
    public void printingCommands() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");    
        System.out.println(" 3 - list jokes");    
        System.out.println(" X - stop");
    }
    
    public void readJokes() {
        
        while(true) {
            this.printingCommands();
            System.out.println(" ");
            String command = scan.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                this.adding(scan.nextLine());
            } else if (command.equals("2")) {
                this.drawing();
            } else if (command.equals("3")) {
                this.joker.printJokes();
            }
        }
    }
    
    public void adding(String add) {
        this.joker.addJoke(add);
    }
    
    public void drawing() {
        System.out.println(this.joker.drawJoke());
    }
   
}
