package lesson8GraphicalUserInterfaces;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableSwing {
	
	JFrame f;
	JTable t;
	
	JTableSwing() {// Constructor
		f = new JFrame(); // initialises frame
		f.setTitle("Example of JTable");
		
		String[][] info = { 
				{"Jawad Mahmud", "1", "Computer science"},
				{"Somebody", "2", "Maths"} // data for the table
		};
		
		String[] nameOfColumn = {"Name", "Student Number", "Subject"}; // Column names
		
		t = new JTable(info, nameOfColumn); // initialises JTable
		t.setBounds(35, 45, 200, 300);
	
		JScrollPane sp = new JScrollPane(t);// adds to JScrollPane 
		f.add(sp);
		f.setSize(550, 250);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new JTableSwing();

	}
}
