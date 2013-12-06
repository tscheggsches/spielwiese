package test;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Input_Output_GUI {

	void text_Namen ()
	{
		/**
		 * Input mit Exception handling
		 * Kommentar als Java-Doc-Format: Eclipse --> Project --> Generate JavaDoc
		 */
		Scanner user_input = new Scanner (System.in);

		float alter = 0;
		while (alter == 0)
		{
			try { // monitor a block of code
				System.out.print ("Bitte Alter eingeben: ");
				alter = user_input.nextFloat();	 // erwartet einen float als Input...	
				System.out.println ("Dein Alter ist "+ alter); 
			} catch (InputMismatchException e) 
			{ // catch 
				System.out.println("Kein Alter eingegeben, bitte nochmals versuchen ;)");
				user_input.nextLine(); // diesen Input konsumieren, war ja eine Exception...
			}
		}
	}

	void GUI_Namen () // Methodenname
	{
		/**
		 * Input/Output mit JOptionPane
		 */
		String firstName;

		firstName = JOptionPane.showInputDialog("Bitte Vornamen eingeben","z.B. René");// Dialogboxen
		if (firstName.isEmpty())
		{
			JOptionPane.showMessageDialog(null,"Du hast keinen Namen???","User too stupid",JOptionPane.ERROR_MESSAGE);
		}
		else JOptionPane.showMessageDialog(null, "Dein Name ist: " + firstName);
	}
}
