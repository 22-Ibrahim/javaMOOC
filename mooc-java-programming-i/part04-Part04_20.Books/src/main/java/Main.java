import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        while(true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("publication Year: ");
            int year = Integer.valueOf(scanner.nextLine());
            library.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed? ");
        String answer = scanner.nextLine();
        if (answer.equals("everything")) {
            for(Book book: library) {
                System.out.println(book);
            }
        }
        if (answer.equals("name")) {
            for(Book book: library) {
                System.out.println(book.getTitle());
            }
        }
        // implement here the program that allows the user to enter 
        // book information and to examine them

    }
}
