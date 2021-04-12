/*
 * Marian Alejandro Heredia
 * Student ID:991577926
 */
package content;

import ca.sheridancollege.project.GroupOfCards;
import java.util.ArrayList;

public class PlayerHand {
    private GroupOfCards groupOfCards = new GroupOfCards(7);
    private ArrayList<UnoCard> playerHand = groupOfCards.getGroupOfCards();
    
    public ArrayList<UnoCard> getPlayerHandArray(){
        return playerHand;
    }
    //Maybe Not going to use
    public void setPlayerHand(GroupOfCards groupOfCards){
        this.groupOfCards = groupOfCards;
    }
    
    public void addCardToPlayerHand(UnoCard unoCard){
       this.playerHand.add(unoCard);
    }
    
    
    public void discardPlayerHandCard(int cardIndex){
        this.playerHand.remove(cardIndex);
    }
    
    //DisplayPlayerHand
    public void displayPlayerHand(){
        for(int i=0 ; i < playerHand.size();i++){
            System.out.println("Card No." + (i+1) + " " + playerHand.get(i));
        }
    }   

    
}
