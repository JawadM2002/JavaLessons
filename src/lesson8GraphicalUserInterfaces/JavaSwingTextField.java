package lesson8GraphicalUserInterfaces;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


class JavaSwingTextField extends JFrame implements ActionListener {
    // JTextField
    static JTextField a;
 
    // JFrame
    static JFrame c;
 
    // JButton
    static JButton b;
 
    // label to display text
    static JLabel l;
 
    // This is the default constructor for the text field
    JavaSwingTextField()
    {
    }
 
    public static void main(String[] args)
    {
        // the frame stores the text field and button
        c = new JFrame("textfield");
 
        // This will create a label to display text
        l = new JLabel("nothing entered");
 
        // create a new button
        b = new JButton("Enter");
 
        // creates the object of text class
        JavaSwingTextField te = new JavaSwingTextField();
 
        // addActionListener to button
        b.addActionListener(te);
 
        // create a object of JTextField with 18 columns
        a = new JTextField(18);
 
        // create an object of font type
        Font fo = new Font("Sans Serif", Font.BOLD, 20);
 
        // it will set the font of the textfield
        a.setFont(fo);
 
        // this creates a panel to add the buttons and textfield
        JPanel p = new JPanel();
 
        // add buttons and textfield to the panel
        p.add(a);
        p.add(b);
        p.add(l);
 
        // This will add the panel to the frame
        c.add(p);
 
        // size of frame
        c.setSize(300, 300);
 
        c.show();
    }
 
    
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("Enter")) {
            // this will set the text of the label to the text of the field
            l.setText(a.getText());
 
            // set the text of field to blank
            a.setText("  ");
        }
    }
}
