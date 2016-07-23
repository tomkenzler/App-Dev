package projectcolour.components.listeners;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;
import projectcolour.util.UtilContentPane;

/**
 * @author Tom
 */

public class ContentPaneListener extends ComponentAdapter {
	
	@Override
	public void componentResized(ComponentEvent e){
		UtilContentPane.setWidth(e.getComponent().getBounds().width);
		UtilContentPane.setHeight(e.getComponent().getBounds().height);
	}
}