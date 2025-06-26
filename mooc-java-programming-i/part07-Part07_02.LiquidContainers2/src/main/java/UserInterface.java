
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
    Scanner scan = new Scanner(System.in);

    Container first = new Container();
    Container second = new Container();
    while(true) {
        System.out.println("First; " + first.toString() + "\n Second " + second.toString());
     
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
