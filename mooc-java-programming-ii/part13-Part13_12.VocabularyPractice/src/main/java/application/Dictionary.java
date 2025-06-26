/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author ebrah
 */
public class Dictionary {
    private List<String> savedWords;
    private Map<String, String> translations;
    
    public Dictionary() {
        savedWords = new ArrayList<>();
        translations = new HashMap<>();
    }
    
    public void add(String word, String trans) {
        if(!translations.containsKey(word)){
            savedWords.add(word);
        }
        translations.put(word, trans);
    }
    
    public String get(String word) {
       return translations.get(word);
    }
    
    public String random() {
        Random random = new Random();
        return this.savedWords.get(random.nextInt(savedWords.size()));
    }
}
