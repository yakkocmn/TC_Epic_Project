import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class CardTable extends JPanel 
{
	private Deck deck;
	private boolean displayingCard=false;
	private Card displayCard;
	
	public CardTable()
	{
		deck = new Deck();
		deck.shuffle();
	}
	
	public Deck getDeck()
	{
		return deck;
	}
	
	public Card getCardFromDeck(int want)
	{
		return deck.getCard(want);
	}
	public void displayCard(Card card)
	{
		displayingCard=true;
		displayCard = deck.getCard(card);
	}
	public void paintComponent(Graphics g)
	{
		Image img = null;
		try
		{
			img = ImageIO.read(new File("pokertable.jpg"));
//			if(displayingCard)
//			{
//				g.drawRect(100, 100, 120, 300);
//			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	    super.paintComponent(g);
	    g.drawImage(img, 0, 0, null);
	    g.drawString(displayCard.toString(), 0, 0);
	}

}
