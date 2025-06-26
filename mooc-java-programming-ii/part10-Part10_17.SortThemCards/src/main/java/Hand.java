
import java.util.ArrayList;
import java.util.Collections;
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
public class Hand implements Comparable<Hand> {
    private List<Card> hand;
    
    public Hand() {
        hand = new ArrayList<>();
    }
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        Iterator<Card> iterator = hand.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    
    
    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
        }
    
    public int compareTo(Hand compared) {
        int thisValue = 0;
        int comparedValue = 0;
        for(Card card : this.hand) {
            thisValue += card.getValue();
        }
        for(Card card : compared.hand) {
            comparedValue += card.getValue();
        }
        return thisValue - comparedValue;
    }
}
