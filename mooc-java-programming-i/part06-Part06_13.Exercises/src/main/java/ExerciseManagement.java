
import java.util.ArrayList;


public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement() {
        exercises = new ArrayList<>();
    }
    public ArrayList<Exercise> exerciseList() {
        return exercises;
    }
    public void add(String exercise) {
        exercises.add(new Exercise(exercise));
    }
    public void markAsCompleted(String exercise) {
        for(Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleted(true);
            }
        }
    }
    public boolean isCompleted(String exercise) {
        for(Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        return false;
    }
}
