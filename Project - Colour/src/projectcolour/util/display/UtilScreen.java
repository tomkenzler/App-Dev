package projectcolour.util.display;

import java.awt.Toolkit;

/**
 * @author Tom
 */

public final class UtilScreen {

	private UtilScreen(){
	}

	public static int getWidth(){
		return Toolkit.getDefaultToolkit().getScreenSize().width;
	}

	public static int getHeight(){
		return Toolkit.getDefaultToolkit().getScreenSize().height;
	}
}