import java.awt.Color;
//WOW THIS IS SO KEWL

public class Card 
{
	private int cardNumber;//1-13 (ace=1)
	private String cardType; //2-10, jack, queen, king, ace
	private String symbol; //Spade/Club/Heart/Diamond
	private String symbolIcon;
	private Color cardColor;//Red || Black
	
	public Card(int numb, String symb, Color color)
	{
		cardNumber = numb;
		symbol = symb;
		cardColor = color;
		
		if(symbol.equalsIgnoreCase("Spade"))
			symbolIcon = "\u2660";
		else if(symbol.equalsIgnoreCase("Heart"))
			symbolIcon = "\u2665";
		else if(symbol.equalsIgnoreCase("Club"))
			symbolIcon = "\u2663";
		else if(symbol.equalsIgnoreCase("Diamond"))
			symbolIcon = "\u2666";
		
		if(cardNumber == 11)
			cardType = "Jack";
		else if(cardNumber == 12)
			cardType = "Queen";
		else if(cardNumber == 13)
			cardType = "King";
		else if(cardNumber ==1)
			cardType = "Ace";
		else
			cardType = cardNumber + "";
	}
	
	public String toString()
	{	
		String boop = cardType + " " + symbolIcon;
		return boop;
	}
	
	public int getCardNumber()
	{
		return cardNumber;
	}
	
	public String getSymbol()
	{
		return symbol;
	}
	
	public Color getColor()
	{
		return cardColor;
	}
	
	public void setType(int newType)
	{
		cardType = newType + "";
	}
	
	public void setSymbol(String newSymbol)
	{
		symbol = newSymbol;
	}
	
	public void setColor(Color newColor)
	{
		cardColor = newColor;
	}
	
	public boolean isRed()
	{
		if(cardColor.equals(Color.RED))
			return true;
		else
			return false;
	}
	
	public boolean isBlack()
	{
		if(cardColor.equals(Color.BLACK))
			return true;
		else
			return false;
	}
	

}
