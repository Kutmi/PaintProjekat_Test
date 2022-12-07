package geometry;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Moveable, Comparable {
	
	private boolean selected;
	private Color color;
	public Shape () {
		
	} //Moramo imati definisan prazan konstruktor (ako imamo neki drugi definisan V)
	
	public Shape(Color color) {
		this.setColor(color);
	}

	public Shape(Color color, boolean selected) {
		this(color);
		this.selected = selected;
	}
	
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract boolean contains (int x , int y);
	
	public abstract void draw (Graphics g); //mora se importovati java.awt.Graphics
	
	
}
