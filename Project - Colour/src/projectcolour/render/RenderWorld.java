package projectcolour.render;

import java.awt.Graphics2D;
import javax.swing.JPanel;
import projectcolour.util.display.UtilContentPane;
import projectcolour.util.global_properties.UtilGlobalProperties;

/**
 * @author Tom
 */

public class RenderWorld extends JPanel {

	public void render(Graphics2D render){

		render.setColor(UtilGlobalProperties.GAME_BACKGROUND_COLOUR);
		render.fillRect(0, 0, UtilContentPane.getWidth(), UtilContentPane.getHeight());

	}
}