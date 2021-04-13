
package content;

import ca.sheridancollege.project.GroupOfCards;
import java.util.ArrayList;

public class DiscardPile {
    private GroupOfCards groupOfCards = new GroupOfCards(0);
    private  ArrayList<UnoCard> discardPile = groupOfCards.getGroupOfCards();
    
    
    
    //Add one card to the discardPile 
    public void addDiscardCard(UnoCard unoCard){
        discardPile.add(unoCard);  
    }
    
    
    
    public UnoCard getTopDiscardCard(){
        int lastCardAddedIndex = discardPile.size() - 1;
        UnoCard one = discardPile.get(lastCardAddedIndex);
        return one;
    }
    
    
    public void displayTopDiscardCard(){
        System.out.println("Top Discard Card is: " + discardPile.get(discardPile.size()-1).toString());
    }
    
    public void dislayDiscardPile(){
        for(int i=0 ; i < discardPile.size();i++){
            System.out.println("Card No." + (i) + " " + discardPile.get(i));
        }
    }
    
    
}
