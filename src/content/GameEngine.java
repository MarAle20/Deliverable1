/*
 * Marian Alejandro Heredia
 * Student ID:991577926
 */
package content;

import java.util.ArrayList;
import java.util.Scanner;

public class GameEngine {
    //Variables to use
    private ArrayList<UnoPlayer> players;
    private int numberOfPlayers = 0;
    private DrawPile drawPile;
    private DiscardPile discardPile; 
    
    //Constructor
    public GameEngine(ArrayList<UnoPlayer> players,DrawPile drawPile,DiscardPile discardPile){
           this.players = players;
           this.drawPile = drawPile;
           this.discardPile = discardPile;
           drawPile.suffleDrawPile();
    }

    
    //Method to give players initial 7 UnoCards
    public void giveAllPlayers7InitialCards(){
        for(int i = 0 ; i< numberOfPlayers ; i++){
            drawPile.giveInitial7CardsToPlayer(players.get(i));
        }
    }
    
    
   
    
    //Method to ask for player names
        public void playerRegistration(){
        askNumberOfPlayers();
        
        System.out.println("Register each player with a name:");
        
        Scanner scanner = new Scanner(System.in);
        for(int i= 0; i < numberOfPlayers;i++){
            System.out.print("Enter name for player " + (i+1) + ": ");
            String name = scanner.nextLine();
            
            if(i == 0){
                UnoPlayer player = new UnoPlayer(name);
                this.players.add(i, player);
            }else{
                boolean same= true;
                while(same){
                    for(int o = 0 ; o < i ; o++){
                        if(!players.get(o).getUnoPlayerID().equals(name)){
                            same=false;
                        }
                        else{
                            same = true;
                            break;
                        }
                    }
                    
                    
                    if(same){
                        System.out.print("This name is already register. Try other name:");
                        name = scanner.nextLine();
                        continue;
                    }
                    
                    UnoPlayer unoPlayer = new UnoPlayer(name);
                    players.add(i, unoPlayer);
                    
                }

            }

        }

    }
    
    
    //Method to ask number of players
    public void askNumberOfPlayers(){
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter number of Players: ");
        
        while(numberOfPlayers < 2 || numberOfPlayers > 10){
        
            if(scanner.hasNextInt()){
                numberOfPlayers = scanner.nextInt();
                if(numberOfPlayers >= 2 && numberOfPlayers <= 10 ){ 
                    System.out.println("This is a number");
                }else{
                    System.out.println("Only 2 to 10 players  can join!");
                    System.out.print("Enter number of Players: ");
                    scanner.nextLine();
                }               
            }else{
                System.out.println("This is not  number");
                System.out.print("Enter number of Players: ");
                scanner.nextLine();    
            }
  
        }
        System.out.println("The number of players is: " + numberOfPlayers);

    }
    
     //Welcome Banner and Instructions!!
    public void gameIntro()
    {
        System.out.println("-------------Welcome to the UNO GAME----------------");
        System.out.println("How to Play:");
    }

}
