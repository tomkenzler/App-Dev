package projectcolour.util.arc;

import java.awt.Color;
import java.util.Random;
import java.util.ArrayList;
import projectcolour.entities.EntityColour;

/**
 * @author Tom
 */

public final class UtilColour {

	private static final ArrayList<EntityColour> colours = new ArrayList<>();

	private UtilColour(){
	}

	public static void init(){

		colours.add(new EntityColour("Red", Color.decode("#F44336")));
		colours.add(new EntityColour("Pink", Color.decode("#E91E63")));
		colours.add(new EntityColour("Purple", Color.decode("#9C27B0")));
		colours.add(new EntityColour("Deep Purple", Color.decode("#673AB7")));
		colours.add(new EntityColour("Indigo", Color.decode("#3F51B5")));
		colours.add(new EntityColour("Blue", Color.decode("#2196F3")));
		colours.add(new EntityColour("Light Blue", Color.decode("#03A9F4")));
		colours.add(new EntityColour("Cyan", Color.decode("#00BCD4")));
		colours.add(new EntityColour("Teal", Color.decode("#009688")));
		colours.add(new EntityColour("Green", Color.decode("#4CAF50")));
		colours.add(new EntityColour("Light Green", Color.decode("#8BC34A")));
		colours.add(new EntityColour("Lime", Color.decode("#CDDC39")));
		colours.add(new EntityColour("Yellow", Color.decode("#FFEB3B")));
		colours.add(new EntityColour("Amber", Color.decode("#FFC107")));
		colours.add(new EntityColour("Orange", Color.decode("#FF9800")));
		colours.add(new EntityColour("Deep Orange", Color.decode("#FF5722")));
		colours.add(new EntityColour("Brown", Color.decode("#795548")));
		colours.add(new EntityColour("Grey", Color.decode("#9E9E9E")));
		colours.add(new EntityColour("Blue Grey", Color.decode("#607D8B")));
		colours.add(new EntityColour("White", Color.decode("#FFFFFF")));

	}

	public static Color getRandomColour(){
		return colours.get(new Random().nextInt(colours.size())).getColour();
	}
}