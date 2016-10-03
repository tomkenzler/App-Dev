package projectcolour.controllers;

import java.util.ArrayList;
import projectcolour.entities.EntityDebug;
import projectcolour.util.global_properties.UtilGlobalProperties;
import projectcolour.util.player.UtilPlayer;
import projectcolour.util.player.UtilPlayerMovement;

/**
 * @author Tom
 */

public final class DebugController {

	private static ArrayList<EntityDebug> debug = new ArrayList<>();
	private static ArrayList<EntityDebug> console = new ArrayList<>();

	private DebugController(){
	}

	public static void refresh(){

		debug.clear();
		debug.add(new EntityDebug("Debug:", ""));
		debug.add(new EntityDebug("FPS:", String.valueOf(FPSController.getFPS())));
		debug.add(new EntityDebug("", ""));

		debug.add(new EntityDebug("Wave:", ""));
		debug.add(new EntityDebug("Wave:", String.valueOf(UtilGlobalProperties.ARC_WAVE_DIFFICULTLY)));
		debug.add(new EntityDebug("Remaining in Wave:", String.valueOf(ArcController.getRemainingArcs())));
		debug.add(new EntityDebug("", ""));

		debug.add(new EntityDebug("Player:", ""));
		debug.add(new EntityDebug("X:", String.valueOf(UtilPlayer.getX())));
		debug.add(new EntityDebug("Y:", String.valueOf(UtilPlayer.getY())));
		debug.add(new EntityDebug("", ""));

		debug.add(new EntityDebug("Player Movement:", ""));
		debug.add(new EntityDebug("Enabled:", String.valueOf(UtilPlayerMovement.isEnabled())));
		debug.add(new EntityDebug("Move Up:", String.valueOf(UtilPlayerMovement.isMoveUp())));
		debug.add(new EntityDebug("Move Down:", String.valueOf(UtilPlayerMovement.isMoveDown())));
		debug.add(new EntityDebug("Move Left:", String.valueOf(UtilPlayerMovement.isMoveLeft())));
		debug.add(new EntityDebug("Move Right:", String.valueOf(UtilPlayerMovement.isMoveRight())));
		debug.add(new EntityDebug("Interval:", String.valueOf(UtilPlayerMovement.getInterval())));
		debug.add(new EntityDebug("Acceleration:", String.valueOf(UtilPlayerMovement.getAcceleration())));

	}

	public static int getDebugSize(){
		return debug.size();
	}

	public static EntityDebug getDebug(int Index){
		return debug.get(Index);
	}

	public static int getConsoleSize(){
		return console.size();
	}

	public static EntityDebug getConsole(int Index){
		return console.get(Index);
	}

	public static void addConsoleMessage(String Label, String Value){
		console.add(new EntityDebug(Label, Value));
	}
}