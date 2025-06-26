
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
            
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int s = size-1;
        for (int i = 1; i <= size; i++) {
            printSpaces(s);
            s = s-1;
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int s = height;
        int stars = 1;
        for (int i = 0; i < height; i++) {
            s = s-1;
            printSpaces(s);            
            printStars(stars);
            stars = stars + 2;
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height-2);
            printStars(3);            
        }


    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(2);
        System.out.println("---");
        christmasTree(10);
    }
}
