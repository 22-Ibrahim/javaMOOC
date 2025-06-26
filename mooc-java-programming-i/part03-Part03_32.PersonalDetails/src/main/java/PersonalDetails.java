
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        String longestName = "";
        int count = 0;
        int sum = 0;
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }else {
                count++;
            }
            String[] splitted = input.split(",");
            String name = splitted[0];
            int age = Integer.valueOf(splitted[1]);
            int length = name.length();
            sum = sum + age;
            if (length > longest) {
                longest = length;
                longestName = name;
            }
        }
        double avg = 1.0 * sum / count;
        System.out.println(longestName + "-" + avg);
    }
}
