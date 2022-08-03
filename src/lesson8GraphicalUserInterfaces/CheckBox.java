package lesson8GraphicalUserInterfaces;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CheckBox extends JFrame{
	
	static JFrame f;

	public static void main(String[] args) {
		f = new JFrame("Checkbox template");
		
		f.setLayout(new FlowLayout()); // sets the layout of the frame
		
		JCheckBox cb = new JCheckBox("First"); // this will create the checkboxes
		JCheckBox cb1 = new JCheckBox("Second");
		
		JPanel p = new JPanel();
		
		p.add(cb); // adds the checkboxes to the panel
		p.add(cb1);
		
		f.add(p);
		f.setSize(250, 250);
		f.show();

	}

}
