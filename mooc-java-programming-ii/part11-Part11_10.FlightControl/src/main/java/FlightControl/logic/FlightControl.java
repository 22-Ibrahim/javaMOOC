/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ebrah
 */
public class FlightControl {
    private Map<String, Airplane> planes;
    private Map<String, Flight> flights;
    private Map<String, Place> places;
    
    public FlightControl() {
        planes = new HashMap<>();
        flights = new HashMap<>();
        places = new HashMap<>();
    }
    
    public void addAirplane(String id, int capacity) {
        this.planes.put(id, new Airplane(id, capacity));
    }
    
    public void addFlight(Airplane ap, String destinationID, String departureID) {
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));
        
        Flight flight = new Flight(ap, this.places.get(departureID), this.places.get(destinationID));
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Airplane> getAirplane() {
        return this.planes.values();
    }
    
    public Collection <Flight> getFlights() {
        return this.flights.values();
    }
    
    public Airplane getAirplaneDetail(String id) {
        return this.planes.get(id);
    }
}
