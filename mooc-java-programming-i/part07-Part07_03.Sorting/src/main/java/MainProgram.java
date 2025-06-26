
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12,0};
//        System.out.println("Smallest: " + MainProgram.smallest(array));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
//        System.out.println(Arrays.toString(array));
//
//        MainProgram.swap(array, 1, 0);
//        System.out.println(Arrays.toString(array));
//
//        MainProgram.swap(array, 0, 3);
//        System.out.println(Arrays.toString(array));
        
        MainProgram.sort(array);
    }
    public static int smallest(int[] array) {
        int smallest = array[0];
        for(int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == MainProgram.smallest(array)) {
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = 0;
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= smallest) {
                index = i;
                smallest = table[i];
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int swapHelper = array[index1];
        array[index1] = array[index2];
        array[index2] = swapHelper;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallest = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, smallest);
        }
    }
}
