import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	
	private ArrayList<Card> cards;
	
	public Deck()
	{
		cards = new ArrayList<Card>();
		for(int i = 1; i <= 13; i++)
		{
			Card currCard = new Card(i, "club", Color.BLACK);
			cards.add(currCard);
		}
		
		for(int i = 1; i <= 13; i++)
		{
			Card currCard = new Card(i, "spade", Color.BLACK);
			cards.add(currCard);
		}
		
		for(int i = 1; i <= 13; i++)
		{
			Card currCard = new Card(i, "heart", Color.RED);
			cards.add(currCard);
		}
		
		for(int i = 1; i <= 13; i++)
		{
			Card currCard = new Card(i, "diamond", Color.RED);
			cards.add(currCard);
		}
		
	}
	
	public void shuffle()
	{
		 Collections.shuffle(cards);
	        System.out.println("shuffle successful");
	}
	
	public Card getCard(int place)
	{
		Card desiredCard = cards.get(place);
		return desiredCard;
		
	}
	

}
