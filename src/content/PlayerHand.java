/*
 * Marian Alejandro Heredia
 * Student ID:991577926
 */
package content;

import ca.sheridancollege.project.GroupOfCards;

public class PlayerHand {
    private GroupOfCards groupOfCards = new GroupOfCards(7);
    
    public GroupOfCards getPlayerHand(){
        return groupOfCards;
    }
    public void setPlayerHand(GroupOfCards groupOfCards){
        this.groupOfCards = groupOfCards;
    }
    
    public void addCardToPlayerHand(UnoCard unoCard){
        //Add a card to the player hand
    }
    public void discardPlayerHandCard(int cardIndex){
        //delete one unocard element in the player hand
    }
}
