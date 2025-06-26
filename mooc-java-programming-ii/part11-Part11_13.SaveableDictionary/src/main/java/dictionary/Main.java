package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        
long start = System.nanoTime();

SaveableDictionary dictionary = new SaveableDictionary("words.txt");
dictionary.add("apina", "monkey");
dictionary.add("banaani", "banana");
dictionary.add("ohjelmointi", "programming");
dictionary.delete("apina");
dictionary.delete("banana");
boolean wasSuccessful = dictionary.load();

if (wasSuccessful) {
    System.out.println("Successfully loaded the dictionary from file");
}

System.out.println(dictionary.translate("apina"));
System.out.println(dictionary.translate("ohjelmointi"));
System.out.println(dictionary.translate("alla oleva"));
dictionary.load();

// use the dictionary

dictionary.save();

long end = System.nanoTime();
double durationInMilliseconds = 1.0 * (end - start) / 1000000;

System.out.println("The book search took " + durationInMilliseconds + " milliseconds.");
    }
    
}
