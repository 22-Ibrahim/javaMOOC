/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Person {
    private String name;
    private Education education;
    
    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }
    
     public String getName() {
        return this.name;
    }
    
    public Education getEducation(){
        return this.education;
    }
    
    @Override
    public String toString(){
        return this.getName() + ", " + this.getEducation();
    }
    
   
}
