package projectcolour.entities;

import java.awt.Color;

/**
 * @author Tom
 */

public class EntityPlayer {

	private int x;
	private int y;
	private int width;
	private int height;
	private Color colour;

	public EntityPlayer(int X, int Y, int Width, int Height, Color Colour){
		x = X;
		y = Y;
		width = Width;
		height = Height;
		colour = Colour;
	}

	public int getX(){
		return x;
	}

	public void setX(int X){
		x = X;
	}

	public int getY(){
		return y;
	}

	public void setY(int Y){
		y = Y;
	}

	public int getWidth(){
		return width;
	}

	public void setWidth(int Width){
		width = Width;
	}

	public int getHeight(){
		return height;
	}

	public void setHeight(int Height){
		height = Height;
	}

	public Color getColour(){
		return colour;
	}

	public void setColour(Color Colour){
		colour = Colour;
	}
}