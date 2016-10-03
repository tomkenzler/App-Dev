package projectcolour.util.display;

/**
 * @author Tom
 */

public final class UtilFrame {

	private static double width;
	private static double height;

	private UtilFrame() {
	}

	public static double getWidth(){
		return width;
	}

	public static void setWidth(double Width){
		width = Width;
	}

	public static double getHeight(){
		return height;
	}

	public static void setHeight(double Height){
		height = Height;
	}
}