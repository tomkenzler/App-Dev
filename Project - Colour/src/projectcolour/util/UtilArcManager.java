package projectcolour.util;

import java.awt.Color;
import java.util.Random;
import java.util.ArrayList;
import java.awt.BasicStroke;
import java.util.concurrent.CopyOnWriteArrayList;
import projectcolour.entities.EntityArc;

/**
 * @author Tom
 */

public final class UtilArcManager {

	private static CopyOnWriteArrayList<EntityArc> arcs = new CopyOnWriteArrayList<>();
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

	}

	public static CopyOnWriteArrayList<EntityArc> getArcs(){
		return arcs;
	}

	public static void generateArc(){

		boolean isClockwise = new Random().nextBoolean();
		float rotationSpeed = new Random().nextFloat() * (0.25f + 0.01f) + 0.01f;

		arcs.add(new EntityArc(
				2500,
				2500,
				(isClockwise == true ? rotationSpeed : -rotationSpeed),
				rotationSpeed,
				isClockwise,
				2500,
				2500,
				new Random().nextInt((335 - 1) + 1) + 1,
				new Random().nextInt((335 - 150) + 1) + 150,
				colours.get(new Random().nextInt(colours.size())),
				new BasicStroke((new Random().nextInt((15 - 1) + 1) + 1))));

	}

	public static void updateArcs(){

		for(EntityArc arc : arcs){
			arc.setX(arc.getX() - 1);
			arc.setY(arc.getY() - 1);
			arc.setWidth(arc.getWidth() - 1);
			arc.setHeight(arc.getHeight() - 1);
			//arc.setRotation(arc.getRotation() + arc.getRotationSpeed());
			arc.setRotation(arc.getRotation() + arc.getRotationSpeed());
			if(arc.isRotationClockwise() == true)
				arc.setRotationSpeed(arc.getRotationSpeed() + 0.001f);
			else
				arc.setRotationSpeed(arc.getRotationSpeed() - 0.001f);
			
			if(arc.getX() < 0 && arc.getY() < 0 && arc.getWidth() < 0 && arc.getHeight() < 0)
				arcs.remove(arc);
		
		}
	}
}