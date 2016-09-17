package projectcolour.util;

import java.util.Random;
import java.awt.BasicStroke;
import projectcolour.entities.EntityArc;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Tom
 */

public final class UtilArcManager {

	private static CopyOnWriteArrayList<EntityArc> arcs = new CopyOnWriteArrayList<>();

	private UtilArcManager() {
	}

	public static CopyOnWriteArrayList<EntityArc> getArcs(){
		return arcs;
	}

	public static void generateArc(){

		boolean isClockwise = new Random().nextBoolean();
		float rotationSpeed = new Random().nextFloat() * (0.25f + 0.01f) + 0.01f;

		arcs.add(new EntityArc(
				generateSize(),												//	X
				generateSize(),												//	Y
				(isClockwise == true ? rotationSpeed : -rotationSpeed),		//	Rotation
				(isClockwise == true ? rotationSpeed : -rotationSpeed),		//	Rotation Speed
				isClockwise,												//	Is Clockwise
				generateSize(),												//	Width
				generateSize(),												//	Height
				0,															//	Start Angle
				new Random().nextInt((300 - 150) + 1) + 150,				//	End Angle
				UtilColourManager.getRandomColour(),						//	Colour
				255,
				new BasicStroke((new Random().nextInt((10 - 1) + 1) + 1))	//	Stroke Size
		));
	}

	private static float generateSize(){
		return (float) ((UtilScreen.getWidth() > UtilScreen.getHeight() ? UtilScreen.getWidth() : UtilScreen.getHeight()) * 1.5);
	}

	public static void updateArcs(){

		for(EntityArc arc : arcs){

			arc.setX(arc.getX() - 1);
			arc.setY(arc.getY() - 1);
			arc.setWidth(arc.getWidth() - 1);
			arc.setHeight(arc.getHeight() - 1);
			arc.setRotation(arc.getRotation() + arc.getRotationSpeed());
			if(arc.isRotationClockwise() == true)
				arc.setRotationSpeed(arc.getRotationSpeed() + 0.0005f);
			else
				arc.setRotationSpeed(arc.getRotationSpeed() - 0.0005f);

			if(arc.getX() < 255 && arc.getY() < 255 && arc.getWidth() < 255 && arc.getHeight() < 255)
				arc.setOpacity(arc.getOpacity() - 1);

			if(arc.getX() < 0 && arc.getY() < 0 && arc.getWidth() < 0 && arc.getHeight() < 0)
				arcs.remove(arc);

		}
	}
}