
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Employees {
    private List<Person> employees;
    
    public Employees(){
        employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(p -> employees.add(p));
    }
    
    public void print(){
        Iterator<Person>iterator = employees.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()) {
            Person nextP = iterator.next();
            if (nextP.getEducation().equals(education)) {
                System.out.println(nextP);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
