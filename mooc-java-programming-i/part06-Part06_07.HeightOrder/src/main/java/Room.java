
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
public class Room {
    private ArrayList <Person> room;
    
    public Room() {
        room = new ArrayList<>();
    }
    
    public void add (Person person) {
        room.add(person);
    }
    
    public boolean isEmpty() {
        return room.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return room;
    }
    
    public Person shortest() {
        if(room.isEmpty()) {
            return null;
        }
        Person toReturn = room.get(0);
        for (Person person: room) {
            if (person.getHeight() < toReturn.getHeight()) {
                
                toReturn = new Person(person.getName(), person.getHeight());
            }
        }
        return toReturn;
    }
    
    public Person take() {
        Person shortest = this.shortest();
        room.remove(this.shortest());
        return shortest;
    }
}
