package projectcolour.util;

/**
 * @author Tom
 */

public final class UtilContentPane {

	private static int width = 800;
	private static int height = 600;

	private UtilContentPane() {
	}

	public static int getWidth(){
		return width;
	}

	public static void setWidth(int Width){
		width = Width;
	}

	public static int getHeight(){
		return height;
	}

	public static void setHeight(int Height){
		height = Height;
	}
}