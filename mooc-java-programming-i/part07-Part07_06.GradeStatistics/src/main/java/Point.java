
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Point {
    private int point;
    private int sum = 0;
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    
    public Point() {
        points = new ArrayList<>();
        grades = new ArrayList<>();
    }
    
    public void add(int point) {
        if (point >= 0 && point < 101) {
            points.add(point);
            sum += point;
            this.pointsToGrades(point);
        }
        
    }
    
    public ArrayList getPoints() {
        return points;
    }
    
    public int getPoint() {
        return point;
    }
    
    public double average() {
        double avg = 1.0 * sum / points.size();
        return avg;
    }
    
    public double passingAvg() {
        int passTotal = 0;
        int passSum = 0;
        for(int i : points) {
            if (i >= 50) {
                passSum += i;
                passTotal++;
            }
        }
        double passAvg = 1.0 * passSum / passTotal;
        return passAvg;
    }
    
    public double passPercentage() {
        int passed = 0;
        for(int i : points) {
            if (i >= 50) {
                passed++;
            }
        }
        double percentage = 100.0 * passed / points.size();
        return percentage;
    }
    
    public int pointsToGrades(int points) {
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
        grades.add(grade);
        return grade;
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for(int i : grades) {
            if (i == grade) {
                count++;
            }
        }
        return count;
    }
    
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = this.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }
    
    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
