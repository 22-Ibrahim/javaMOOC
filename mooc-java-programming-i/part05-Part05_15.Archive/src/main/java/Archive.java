/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Archive {
    private String id;
    private String name;
    
    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String toString() {
        return id +": " + name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Archive)) {
            return false;
        }
        Archive comparedItem = (Archive) compared;
        if (this.id.equals(comparedItem.id)) {
            return true;
        }
        return false;
    }
}
