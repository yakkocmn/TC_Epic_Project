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


public MainFrame()
{
	currCard = 1;
}

public static void main(String[] args)
{
	
	
//	JPanel panny = new JPanel(new BorderLayout());
	CardTable tabby = new CardTable();
	/////
	JFrame frame = new JFrame("Chris and Ted's Card Extravaganza");
	JTextArea textPanel = new JTextArea("the best card game on the planet");
	textPanel.setEditable(false);
	
	JButton shuffle = new JButton("Shuffle");
	JPanel buttonPane = new JPanel();
	buttonPane.setSize(2,2);
	buttonPane.add(shuffle);
	
	shuffle.addActionListener(new ActionListener() 
	{ 
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("You clicked the button");
            tabby.displayCard(tabby.getDeck().getCard(currCard));
            currCard++;
        }
    });   
	
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(tabby, BorderLayout.CENTER);
	frame.getContentPane().add(textPanel, BorderLayout.NORTH);
	frame.getContentPane().add(buttonPane, BorderLayout.CENTER);
	frame.setSize(800, 576);
	frame.setVisible(true);
	/////
	System.out.println(tabby.getCardFromDeck(2).getSymbol());
	
	
}



}
