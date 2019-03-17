package ch.nte.ntestudios.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import ch.nte.ntestudios.variables.ApperianceVars;

public class GUI {
	
	private static JFrame frame;
	private static JToolBar toolBar;
	private static JPanel toolBarPanel;
	private static JButton testButton;
	
	public void createGUIFrame() {
		frame = new JFrame(ApperianceVars.name);
		frame.setSize(ApperianceVars.basicWidth, ApperianceVars.basicHeight);
		
		frame.setLayout(new BorderLayout());
		frame.getContentPane().setBackground(ApperianceVars.backgroundColor);
		
		frame.setVisible(true);
	}
	
	public void createToolBar() {
		toolBar = new JToolBar();
		toolBarPanel = new JPanel();
		testButton = new JButton("Test");
		toolBarPanel.add(testButton);
		toolBar.add(toolBarPanel);
		frame.add(toolBar, BorderLayout.NORTH);
	}
}
