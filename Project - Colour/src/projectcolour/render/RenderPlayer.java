package projectcolour.render;

import java.awt.Graphics2D;
import javax.swing.JPanel;
import projectcolour.util.global_properties.UtilGlobalProperties;
import projectcolour.util.player.UtilPlayer;

/**
 * @author Tom
 */

public class RenderPlayer extends JPanel {

	public void render(Graphics2D render){

		render.setColor(UtilGlobalProperties.PLAYER_COLOUR);
		render.fillRect(UtilPlayer.getX(), UtilPlayer.getY(), UtilPlayer.getWidth(), UtilPlayer.getHeight());

	}
}