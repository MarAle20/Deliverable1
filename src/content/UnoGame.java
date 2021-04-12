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
        DrawPile one = new DrawPile();
        UnoCard card = new UnoCard(Color.RED,Symbol.ONE);
        
        System.out.println(one.drawPile.size());
        System.out.println("-------------------------------");
        GameEngine gameEngine = new GameEngine(players);
        gameEngine.playerRegistration();
    
    }

    @Override
    public void play() {
        
    }

    @Override
    public void declareWinner() {
        
    }
}
