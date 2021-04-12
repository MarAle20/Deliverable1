/*
 * Marian Alejandro Heredia
 * Student ID:991577926
 */
package content;

import ca.sheridancollege.project.GroupOfCards;
import ca.sheridancollege.project.Player;
import java.util.ArrayList;

public class UnoPlayer extends Player {
    private PlayerHand playerHand = new PlayerHand();
    
    public UnoPlayer(String name){
        super(name);
    }
    
    public String getUnoPlayerID(){
        return super.getPlayerID();
    }
    
    public void setPlayerHand(PlayerHand playerHand){
        this.playerHand = playerHand;
    }
    
    public PlayerHand getPlayerHand(){
        return this.playerHand;
    }
    //Display Player Hand
    
    public void displayPlayerHand(){
       playerHand.displayPlayerHand(); 
    }

    @Override
    public void play() {
        
    }
    
    public boolean equals(UnoPlayer unoPlayer){
        if(super.getPlayerID().equals(unoPlayer.getUnoPlayerID())){
            return true;
        }else{
            return false;
        }
            
    }
    
    public boolean equals(String name){
        if(super.getPlayerID().equals(name)){
            return true;
        }else{
            return false;
        }
            
    }
    
}
