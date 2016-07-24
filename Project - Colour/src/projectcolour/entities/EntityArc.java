package projectcolour.entities;

import java.awt.Color;
import java.awt.Stroke;

/**
 * @author Tom
 */

public class EntityArc {

	private double x;
	private double y;
	private double width;
	private double height;
	private double startAngle;
	private double endAngle;
	private Color colour;
	private Stroke stroke;

	public EntityArc(double X, double Y, double Width, double Height, double StartAngle, double EndAngle, Color Colour, Stroke Stroke){
		x = X;
		y = Y;
		width = Width;
		height = Height;
		startAngle = StartAngle;
		endAngle = EndAngle;
		colour = Colour;
		stroke = Stroke;
	}

	public double getX(){
		return x;
	}

	public void setX(double X){
		x = X;
	}

	public double getY(){
		return y;
	}

	public void setY(double Y){
		y = Y;
	}

	public double getWidth(){
		return width;
	}

	public void setWidth(double Width){
		width = Width;
	}

	public double getHeight(){
		return height;
	}

	public void setHeight(double Height){
		height = Height;
	}

	public double getStartAngle(){
		return startAngle;
	}

	public void setStartAngle(double StartAngle){
		startAngle = StartAngle;
	}

	public double getEndAngle(){
		return endAngle;
	}

	public void setEndAngle(double EndAngle){
		endAngle = EndAngle;
	}

	public Color getColour(){
		return colour;
	}

	public void setColour(Color Colour){
		colour = Colour;
	}

	public Stroke getStroke(){
		return stroke;
	}

	public void setStroke(Stroke Stroke){
		stroke = Stroke;
	}
}