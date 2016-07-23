package projectcolour.views;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import projectcolour.util.UtilContentPane;

/**
 * @author Tom
 */

public class ViewWorld extends JPanel {

	public void render(Graphics2D render){

		super.paintComponent(render);

		render.setColor(Color.BLACK);
		render.fillRect(0, 0, UtilContentPane.getWidth(), UtilContentPane.getHeight());

	}
}