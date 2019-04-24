package strings_and_dialogs;

import javax.swing.JOptionPane;

public class IKNOW {
	public static void main(String[] args) throws Exception {
		String input = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "I know that you walked last summer, "+input+".");
 
	}
}
