/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Fitbyte {
    private int age;
    private int resting;
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        resting = restingHeartRate;
    }
    public double maximumHeartRate() {
        return 206.3 - (0.711 * age);
    }
    public double targetHeartRate(double percentOfMaximum) {
        return (maximumHeartRate() - resting) * (percentOfMaximum) + resting;
    }
    
}
