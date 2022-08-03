package lesson8GraphicalUserInterfaces;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SwingJList extends JFrame {
	
	static JFrame f;
	static JList li;
	
	public static void main (String[] args) {
		f = new JFrame("List");
		SwingJList jl = new SwingJList();// creates object
		JPanel p = new JPanel();
		JLabel l = new JLabel("Select an area in the UK"); // label
		
		String area[] = { "London", "Wales", "Scotland", "Northern Island" }; // array to store UK areas
		
		li = new JList(area); // creates the list
		li.setSelectedIndex(1); // sets selected index
		
		p.add(li); // adds the list to panel
		f.add(p);
		f.setSize(500, 400);
		f.show();
	}

}
