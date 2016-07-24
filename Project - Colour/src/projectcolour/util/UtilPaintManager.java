package projectcolour.util;

/**
 * @author Tom
 */

public final class UtilPaintManager {

	private static boolean repaint;

	private UtilPaintManager(){
	}

	public static boolean getRepaint(){
		return repaint;
	}

	public static void setRepaint(boolean Repaint){
		repaint = Repaint;
	}
}