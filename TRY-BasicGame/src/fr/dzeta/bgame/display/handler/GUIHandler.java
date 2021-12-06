package fr.dzeta.bgame.display.handler;

import javax.swing.JLabel;

import fr.dzeta.bgame.display.Frame;
import fr.dzeta.bgame.display.Panel;
import fr.dzeta.bgame.display.objects.Player;
import fr.dzeta.bgame.listener.KeyHandler;
import fr.dzeta.bgame.main.Main;
import fr.dzeta.bgame.time.TimeUtils;

public class GUIHandler {
	
	public static final int FRAME_WIDTH = 854;
	public static final int FRAME_HEIGHT = 480;
	
	private static Frame frame;
	private static Panel panel;
	private static JLabel timer;
	
	private static Player player;
	
	public static void refresh() {
		GUIHandler.timer.setText("Openning: "+Main.info.getOpenning()+"  timer: "
				+TimeUtils.parseSecond(Main.info.getCount()));
		GUIHandler.frame.repaint();
	}
	
	public static void init() {
		GUIHandler.frame = new Frame();
		GUIHandler.panel = new Panel();
		frame.setContentPane(GUIHandler.panel);
		frame.addKeyListener(new KeyHandler());
		
		player = new Player();
		
		timer = new JLabel("Openning: "+Main.info.getOpenning()+"  timer: "
				+TimeUtils.parseSecond(Main.info.getCount()));
		timer.setBounds(10, 0, (timer.getText().length()) * 10, 30);
		GUIHandler.panel.add(timer);
		
		GUIHandler.frame.setVisible(true);
	}

	public static Player getPlayer() {
		return player;
	}
}
