
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        if (fromWhere < 0) {
            fromWhere = 0;
        }
        if (toWhere > array.length - 1) {
            toWhere = array.length - 1;
        }
        int sum = 0;
        for(int i = fromWhere; i <= toWhere; i++){
            if (array[i] <= largest && array[i] >= smallest) {
                sum += array[i];
            }
            
        }
        return sum;
    }
}
