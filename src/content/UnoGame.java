/*
 * Marian Alejandro Heredia
 * Student ID:991577926
 */
package content;

import content.UnoCard.Color;
import content.UnoCard.Symbol;
import java.util.ArrayList;

public class UnoGame {
    
    public static void main(String[] args) {
        
        DrawPile one = new DrawPile();
        UnoCard card = new UnoCard(Color.RED,Symbol.ONE);
        
        System.out.println(one.drawPile);
        System.out.println(one.drawPile.size());
        System.out.println("-------------------------------");
        
        System.out.println(one.drawPile.get(0).equals(card));
        
        System.out.println("------------------------");
        
        one.showDrawPile();
        
        
        
        
    }
}
