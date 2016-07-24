package projectcolour.util;

/**
 * @author Tom
 */

public final class UtilEngineManager {

	private static boolean state = true;

	private UtilEngineManager(){
	}

	public static boolean getState(){
		return state;
	}

	public static void setState(boolean State){

		state = State;
		System.out.println((state == true ? "Initalising Engine..." : "Terminated Engine..."));

	}
}