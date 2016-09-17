package projectcolour.util;

import java.awt.Color;
import java.util.Random;
import java.util.ArrayList;
import projectcolour.entities.EntityColour;

/**
 * @author Tom
 */

public final class UtilColourManager {

	private static final ArrayList<EntityColour> colours = new ArrayList<>();

	private UtilColourManager(){
	}

	public static void init(){

		colours.add(new EntityColour("BLUE", Color.BLUE));
		colours.add(new EntityColour("CYAN", Color.CYAN));
		colours.add(new EntityColour("GREEN", Color.GREEN));
		colours.add(new EntityColour("LIGHT_GRAY", Color.LIGHT_GRAY));
		colours.add(new EntityColour("MAGENTA", Color.MAGENTA));
		colours.add(new EntityColour("ORANGE", Color.ORANGE));
		colours.add(new EntityColour("PINK", Color.PINK));
		colours.add(new EntityColour("RED", Color.RED));
		colours.add(new EntityColour("WHITE", Color.WHITE));
		colours.add(new EntityColour("YELLOW", Color.YELLOW));

	}

	public static Color getRandomColour(){
		return colours.get(new Random().nextInt(colours.size())).getColour();
	}
}