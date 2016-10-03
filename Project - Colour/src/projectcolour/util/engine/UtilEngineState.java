package projectcolour.util.engine;

import projectcolour.controllers.DebugController;

/**
 * @author Tom
 */

public final class UtilEngineState {

	private static boolean state = true;

	private UtilEngineState(){
	}

	public static boolean getState(){
		return state;
	}

	public static void setState(boolean State){

		state = State;

		DebugController.addConsoleMessage("Set Game Engine:", String.valueOf(State));

	}
}