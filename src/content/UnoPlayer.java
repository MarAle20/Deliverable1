/*
 * Marian Alejandro Heredia
 * Student ID:991577926
 */
package content;

import ca.sheridancollege.project.GroupOfCards;
import ca.sheridancollege.project.Player;
import java.util.ArrayList;
import java.util.Scanner;

public class UnoPlayer extends Player {
    private PlayerHand playerHand = new PlayerHand();
    public UnoPlayer(String name){
        super(name);
    }
    
    //Still working on this oneeee
    //3? methods. One to ask for player card to discard, other to compare with the top card in discard pile-----
    //Ask for top card in discardPile as parameter.

    
    
    //Check if user uno card is comptible with uno discard pile and discard the card you utilice
    
    //Discard one card ins the playerHand and adds to discardPile
    public void discardOneCardInPlayerHand(int cardIndex,DiscardPile discardPile){
        discardPile.addDiscardCard(playerHand.getPlayerHandArray().get(cardIndex));
        playerHand.getPlayerHandArray().remove(cardIndex);
        System.out.println("Now you have this cards");
        System.out.println("This are the cards in discardPile:");
        discardPile.dislayDiscardPile();
        discardPile.displayTopDiscardCard();
        displayPlayerHand();
    }
    
    //Ask user for card and loop to check if the index the put is okay returns uno card(Does not delete the card)
    //returns index of card choosen.
    public int askForUnoCard(){
        
        int userInput = -1;
        int playerHandLength = playerHand.getPlayerHandArray().size();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(getUnoPlayerID()+" this are your cards:");
        displayPlayerHand();
        System.out.println("Insert the No. of the card you want to discard:");
        
        
         while( userInput < 0 || userInput >= playerHandLength){
        
            if(scanner.hasNextInt()){
                userInput = scanner.nextInt();
                if(userInput >= 0 && userInput < playerHandLength){ 
                    System.out.println("This is a number");
                }else{
                    System.out.println("The number you entered is not available.");          
                    System.out.print("Try again! Enter the No. of the card you want to discard: ");
                    scanner.nextLine();
                }               
            }else{
                System.out.println("This is not  number");
                System.out.print("Try again! Enter the No. of the card you want to discard: ");
                scanner.nextLine();    
            }
 
    }
         return userInput;
    }
    
    
    
    //----------------------------------
    
    //Get name of player
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
