package projectcolour.entities;

import java.awt.Color;

/**
 * @author Tom
 */

public class EntityColour {

	private String description;
	private Color colour;

	public EntityColour(String Description, Color Colour){
		description = Description;
		colour = Colour;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String Description){
		description = Description;
	}

	public Color getColour(){
		return colour;
	}

	public void setColour(Color Colour){
		colour = Colour;
	}
}