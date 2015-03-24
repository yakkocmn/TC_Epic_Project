import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	
	private ArrayList<Card> cards;
	private ArrayList<Card> removedCards;
	
	public Deck()
	{
		cards = new ArrayList<Card>();
		removedCards = new ArrayList<Card>();
		
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
		//System.out.println(this.getNumberOfCards());
		
	}
	
	public void shuffle()
	{
		cards.addAll(removedCards);
		removedCards.clear();
		 Collections.shuffle(cards);
	        System.out.println("shuffle successful");
	}
	
	public Card getCard(int place)
	{
		Card desiredCard = cards.get(place);
		cards.remove(place);
		removedCards.add(desiredCard);
		return desiredCard;
	}
	
	public Card getCard(Card card)
	{
		Card desiredCard = card;
		cards.remove(card);
		removedCards.add(desiredCard);
		return desiredCard;
	}
	
	public int getNumberOfCards()
	{
		return cards.size();
	}
	
	//public void 
	

}
