package strings_and_dialogs;

import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) throws Exception {
		String birthday = JOptionPane.showInputDialog("What is your birthday?(mm/dd)");
		if  (birthday.equals("4/23"))
		{
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
		}
		
	}
}
