package lesson8GraphicalUserInterfaces;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ComboBoxAndTextField extends JFrame implements ItemListener, ActionListener {
	
	static JFrame f;
	static JComboBox a;
	static JLabel l, l1;
	static JTextField tf; 
	
	public static void main(String[] args) {
		f = new JFrame("frame");
		
		ComboBoxAndTextField ctf = new ComboBoxAndTextField();
		
		f.setLayout(new FlowLayout()); // layout of frame
		
		String s1[] = { "London", "Dhaka", "Tokyo", "Washington", "Rome" }; // Array elements in combo box
		
		a = new JComboBox(s1);
		tf = new JTextField(15);
		
		JButton b = new JButton("Insert"); // buttons to insert and delete an array element
		JButton b1 = new JButton("Delete");
		
		b.addActionListener(ctf);
		b1.addActionListener(ctf); // color of label text
		
		a.addItemListener(ctf);
		
		l = new JLabel("Capital cities");
		l1 = new JLabel("London Selected");
		
		l.setForeground(Color.blue);
		l1.setForeground(Color.yellow);
		
		JPanel p = new JPanel(); // creates new panel
		
		p.add(l); // adds combobox to panel
		p.add(a);
		p.add(tf);
		p.add(b);
		p.add(b1);
		
		// adds the panel to the frame
        f.add(p);
 
        // size of frame
        f.setSize(700, 200);
 
        f.show();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("Insert")) {
			a.addItem(tf.getText());
		}
		else {
			a.removeItem(tf.getText());
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) { // If state combobox is changed
		if (e.getSource() == a) {
			l1.setText(a.getSelectedItem() + " has been selected");
		}
		
	}

}
