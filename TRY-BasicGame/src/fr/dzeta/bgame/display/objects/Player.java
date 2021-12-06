package fr.dzeta.bgame.display.objects;

import java.awt.Color;
import java.awt.Graphics;

import fr.dzeta.bgame.display.Displayable;

public class Player implements Displayable{
	
	private int x;
	private int y;
	private int z;
	
	private int width = 50;
	private int height = 50;
	private int depth = 50;
	
	public Player() {
		this.x = 200;
		this.y = 200;
		this.z = 200;
	}
	
	@Override
	public void display(Graphics g) {
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x, y, this.width, this.height);
		
//		int[] xPoints = {x + width
//				, (int) (x + Math.cos(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))
//				, (int) (x + Math.cos(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))
//				, x + width};
//		int[] yPoints = {y
//				, (int) (y + Math.sin(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))
//				, (int) (y + Math.sin(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF)) + height
//				, y + height};
		int[] xPoints = {x + width
				, (int) (x + width+ Math.cos(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))
				, (int) (x + width+ Math.cos(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))
				, x + width};
		int[] yPoints = {y
				, (int) (y - height+ Math.sin(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))
				, (int) (y - height+ Math.sin(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF)) + height
				, y + height};
		
		g.setColor(Color.BLACK);
		g.fillPolygon(xPoints, yPoints, 4);
		
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}
