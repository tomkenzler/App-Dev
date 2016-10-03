package projectcolour.components.listeners.display;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;
import projectcolour.util.display.UtilFrame;

/**
 * @author Tom
 */

public class FrameListener extends ComponentAdapter {

	@Override
	public void componentResized(ComponentEvent e){
		UtilFrame.setWidth(e.getComponent().getBounds().width);
		UtilFrame.setHeight(e.getComponent().getBounds().height);
	}
}