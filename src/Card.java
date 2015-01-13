import java.awt.Color;
//WOW THIS IS SO KEWL

public class Card 
{
	private int cardType;//1-13 (ace=1)
	private String symbol; //Spade/Club/Heart/Diamond
	private Color cardColor;//Red || Black
	
	public Card(int numb, String symb, Color color)
	{
		cardType = numb;
		symbol = symb;
		cardColor = color;
	}
	
	public String toString()
	{
		String currSymb;
		
		if(symbol.equalsIgnoreCase("Spade"))
			currSymb = "\u2660";
		
		
			
		String boop = (String)cardType + " " + symbol
		return boop;
	}
	
	public int getCardType()
	{
		return cardType;
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
		cardType = newType;
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
