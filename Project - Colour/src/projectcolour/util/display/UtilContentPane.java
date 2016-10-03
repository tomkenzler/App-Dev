package projectcolour.util.display;

import static projectcolour.util.global_properties.UtilGlobalProperties.*;

/**
 * @author Tom
 */

public final class UtilContentPane {

	private static int width = CONTENT_PANE_WIDTH;
	private static int height = CONTENT_PANE_HEIGHT;

	private UtilContentPane() {
	}

	public static int getWidth(){
		return width;
	}

	public static void setWidth(int Width){
		width = Width;
	}

	public static int getWidthCentre(){
		return width / 2;
	}

	public static int getHeight(){
		return height;
	}

	public static void setHeight(int Height){
		height = Height;
	}

	public static int getHeightCentre(){
		return height / 2;
	}
}