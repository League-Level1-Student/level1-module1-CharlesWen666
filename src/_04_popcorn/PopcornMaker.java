package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
		Popcorn Alvin = new Popcorn(JOptionPane.showInputDialog("Enter a Flavor"));
		Microwave Alvin2 = new Microwave();
		Alvin2.putInMicrowave(Alvin);
		Alvin2.setTime(Integer.parseInt(JOptionPane.showInputDialog("Set time")));
		Alvin2.startMicrowave();
		
		
}
}
