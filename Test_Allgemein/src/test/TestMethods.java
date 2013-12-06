package test;

import java.util.Scanner;

public class TestMethods { // gleicher Namen wie .java-File!

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Input_Output_GUI myIO_GUI = new Input_Output_GUI(); 
		//myIO_GUI.GUI_Namen();								// JOptionPane In/Out
		//myIO_GUI.text_Namen(); 						    // Text In-/Out mit Exceptions

		Divers myDivers = new Divers();						// HexAusgabe
		myDivers.Types();
		
		// TODO
		// Generate JavaDoc
		
		System.exit(0); 									// aufräumen, beendet VM...
	}
}
