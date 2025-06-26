/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Grade {
    private Point point;
    public Grade(Point point) {
        this.point = point;
    }
    
    public void gradeDistribution(Point point) {
        if (point.getPoint() < 50) {
            System.out.println("failed, i.e. 0");
        }
        if (point.getPoint() < 60) {
            System.out.println("1");
        }
        if (point.getPoint() < 70) {
            System.out.println("2");
        }
        if (point.getPoint() < 80) {
            System.out.println("3");
        }
        if (point.getPoint() < 90) {
            System.out.println("4");
        }
        if (point.getPoint() >= 90) {
            System.out.println("5");
        }
    }
}
