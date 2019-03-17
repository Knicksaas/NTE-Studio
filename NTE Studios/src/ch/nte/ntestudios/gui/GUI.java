package ch.nte.ntestudios.gui;

import javax.swing.JFrame;

import ch.nte.ntestudios.variables.ApperianceVars;

public class GUI {
	
	private static JFrame frame;
	
	public static void createGUIFrame() {
		
		frame = new JFrame(ApperianceVars.name);
	}
	
}
