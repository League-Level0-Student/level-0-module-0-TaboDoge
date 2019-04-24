package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) throws Exception {
		String stuff = JOptionPane.showInputDialog("What do you like?");
		JOptionPane.showMessageDialog(null, stuff+ " is awsome");
	}
}
