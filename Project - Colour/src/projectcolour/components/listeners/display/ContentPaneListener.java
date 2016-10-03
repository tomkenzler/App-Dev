package projectcolour.components.listeners.display;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;
import projectcolour.util.player.UtilPlayer;
import projectcolour.util.display.UtilContentPane;

/**
 * @author Tom
 */

public class ContentPaneListener extends ComponentAdapter {

	@Override
	public void componentResized(ComponentEvent e){

		/* Get distance from the centre */
		int XDistance = UtilPlayer.getX() - UtilContentPane.getWidthCentre();
		int YDistance = UtilPlayer.getY() - UtilContentPane.getHeightCentre();

		/* Update the content pane to the new size */
		UtilContentPane.setWidth(e.getComponent().getBounds().width);
		UtilContentPane.setHeight(e.getComponent().getBounds().height);

		/* Reposition player based off distance from the centre */
		UtilPlayer.setX(UtilContentPane.getWidthCentre()+ XDistance);
		UtilPlayer.setY(UtilContentPane.getHeightCentre()+ YDistance);

	}
}