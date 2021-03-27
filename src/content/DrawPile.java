/*
 * Marian Alejandro Heredia
 * Student ID:991577926
 */
package content;


import ca.sheridancollege.project.GroupOfCards;
import content.UnoCard.Color;
import content.UnoCard.Symbol;
import java.util.ArrayList;
import java.util.Arrays;

public class DrawPile{
    //Delegator..108 Initial Size. Not that important later.
    GroupOfCards cards = new GroupOfCards(108);
    //ArrayContaining all the cards. :))
    ArrayList<UnoCard> drawPile = cards.getGroupOfCards();
    
    //Set ArrayList with Enums to create UnoDeck (OKAY) :))
    ArrayList<Color> colors = new ArrayList<>();  
    ArrayList<Symbol> symbols = new ArrayList<>();
    
    
    public DrawPile(){
        //Sets the array enums to the arraylist enums. :))
        setArrayListEnums(); 
        //move the arrayList of cards to here
      

    }
    
    
    //Display DrawPileCards
    
    public void showDrawPile(){
        setZeroCards();
        
    
    }
    
    
    //Set zeros & Color. One zero for each color
    public void setZeroCards(){
        for (int i = 0 ; i<colors.size();i++){            
            UnoCard unoCard = new UnoCard(colors.get(i),Symbol.ZERO);
            drawPile.add(unoCard);
        }
    }
    
    
    
    //Set two sets of numbers from 0 to 9 for each color
    
    //set special Cards
    
    
    
    public void printEnums(){
        setArrayListEnums();
        for(int i = 0; i<colors.size();i++ ){
            System.out.println(colors.get(i));
        }
        System.out.println("-------------------------");
        for(int i = 0; i<symbols.size();i++ ){
            System.out.println(symbols.get(i));
        }
        
    }
    
    private void setArrayListEnums(){
        colors.addAll(Arrays.asList(Color.values()));
        symbols.addAll(Arrays.asList(Symbol.values()));
    }
    
    
    
    
    
    
}
