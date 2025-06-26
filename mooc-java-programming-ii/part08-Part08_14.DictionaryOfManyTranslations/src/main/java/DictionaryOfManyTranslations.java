
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {
    
    private HashMap <String, ArrayList<String>> dict;
    
    public DictionaryOfManyTranslations() {
        dict = new HashMap<>();
    }
            
    public void add(String word, String translation) {
        dict.putIfAbsent(word, new ArrayList<>());
        dict.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        if (dict.containsKey(word)) {
            return dict.get(word);
        }
        return new ArrayList<>();
    }
    
    public void remove(String word) {
        dict.remove(word);
    }
}
