package lesson8GraphicalUserInterfaces;

import javax.swing.JButton;
import javax.swing.JFrame; // required imported classes

// Swing import class - GUI used to create various applications, enables the user to create buttons and scroll bars.
// AWT, or Abstract Window Toolkit - Platform-dependent API to develop GUI or window based applications

public class FramesWithSwingsInJava {
	JFrame frame; 
	
	FramesWithSwingsInJava() {
		
		frame = new JFrame("This is GUI");
		// we can also use setTitle("Title Name"); , which will make no difference
		
		// Creates instance of JButton
		JButton button = new JButton("Welcome");
		
		// x axis, y axis, width, height
		button.setBounds(200, 150, 100, 50);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// adds button on frame
		frame.add(button);
		
		// sets the frame size
		frame.setSize(500, 500);
		
		// no layout managers
		frame.setLayout(null);
		
		// makes frame visible
		frame.setVisible(true);
		
		/* for inheritance, a JFrame class can be inherited to create JFrame window, therefore, it is not required 
		 * to create an instance of JFrame class 
		 */
		
	}
	public static void main(String[] args) {
		new FramesWithSwingsInJava();
	}
}
