
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
    private TodoList toDo;
    private Scanner scanner;
    
    public UserInterface(TodoList toDo, Scanner scanner) {
        this.toDo = toDo;
        this.scanner = scanner;
    }
    
    public void start () {
        while(true) {
            System.out.println("Command: "); 
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add: ");
                String toBeAdded = scanner.nextLine();
                toDo.add(toBeAdded);
                continue;
            }
            if (command.equals("list")) {
                toDo.print();
            }
            if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int toRemove = Integer.valueOf(scanner.nextLine());
                toDo.remove(toRemove);
            }
        }
    }
}
