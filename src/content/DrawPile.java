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
    GroupOfCards groupOfCards = new GroupOfCards(108);
    
    
    //ArrayContaining all the cards. :))
    ArrayList<UnoCard> drawPile = groupOfCards.getGroupOfCards();
    
    //Set ArrayList with Enums to create UnoDeck (OKAY) :))
    ArrayList<Color> colors = new ArrayList<>();  
    ArrayList<Symbol> symbols = new ArrayList<>();
    
    
    public DrawPile(){
        //Sets the array enums to the arraylist enums. :))
        setArrayListEnums(); 
        //create the uno deck (108 cards)
        setUnoDeck();

    }
     
    
    //Display DrawPileCards
    
    public void showDrawPile(){
        groupOfCards.showCards(drawPile);
    }
    
    

    
    //-----------------------Method to arm the UnoDeck in the drawPile ArrayList.----------------------
    public void setUnoDeck(){
        setZeroCards();
        setNumericCards();
        setNumericCards();
        setSpecialColorCards();
        setSpecialColorCards();
        setWildCards();
    }
    
    //---------------------------------------------------------------------------------------
    
    //-------------------Methods to create cards for the UNO Deck --------------------------
    //Creating the cards for the UNO deck.
    
    //Create and Set zeros & Color. One zero for each color
    public void setZeroCards(){
        for (int i = 0 ; i<colors.size();i++){            
            UnoCard unoCard = new UnoCard(colors.get(i),Symbol.ZERO);
            drawPile.add(unoCard);
        }
    }
    //Create and set of numbers from 0 to 9 for each color
    public void setNumericCards(){
        for (int i = 0 ; i < colors.size();i++){
                UnoCard unoCard;
                Color color = colors.get(i);
            for (int e = 1 ; e < 10; e++){
                Symbol symbol = symbols.get(e);
                unoCard = new UnoCard(color,symbol);
                drawPile.add(unoCard);
            }
        }
    }
    
    //Create and set Special Cards with colors 
    public void setSpecialColorCards(){
        for(int i = 0; i< colors.size();i++){
            UnoCard unoCard;
            Color color = colors.get(i);
            for(int e =10 ; e< 13 ; e ++){
                Symbol symbol = symbols.get(e);
                unoCard = new UnoCard(color,symbol);
                drawPile.add(unoCard);
            }                
        }   
    }
    //Create and set special wildcards and fourwildcards.
    public void setWildCards(){
        for(int i = 0; i < 4; i++){
            UnoCard unoCard = new UnoCard(Color.RED,symbols.get(13));
            UnoCard unoCard2 = new UnoCard(Color.RED,symbols.get(14));
            drawPile.add(unoCard);
            drawPile.add(unoCard2);
        }
    }
    
    
    
    
    //------------------------------------------------------------------------------------------
    
    //Enums Methods to set an ArrayList of Colors and Symbols. 
    
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
