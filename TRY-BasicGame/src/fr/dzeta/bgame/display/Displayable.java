package fr.dzeta.bgame.display;

import java.awt.Graphics;

public interface Displayable {
	
	public double PERSPECTIVE_ANGLE = 70 * Math.PI / 180;
	public double PERSPECTIVE_COEF = 0.55D;
	
	public void display(Graphics g);
}
