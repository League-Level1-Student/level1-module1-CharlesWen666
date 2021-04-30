package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton a = new JButton();
	JTextField answer = new JTextField(20);
	JLabel label = new JLabel();
public void setup(){
	

	frame.setTitle("Convert 8 bits of binary to ASCII");	
	frame.add(panel);
	panel.add(answer);
	panel.add(a);
	
	frame.pack();
	a.setSize(100,60);
	frame.setSize(600,400);
	a.setText("Convert");
	panel.setVisible(true);
	frame.setVisible(true);
	frame.pack();
	
	a.addActionListener(this);
	
	}

String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	 String b = answer.getText();
	String c = convert(b);
	label.setText(c);
	panel.add(label);
	frame.pack();
}


}
