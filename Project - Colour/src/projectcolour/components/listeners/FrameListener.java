package projectcolour.components.listeners;

import projectcolour.util.UtilFrame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;

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