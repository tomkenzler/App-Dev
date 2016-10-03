package projectcolour.render;

import javax.swing.JPanel;
import java.awt.Graphics2D;
import projectcolour.controllers.DebugController;
import projectcolour.util.display.UtilContentPane;
import static projectcolour.util.global_properties.UtilGlobalProperties.*;

/**
 * @author Tom
 */

public class RenderDebug extends JPanel {

	public void render(Graphics2D render){

		if(!DEBUG_ENABLED)
			return;

		render.setColor(DEBUG_TEXT_COLOUR);
		for(int i = 0; i < DebugController.getDebugSize(); i++)
			render.drawString(DebugController.getDebug(i).getCombinedMessage(), 0, i * DEBUG_SPACING + DEBUG_Y_POSITION);

		try {
			int y = 0;
			for(int i = DebugController.getConsoleSize() - 1; i >= DebugController.getConsoleSize() - CONSOLE_ITEMS; i--){
				render.drawString(DebugController.getConsole(i).getCombinedMessage(), 0, (UtilContentPane.getHeight() - (CONSOLE_ITEMS * CONSOLE_SPACING - 10)) + (y * CONSOLE_SPACING));
				y++;
			}	
		} catch(Exception e){
		}
	}
}