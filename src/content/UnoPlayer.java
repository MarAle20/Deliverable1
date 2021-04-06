/*
 * Marian Alejandro Heredia
 * Student ID:991577926
 */
package content;

import ca.sheridancollege.project.GroupOfCards;

public class UnoPlayer {
    private String playerName;
    private PlayerHand playerHand;
    
    public UnoPlayer(String name){
        
    }
    
    
    public void setPlayerHand(PlayerHand playerHand){
        this.playerHand = playerHand;
    }
    
    public GroupOfCards getPlayerHand(){
        return playerHand.getPlayerHand();
    }
    
    
    
    
}
