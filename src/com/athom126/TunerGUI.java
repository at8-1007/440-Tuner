package com.athom126;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/**
 * This application allows the user to tune their instrument. 
 * 
 * @author Ashley Thomas (at8-1007)
 *
 */
public class TunerGUI {
	
	static JFrame window = new JFrame("440 Tuner"); // Create named window
	static JPanel panel = new JPanel(); // Create panel to hold content
	
	/**
	 * Calls the method createGUI() upon execution
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		createGUI(); 
	}
	
	/**
	 * Creates the GUI
	 */
	public static void createGUI() {
		window.setSize(500, 600); // Set window size
		window.setResizable(false); // Enforce fixed size for GUI
		addContent(); // Add window contents
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	
		window.setVisible(true); // Display window
		
	}
	
	/**
	 * Creates and adds content to GUI
	 */
	public static void addContent() {
		panel.setPreferredSize(new Dimension(500, 600)); // Set panel size
		panel.setLayout(new GridBagLayout());
//		GridBagConstraints gbc = new GridBagConstraints();
		panel.setBackground(Color.BLACK); // Set panel color
		JLabel title = new JLabel("Click anywhere to start tuning..."); // Create label
		title.setFont(new Font("Verdana", Font.PLAIN, 14)); // Style the label
		title.setForeground(Color.WHITE); // Set text color
		panel.add(title); // Add text to panel
		window.add(panel); // Add content panel to window
		
		// Add event listener for panel 
		panel.addMouseListener(new MouseAdapter() {
			// Listens for mouse clicks
			public void mouseClicked(MouseEvent me) {
				panel.remove(title); // Remove label upon click
				panel.repaint(); // Update panel
			}
		});
	}	
}
