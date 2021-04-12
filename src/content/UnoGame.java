/*
 * Marian Alejandro Heredia
 * Student ID:991577926
 */
package content;

import ca.sheridancollege.project.Game;
import content.UnoCard.Color;
import content.UnoCard.Symbol;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class UnoGame extends Game {
    //Game Variables
    //Players
    
    //Constructor
    public UnoGame(){
        super("Uno Game");
    }

    //Main method
    public static void main(String[] args) {
        int numberOfPlayers = 0;
        ArrayList<UnoPlayer> players = new ArrayList<>();
        DrawPile drawPile = new DrawPile();
        DiscardPile  discardPile = new DiscardPile();

        System.out.println("---------Player Registration------------");
        GameEngine gameEngine = new GameEngine(players,drawPile,discardPile);
        gameEngine.playerRegistration();
        System.out.println("");
        System.out.println("Giving each user 7 cards");
        gameEngine.giveAllPlayers7InitialCards();

    }

    @Override
    public void play() {
        
    }

    @Override
    public void declareWinner() {
        
    }
}
