package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) throws Exception {
		String input = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, input+" is amazing");
	}
	
}
