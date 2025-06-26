
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            int number = scanner.nextInt();
            if (number == 9999) {
                break;
            }
            list.add(number);
        }
        int index = 0;
        int smallest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            if (smallest > current) {
                smallest = current;
                index = i;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + index);
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
