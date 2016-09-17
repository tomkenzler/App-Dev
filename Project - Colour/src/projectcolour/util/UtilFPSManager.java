package projectcolour.util;

/**
 * @author Tom
 */

public final class UtilFPSManager {

	private static int FPS;
	private static int renderCount;
	private static long nextTick;
	private static long afterRender;
	private static long timeElapsed;
	private static long beforeRender;
	private static final int desiredFPS = 120;

	private UtilFPSManager(){
	}

	public static void setBeforeRender(long BeforeRender){
		beforeRender = BeforeRender;
	}

	public static void setAfterRender(long AfterRender){
		afterRender = AfterRender;
	}

	public static long getNextTick(){
		return nextTick;
	}

	public static int getFPS(){
		return FPS;
	}

	public static void calculateFPS(){

		timeElapsed += afterRender - beforeRender;

		/*	If 1 second has passed or the game has been drawn to the desired frames per second, calculate FPS	*/
		if(timeElapsed >= 1000 || renderCount == desiredFPS){
			FPS = renderCount;
			timeElapsed = 0;
			renderCount = 0;
		}

		nextTick = (1000 - timeElapsed) / (desiredFPS - renderCount);
		renderCount++;

	}
}