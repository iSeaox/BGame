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
		this.x = 250;
		this.y = 250;
		this.z = 100;
	}
	
	@Override
	public void display(Graphics g) {
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x, y, this.width, this.height);
		
		final int[] xPointsRight = {x + width
				, (int) (x + width+ Math.cos(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))
				, (int) (x + width+ Math.cos(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))
				, x + width};
		final int[] yPointsRight = {y
				, (int) (y - Math.sin(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))
				, (int) (y + height - Math.sin(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))
				, y + height};
		
		g.setColor(new Color(0x2A2A2A));
		g.fillPolygon(xPointsRight, yPointsRight, xPointsRight.length);
		
		final int[] xPointsUp = {x
				, x + width
				, (int) (x + width + Math.cos(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))
				, (int) (x + Math.cos(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))};
		final int[] yPointsUp = {y
				, y
				, (int) (y - Math.sin(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))
				, (int) (y - Math.sin(PERSPECTIVE_ANGLE) * (depth * PERSPECTIVE_COEF))};
		
		g.setColor(new Color(0x5A5A5A));
		g.fillPolygon(xPointsUp, yPointsUp, xPointsUp.length);
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
