package lesson8GraphicalUserInterfaces;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JSwingComboBox extends JFrame implements ItemListener {
	
	static JFrame a;
	static JLabel r1, r2, r3, r4;
	static JComboBox c1, c2;

	public static void main(String[] args) {
		a = new JFrame("Combo Box example");
		JSwingComboBox cb = new JSwingComboBox(); // creates object, e.g. className c = new className();
		a.setLayout(new FlowLayout());
		String s1[] = { 
				"United Kingdom", "United States", "Spain", "Japan", "Canada", 
				"Australia", "Bangladesh", "India", "Pakistan", "Brazil", "Italy"}; // array of countries
		String s2[] = {"London", "Washington", "Madrid", "Tokyo", "Ottawa",
				"Canberra", "Dhaka", "Mumbai", "Islamabad", "Brasilia", "Rome"}; // arrays of capital cities
		
		c1 = new JComboBox(s1);
		c2 = new JComboBox(s2); // combobox
		
		c1.addItemListener(cb);
		c2.addItemListener(cb);
		
		r1 = new JLabel("Select a place you would visit ");
		r2 = new JLabel("United Kingdom has been selected"); // creates labels
		r3 = new JLabel("Select your capital city");
		r4 = new JLabel("London has been selected");
		
		// sets text colour
		r1.setForeground(Color.green);
		r2.setForeground(Color.orange);
		r3.setForeground(Color.red); 
		r4.setForeground(Color.green);
		
		// adds comboboxes to panel
		JPanel p = new JPanel();
		p.add(r1);
		p.add(c1);	
		p.add(r2);
		p.add(r3);
		p.add(c2);
		p.add(r4);
		
		p.setLayout(new FlowLayout());
		
		a.add(p);
		a.setSize(750, 500);
		a.show();
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == c1) { // This is used if a Combobox item has changed
			r2.setText(c1.getSelectedItem() + " has been selected");
		}
		else { // if combobox 2 state is changed
			r4.setText(c2.getSelectedItem() + " has been selected");
	}
}
}