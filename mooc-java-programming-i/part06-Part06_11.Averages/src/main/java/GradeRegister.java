
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> exPoints;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.exPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        
        exPoints.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        if (grades.isEmpty()) {
            return -1;
        }
        int count = 0;
        for(int grade : grades) {
            count += grade;
        }
        double avg = 1.0 * count / grades.size();
        return avg;
    }
    
    public double averageOfPoints() {
        if (exPoints.isEmpty()) {
            return -1;
        }
        double total = 0;
        for(int points : exPoints) {
            total += points;
        }
        double avg = total / exPoints.size();
        return avg;
    }
}
