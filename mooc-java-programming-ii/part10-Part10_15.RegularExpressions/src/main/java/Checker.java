

public class Checker {
    public boolean isDayOfWeek(String string) {
        if (string.matches("sat|sun|mon|tue|wed|thu|fri")) {
            return true;
        }else {
            return false;
        }
    }
    
    public boolean allVowels(String string) {
        if (string.matches("(a|e|o|i|u)+")) {
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay(String string){
        if (string.matches("([0-1][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]")) {
            System.out.println(string);
            return true;
        }
        return false;
    }
}
