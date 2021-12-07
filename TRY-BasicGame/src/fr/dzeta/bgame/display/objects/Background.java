package fr.dzeta.bgame.display.objects;

import java.awt.Color;
import java.awt.Graphics;

import fr.dzeta.bgame.display.Displayable;
import fr.dzeta.bgame.display.handler.GUIHandler;
import fr.dzeta.bgame.utils.Points;

public class Background implements Displayable{
	
	private Points origin;
	
	public Background() {
		this.origin = new Points(100, 250, 0);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(new Color(0xff8d03));
		int[] xP1 = {0
				, this.origin.getX()};
		int[] yP1 = {GUIHandler.FRAME_HEIGHT
				, }; 
		
		//g.fillPolygon(xP1, yP1, xP1.length);
	}
}
