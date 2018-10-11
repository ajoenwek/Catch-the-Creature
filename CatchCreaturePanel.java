//***************************************************
// CatchCreaturePanel.java      Grace Joe-Nweke
//
//Represents the display for the program
//****************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class CatchCreaturePanel extends JPanel {
	private JLabel label;
	private ImageIcon icon;
	private Timer timer;
	private int x = 200;
	private int y = 200;
	private Random generator = new Random();
	private int count = 0;
	private JButton button;
	private int delay;
	
	private JButton Quitbutton;
	
	public CatchCreaturePanel()
	{ 
		
		setLayout(new FlowLayout());
		icon = new ImageIcon("images.jpeg");
		
		button = new JButton(icon);
	    button.addActionListener(new ButtonListener());
	     
	 
	  Quitbutton = new JButton("Quit");
	  Quitbutton.setLocation(0, 0);
	  Quitbutton.addActionListener(new ButtonListener());
	 
	  // random number from 0.8 seconds (800 milliseconds) to 2 seconds(2000 milliseconds)
		 	
	  delay = generator.nextInt(2000)+800 ; 
	  timer = new Timer(delay, new ButtonListener());
	 
	  label = new JLabel("Score")	;
	 
	 JOptionPane.showMessageDialog(null, "Welcome!\n To play game, use the mouse to click on the creature "
				+ "\nPress \'ok\' to begin",	"Catch The Creature", JOptionPane.INFORMATION_MESSAGE, icon);
	 
	 add (button);
   	 add(label);
  add(Quitbutton);
	
  button.setBounds(120, 150,50, 50);setBackground(Color.MAGENTA);
    setPreferredSize(new Dimension(450,400));
    timer.start();
    
	}

	
	
		private class ButtonListener implements ActionListener{
		
		public void actionPerformed (ActionEvent event){
		
		
		if (event.getSource() == button)
			{     count++;
		
			label.setText("Score; " + count);
			}
		
		else if (event.getSource() == timer)
		{  x = generator.nextInt(350)+50;
	       
		   y = generator.nextInt(300)+ 50;
	       
	       button.setLocation(x, y);
              }
		else if (event.getSource() == Quitbutton)
			{JOptionPane.showMessageDialog(null, "Goodbye!	","Catch The Creature", JOptionPane.INFORMATION_MESSAGE, icon);
		
			System.exit(0);}
		}
	}
}
