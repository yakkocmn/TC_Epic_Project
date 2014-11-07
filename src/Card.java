import java.awt.Color;


public class Card 
{
	private int cardType;
	private char symbol;
	private Color cardColor;
	
	public Card(int numb, char symb, Color color)
	{
		cardType = numb;
		symbol = symb;
		cardColor = color;
	}
	
	public int getCardType()
	{
		return cardType;
	}
	
	public char getSymbol()
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
	
	public void setSymbol(char newSymbol)
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
