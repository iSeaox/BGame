package fr.dzeta.bgame.display.handler;

import javax.swing.JLabel;

import fr.dzeta.bgame.display.Frame;
import fr.dzeta.bgame.display.Panel;

public class GUIHandler {
	
	public static final int FRAME_WIDTH = 854;
	public static final int FRAME_HEIGHT = 480;
	
	private static Frame frame;
	private static Panel panel;
	
	public static void init() {
		GUIHandler.frame = new Frame();
		GUIHandler.panel = new Panel();
		frame.setContentPane(GUIHandler.panel);
		
		final JLabel temp = new JLabel("TEST-LABEL");
		temp.setBounds(10, 0, 100, 30);
		GUIHandler.panel.add(temp);
		
		GUIHandler.frame.setVisible(true);
	}
}
