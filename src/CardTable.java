import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class CardTable extends JPanel 
{
	private Deck deck;
	
	public CardTable()
	{
		deck = new Deck();
		deck.shuffle();
	}
	
	public Card getCardFromDeck(int want)
	{
		return deck.getCard(want);
	}
	
	public void paintComponent(Graphics g)
	{
		Image img = null;
		try
		{
			img = ImageIO.read(new File("pokertable.jpg"));
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	    super.paintComponent(g);
	    g.drawImage(img, 0, 0, null);
	}

}
