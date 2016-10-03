package projectcolour.controllers;

import java.util.Random;
import projectcolour.util.player.*;
import projectcolour.entities.EntityArc;
import projectcolour.util.arc.UtilColour;
import projectcolour.util.display.UtilScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import projectcolour.util.display.UtilContentPane;
import static projectcolour.util.global_properties.UtilGlobalProperties.*;

/**
 * @author Tom
 */

public final class ArcController {

	private static boolean reset = false;
	private static boolean isClockwise = false;
	private static CopyOnWriteArrayList<EntityArc> arcs = new CopyOnWriteArrayList<>();

	private ArcController() {
	}

	public static CopyOnWriteArrayList<EntityArc> getArcs(){
		return arcs;
	}

	public static void generateArc(){

		float rotationSpeed = new Random().nextFloat() * (ARC_SPAWN_MAX_ROTATION_SPEED + ARC_SPAWN_MIN_ROTATION_SPEED) + ARC_SPAWN_MIN_ROTATION_SPEED;

		arcs.add(new EntityArc(
				generateSize(),																														//	X
				generateSize(),																														//	Y
				(isClockwise == true ? rotationSpeed : -rotationSpeed),																				//	Rotation
				(isClockwise == true ? rotationSpeed : -rotationSpeed),																				//	Rotation Speed
				isClockwise,																														//	Is Clockwise
				generateSize(),																														//	Width
				generateSize(),																														//	Height
				ARC_SPAWN_START_ANGLE,																												//	Start Angle
				new Random().nextInt((ARC_SPAWN_MAX_END_ANGLE - ARC_SPAWN_MIN_END_ANGLE) + 1) + ARC_SPAWN_MIN_END_ANGLE,							//	End Angle
				UtilColour.getRandomColour(),																										//	Colour
				ARC_SPAWN_OPACITY,																													//	Opacity
				(new Random().nextInt((ARC_SPAWN_MAX_STROKE_WIDTH - ARC_SPAWN_MIN_STROKE_WIDTH) + 1) + ARC_SPAWN_MIN_STROKE_WIDTH) + (ARC_WAVE_DIFFICULTLY * ARC_SPAWN_MULTI_STROKE_WIDTH)	//	Stroke Size
		));

		isClockwise = (isClockwise != true);

	}

	private static int generateSize(){
		return (int) ((UtilScreen.getWidth() > UtilScreen.getHeight() ? UtilScreen.getWidth() : UtilScreen.getHeight()) * ARC_SPAWN_SIZE);
	}

	public static void updateArcs(){

		/* If there are no arcs, reset the player and lock the controls */
		if(arcs.isEmpty()){
			UtilPlayer.resetXY();
			UtilPlayerMovement.setEnabled(false);
		}

		/* If there is arcs, let's update them */
		for(EntityArc arc : arcs){

			arc.setX(arc.getX() - ARC_SCALE_SPEED);
			arc.setY(arc.getY() - ARC_SCALE_SPEED);
			arc.setWidth(arc.getWidth() - ARC_SCALE_SPEED);
			arc.setHeight(arc.getHeight() - ARC_SCALE_SPEED);
			arc.setRotation(arc.getRotation() + arc.getRotationSpeed());
			if(arc.isRotationClockwise() == true)
				arc.setRotationSpeed(arc.getRotationSpeed() + (ARC_INCREASE_ROTATION_SPEED * ARC_WAVE_DIFFICULTLY));
			else
				arc.setRotationSpeed(arc.getRotationSpeed() -  (ARC_INCREASE_ROTATION_SPEED * ARC_WAVE_DIFFICULTLY));

			if(arc.getX() > ARC_FADE_POSITION && arc.getY() > ARC_FADE_POSITION && arc.getWidth() > ARC_FADE_POSITION && arc.getHeight() > ARC_FADE_POSITION && arc.getOpacity() < 255)
				arc.setOpacity(arc.getOpacity() + ARC_INCREASE_OPACITY_SPEED);
			else if(arc.getX() < ARC_FADE_POSITION && arc.getY() < ARC_FADE_POSITION && arc.getWidth() < ARC_FADE_POSITION && arc.getHeight() < ARC_FADE_POSITION && arc.getOpacity() > 0)
				arc.setOpacity(arc.getOpacity() - ARC_DESCREASE_OPACITY_SPEED);

			if(arc.getX() < ARC_REMOVE_POSITION && arc.getY() < ARC_REMOVE_POSITION && arc.getWidth() < ARC_REMOVE_POSITION && arc.getHeight() < ARC_REMOVE_POSITION)
				arcs.remove(arc);

		}

		/* Let's check if the player has exceeded the last arc */
		if(!arcs.isEmpty())
			if	(	(UtilPlayer.getX() < ((UtilContentPane.getWidth() / 2) - (getLastArc().getX() / 2) - (getLastArc().getStrokeWidth()))) ||
					(UtilPlayer.getX() > ((UtilContentPane.getWidth() / 2) + (getLastArc().getX() / 2) + (getLastArc().getStrokeWidth())))
				)
			arcs.clear();

	}

	public static EntityArc getLastArc(){
		return arcs.get(arcs.size() - 1);
	}

	public static int getRemainingArcs(){
		return arcs.size();
	}

	public static boolean getReset(){
		return reset;
	}

	public static void setReset(boolean Reset){
		reset = Reset;
	}

	public static void reset(){
		arcs.clear();
		reset = true;
	}
}