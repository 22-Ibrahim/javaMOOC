

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        int search = scanner.nextInt();
        int index = 0;
        boolean found = false;
        while(index < array.length) {
            if (search == array[index]) {
                System.out.println(search + " is at index " + index + ".");
                found = true;
                break;
            }
            index++;
            
        }
        if (!found) {
        System.out.println(search + " was not found");
        }
        // Implement the search functionality here
    }
}

