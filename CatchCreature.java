//***************************************************
// CatchCreature.java      Grace Joe-Nweke
//
//Represents the frame for the program
//****************************************************
import javax.swing.*;

public class CatchCreature {
	
	//hi we're trying out github
	
	public static void main (String[] args){
		
	JFrame frame = new JFrame("Catch The Creature");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	CatchCreaturePanel panel = new CatchCreaturePanel ();
	frame.getContentPane().add(panel);
	
	
	frame.pack();
	frame.setVisible(true);
	
	
	 
	  
	 
	
	}

}
