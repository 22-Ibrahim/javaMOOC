
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Abbreviations {
    HashMap<String, String> abbreviations;
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = stringClean(abbreviation);
        abbreviations.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = stringClean(abbreviation);
        return abbreviations.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        abbreviation = stringClean(abbreviation);
        if (abbreviations.containsKey(abbreviation)) {
            return abbreviations.get(abbreviation);
        }
        return null;
    }
    public static String stringClean(String string) {
        if (string == null) {
            string = "";
        }
        string.toLowerCase();
        return string.trim();
    }
}
