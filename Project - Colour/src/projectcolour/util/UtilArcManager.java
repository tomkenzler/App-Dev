package projectcolour.util;

import java.awt.Color;
import java.util.Random;
import java.util.ArrayList;
import java.awt.BasicStroke;
import projectcolour.entities.EntityArc;

/**
 * @author Tom
 */

public final class UtilArcManager {

	private static ArrayList<EntityArc> arcs = new ArrayList<>();
	private static final ArrayList<Color> colours = new ArrayList<>();

	private UtilArcManager() {
	}

	public static void init(){

		colours.add(Color.BLUE);
		colours.add(Color.CYAN);
		colours.add(Color.GREEN);
		colours.add(Color.LIGHT_GRAY);
		colours.add(Color.MAGENTA);
		colours.add(Color.ORANGE);
		colours.add(Color.PINK);
		colours.add(Color.RED);
		colours.add(Color.WHITE);
		colours.add(Color.YELLOW);

		for(int i = 1; i <= (new Random().nextInt((21 - 15) + 1) + 15); i++)
			arcs.add(new EntityArc(i * 100, i * 100, i * 100, i * 100, (new Random().nextInt((335 - 25) + 1) + 25), (new Random().nextInt((335 - 25) + 1) + 25), colours.get(new Random().nextInt(colours.size())), new BasicStroke((new Random().nextInt((15 - 1) + 1) + 1))));
	}

	public static ArrayList<EntityArc> getArcs(){
		return arcs;
	}

	public static EntityArc getArc(int Index){
		return arcs.get(Index);
	}

	public static void setArc(EntityArc Arc){
		arcs.add(Arc);
	}
}