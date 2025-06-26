/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author ebrah
 */
public class Flight {
    private Airplane plane;
    private Place departure;
    private Place destination;
    
    public Flight(Airplane plane, Place departure, Place destination) {
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
    }
    
    public Airplane getAirplane() {
        return this.plane;
    }
    
    public Place getDestination() {
        return this.destination;
    }
    
    public Place getDeparture() {
        return this.departure;
    }
    
    @Override
    public String toString() {
        return this.plane.toString() + " (" + this.departure + "-" + this.destination + ")";
    }
}
