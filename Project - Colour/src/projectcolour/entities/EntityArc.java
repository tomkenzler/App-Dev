package projectcolour.entities;

import java.awt.Color;
import java.awt.Stroke;

/**
 * @author Tom
 */

public class EntityArc {

	private float x;
	private float y;
	private float rotation;
	private float rotationSpeed;
	private boolean rotationClockwise;
	private float width;
	private float height;
	private float startAngle;
	private float endAngle;
	private Color colour;
	private Stroke stroke;
	private int opacity;

	public EntityArc(float X, float Y, float Rotation, float RotationSpeed, boolean RotationClockwise, float Width, float Height, float StartAngle, float EndAngle, Color Colour, int Opacity, Stroke Stroke){
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
		stroke = Stroke;
	}

	public float getX(){
		return x;
	}

	public void setX(float X){
		x = X;
	}

	public float getY(){
		return y;
	}

	public void setY(float Y){
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

	public float getWidth(){
		return width;
	}

	public void setWidth(float Width){
		width = Width;
	}

	public float getHeight(){
		return height;
	}

	public void setHeight(float Height){
		height = Height;
	}

	public float getStartAngle(){
		return startAngle;
	}

	public void setStartAngle(float StartAngle){
		startAngle = StartAngle;
	}

	public float getEndAngle(){
		return endAngle;
	}

	public void setEndAngle(float EndAngle){
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

	public Stroke getStroke(){
		return stroke;
	}

	public void setStroke(Stroke Stroke){
		stroke = Stroke;
	}
}