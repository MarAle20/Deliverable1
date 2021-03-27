/*
 * Marian Alejandro Heredia
 * Student ID:991577926
 */
package content;

import ca.sheridancollege.project.Card;

public class UnoCard extends Card {
    
    enum Color{
        RED,YELLOW,BLUE,GREEN
    }
    enum Symbol{
        ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,HEIGTH,NINE,DRAWTWO,REVERSE,SKIP,WILDCARD,FOURWILDCARD
    }
    
    Color color;
    Symbol symbol;
    
    public UnoCard(Color color,Symbol symbol){
        this.color = color;
        this.symbol = symbol;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Color: " + this.color + "  Symbol: " + this.symbol;
    }
    
    //Method to Compare one card color with other card color
    //Method to compare one card symbol with other card symbol
    
    
}
