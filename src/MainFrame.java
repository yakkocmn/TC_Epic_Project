import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainFrame extends JPanel 
{
	


public MainFrame()
{
	
}

public static void main(String[] args)
{
	JPanel panny=new JPanel(new BorderLayout());
	/////
	JFrame frame=new JFrame("Cardz");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(panny, BorderLayout.CENTER);
	frame.pack();
	//frame.add(panny);
	frame.setVisible(true);
	/////
	
	String answer = JOptionPane.showInputDialog(null, "can i receive some mashed potate");
	String answer2 = null;
	if(answer.equals("yes"))
		answer2 = JOptionPane.showInputDialog(null, "and do you believe in the separation of church and hate");
	if(answer2.equals("yes"))
		JOptionPane.showMessageDialog(null, "u a troo playa");
	
	
}

}
