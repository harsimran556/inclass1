/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Student Number=991547518
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 * @modifier harsimran kaur
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            
            c.setValue((int)(Math.random()* 13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)+0]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Card value and suit");
        int CardNumber= input.nextInt();
        String s=input.next();
        
        System.out.println("Card number"+CardNumber);
        System.out.println("Suit of the caed is"+s);
        Card luckycard= new Card();
        Card.setSuit("Heart");
        Card.setValue(1);
    }
    
}
