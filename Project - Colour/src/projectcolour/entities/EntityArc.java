package projectcolour.entities;

import java.awt.Color;
import java.awt.Stroke;
import java.awt.BasicStroke;

/**
 * @author Tom
 */

public class EntityArc {

	private int x;
	private int y;
	private float rotation;
	private float rotationSpeed;
	private boolean rotationClockwise;
	private int width;
	private int height;
	private int startAngle;
	private int endAngle;
	private Color colour;
	private int strokeWidth;
	private Stroke stroke;
	private int opacity;

	public EntityArc(int X, int Y, float Rotation, float RotationSpeed, boolean RotationClockwise, int Width, int Height, int StartAngle, int EndAngle, Color Colour, int Opacity, int StrokeWidth){
		x = X;
		y = Y;
		rotation = Rotation;
		rotationSpeed = RotationSpeed;
		rotationClockwise = RotationClockwise;
		width = Width;
		height = Height;
		startAngle = StartAngle;
		endAngle = EndAngle;
		colour = Colour;
		opacity = Opacity;
		stroke = new BasicStroke(StrokeWidth);
		strokeWidth = StrokeWidth;
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

	public float getRotation(){
		return rotation;
	}

	public void setRotation(float Rotation){
		rotation = Rotation;
	}

	public float getRotationSpeed(){
		return rotationSpeed;
	}

	public void setRotationSpeed(float RotationSpeed){
		rotationSpeed = RotationSpeed;
	}

	public boolean isRotationClockwise(){
		return rotationClockwise;
	}

	public void setRotationClockwise(boolean RotationClockwise){
		rotationClockwise = RotationClockwise;
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

	public int getStartAngle(){
		return startAngle;
	}

	public void setStartAngle(int StartAngle){
		startAngle = StartAngle;
	}

	public int getEndAngle(){
		return endAngle;
	}

	public void setEndAngle(int EndAngle){
		endAngle = EndAngle;
	}

	public Color getColour(){
		return colour;
	}

	public void setColour(Color Colour){
		colour = Colour;
	}

	public int getOpacity(){
		return opacity;
	}

	public void setOpacity(int Opacity){
		opacity = Opacity;
	}

	public int getStrokeWidth(){
		return strokeWidth;
	}

	public void setStrokeWidth(int StrokeWidth){
		strokeWidth = StrokeWidth;
	}

	public Stroke getStroke(){
		return stroke;
	}

	public void setStroke(Stroke Stroke){
		stroke = Stroke;
	}
}