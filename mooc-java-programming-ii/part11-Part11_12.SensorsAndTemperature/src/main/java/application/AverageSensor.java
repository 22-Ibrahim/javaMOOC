/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ebrah
 */
public class AverageSensor implements Sensor{
    
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    @Override
    public boolean isOn() {
        boolean allOn = false;
        for(Sensor sensor : sensors) {
            if(sensor.isOn()) {
                allOn = true;
            }else {
                allOn = false;
                break;
            }
        }
        return allOn;
    }

    @Override
    public void setOn() {
        for(Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        int cum = 0;
        if (this.isOn() && !sensors.isEmpty()) {
            for(Sensor sensor : sensors) {
            cum += sensor.read();
        }
        int avg = cum / sensors.size();
        readings.add(avg);
        return avg;
        }
        
        throw new IllegalStateException();
        
    }
    
    public List<Integer> readings(){
        
        return readings;
    }
    
}
