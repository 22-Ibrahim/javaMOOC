
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username1 = "alex";
        String pass1 = "sunshine";
        String user2 = "emma";
        String pass2 = "haskell";
                
        System.out.println("Enter username: ");
        String user = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();
        
         
        if (user.equals(username1) && pass.equals(pass1)) {
            System.out.println("You have successully logged in!");
        }else if (user.equals(user2) && pass.equals(pass2)) {
            System.out.println("You have successully logged in!");
        }else {
            System.out.println("Incorrect username or password!");
        }
    
    }
}
