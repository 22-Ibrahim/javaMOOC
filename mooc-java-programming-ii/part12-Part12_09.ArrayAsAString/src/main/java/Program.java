
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }
    
    public static String arrayAsString(int[][] array) {
        String arrayAsStr = "";
        for(int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++) {
                arrayAsStr += array[row][column];
            }
            arrayAsStr += "\n";
        }
        return arrayAsStr;
    }
}
