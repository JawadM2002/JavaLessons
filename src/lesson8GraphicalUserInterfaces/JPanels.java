package lesson8GraphicalUserInterfaces;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanels extends JFrame { // Main class extends JFrame class
	
	static JFrame b; // JFrame
	
	static JButton a, a1, a2;
	
	static JLabel l; // A label displays the text

	public static void main(String[] args) {
		
		b = new JFrame("This is a panel"); // Creates new frame to store text field and button
		
		l = new JLabel("The panel label"); // creates label to display text
		
		a = new JButton("This is the first button"); // creates new buttons
		a1 = new JButton("Second button");
		a2 = new JButton("Third button");
		
		JPanel s = new JPanel(new BorderLayout()); // Creates panel to add buttons and specific layout
		// We can also use BoxLayout for the x and y axis.
		// Example: s.setLayout(new BoxLayout(s, BoxLayout.X_AXIS));
		
		s.add(a, BorderLayout.NORTH); // Adds button and text field to the panel with add() methods
		s.add(a1, BorderLayout.EAST);
		s.add(a2, BorderLayout.WEST);
		s.add(l, BorderLayout.SOUTH);
		
		s.setBackground(Color.green); // sets background of panel
		
		b.add(s); // adds panel to frame
		
		b.setSize(800, 600); // sets size of frame
		
		b.show();

	}

}
