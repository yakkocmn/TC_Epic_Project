import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;


public class MainFrame
{
	private static int currCard;
	private static CardTable tabby = new CardTable();


public MainFrame()
{
	currCard = 1;
}

public static void main(String[] args)
{
	
	
//	JPanel panny = new JPanel(new BorderLayout());
	/////
	JFrame frame = new JFrame("Ted and Chris' Card Extravaganza");
	JTextArea textPanel = new JTextArea("the best card game on the planet");
	textPanel.setEditable(false);
	
	JButton draw = new JButton("Draw Top Card");
	JPanel buttonPane = new JPanel();
	buttonPane.setSize(2,2);
	buttonPane.add(draw);
	
	draw.addActionListener(new ActionListener() 
	{ 
        public void actionPerformed(ActionEvent e)
        {
            //System.out.println("You clicked the button");
            tabby.displayCard(tabby.getDeck().getCard(1));
            if(currCard<=50)
            {
            	currCard++;
            	System.out.println(tabby.getDeck().getNumberOfCards());
            	System.out.println(currCard);
            }
            
            else
            {
            	String input;
            	input = JOptionPane.showInputDialog(null,"Do you wish to reshuffle? (y/n)");
            	if(input.equalsIgnoreCase("y")||input.equalsIgnoreCase("yes"))
            	{	
            		tabby.getDeck().shuffle();
            		currCard=0;
            		System.out.println("SHUFFLED BECAUSE EXCEEDED CARD LIMIT");
            		//clear the current card off the board...
            	}
//            	else
//            		System.exit(1);
            }
            
        }
    });   
	
	JButton shuffle = new JButton("Shuffle");
	JPanel buttonPane2 = new JPanel();
	buttonPane2.setSize(2,2);
	buttonPane2.add(draw);
	buttonPane2.add(shuffle);
	
	shuffle.addActionListener(new ActionListener() 
	{ 
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("You shuffled the deck");
            tabby.getDeck().shuffle();
//            tabby.displayCard(tabby.getDeck().getCard(currCard));
        }
    });   
	
	
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(tabby, BorderLayout.CENTER);
	frame.getContentPane().add(textPanel, BorderLayout.NORTH);
	frame.getContentPane().add(buttonPane, BorderLayout.SOUTH);
	frame.getContentPane().add(buttonPane2, BorderLayout.SOUTH);
	frame.setSize(800, 576);
	frame.setVisible(true);
	/////
	System.out.println(tabby.getCardFromDeck(2).getSymbol());
	
	
}



}
