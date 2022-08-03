package lesson8GraphicalUserInterfaces;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SwingJLabel extends JFrame {
	
	 static JFrame fr;
	 	   
	 static JLabel la; // label to display text
	 
	 SwingJLabel(){} // constructor
	
	public static void main(String[] args) {
		
		fr = new JFrame("Label Display");
		la = new JLabel();
		
		la.setText("This is a label"); // adds text to the label
		
		JPanel p = new JPanel(); // creates panel
		
		p.add(la); // adds label to the panel
		fr.add(p); // adds panel to the frame
		
		fr.setSize(350, 350); // size of frame
		fr.show();
		
	}

}
