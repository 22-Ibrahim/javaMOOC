
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Main {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
for (int i = 0; i < 10; i++) {
    numbers.add(i);
}

long howManyNumbers = numbers.stream()
    .filter(i -> i < 4)
    .map(i -> i * 2)
    .filter(i -> i > 10)
    .count();

System.out.println("Numbers: " + howManyNumbers);
        
    }
}
