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
        ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,DRAWTWO,REVERSE,SKIP,WILDCARD,FOURWILDCARD
    }
    
    private Color color;
    private Symbol symbol;
    
    public UnoCard(Color color,Symbol symbol){
        this.color = color;
        this.symbol = symbol;
    }
    
    
    
    //Compare two cards from one of the cards
    
    public boolean equals(UnoCard card){
        boolean equal = false;
            if((this.color == card.getColor()) || (this.symbol == card.getSymbol()) )
                equal = true;
            else
                equal = false;       
        return equal;
    }
    
    //Getter & Setter Method for Color and Symbol
    public void setColor(Color color){
        this.color =  color;
    }
    public void setSymbol(Symbol symbol){
        this.symbol = symbol;
    }
    
    public Color getColor(){
        return this.color;
    }
    public Symbol getSymbol(){
        return this.symbol;
    }
    
    
    @Override
    public String toString() {
        return "Color: " + this.color + "  Symbol: " + this.symbol;
    }
    
    //Method to Compare one card color with other card color
    //Method to compare one card symbol with other card symbol
    
    
}
