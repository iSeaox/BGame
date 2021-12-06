package fr.dzeta.bgame.display;

import java.awt.Graphics;

public interface Displayable {
	
	public double PERSPECTIVE_ANGLE = 60 * Math.PI / 180;
	public double PERSPECTIVE_COEF = 0.5D;
	
	public void display(Graphics g);
}
