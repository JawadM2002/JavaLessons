package lesson8GraphicalUserInterfaces;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JavaSwingTextArea extends JFrame implements ActionListener{
	
	static JFrame f;
	static JButton a;
	static JLabel l;
	static JTextArea ta; // test area
	
	JavaSwingTextArea(){} // Constructor

	public static void main(String[] args) {
		f = new JFrame("Text Field");
		l = new JLabel("Null text");
		a = new JButton("Enter");
		JavaSwingTextArea tex = new JavaSwingTextArea();
		a.addActionListener(tex);
		
		ta = new JTextArea(12, 12);
		JPanel jp = new JPanel();
		
		jp.add(ta); // adds text area and button to panel
		jp.add(a);
		jp.add(l);
		
		f.add(jp); //sets size of frame
		f.setSize(300, 400);
		
		f.show();
		
	}
		
	public void actionPerformed(ActionEvent e) { // if button is pressed
		String s = e.getActionCommand();
		if (s.equals("Enter")) {
			l.setText(ta.getText()); // sets label text to text of the field
			}
		}
	}


