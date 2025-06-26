
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Archive> archive = new ArrayList<>();
        
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            Archive items = new Archive(id, name);
            if (archive.contains(items)) {
                continue;
            }
            archive.add(items);
        }
        
        archive.forEach(System.out::println);
    }
}
