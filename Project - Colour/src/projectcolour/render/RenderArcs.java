package projectcolour.render;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import projectcolour.entities.EntityArc;
import projectcolour.controllers.ArcController;
import projectcolour.util.display.UtilContentPane;

/**
 * @author Tom
 */

public class RenderArcs extends JPanel {

	public void render(Graphics2D render){

		/*	Create a copy of the graphics object as transforms alter the state	*/
		Graphics2D transformRender = (Graphics2D) render.create();
		for(EntityArc arc : ArcController.getArcs()){

			/*	Begin rotation	*/
			Graphics2D transformArc = (Graphics2D) transformRender.create();
			transformArc.rotate(Math.toRadians(arc.getRotation()), UtilContentPane.getWidth() / 2, UtilContentPane.getHeight() / 2);

			/*	Render arc	*/
			transformArc.setColor(new Color(arc.getColour().getRed(), arc.getColour().getGreen(), arc.getColour().getBlue(), arc.getOpacity()));
			transformArc.setStroke(arc.getStroke());
			transformArc.drawArc((UtilContentPane.getWidth() / 2) - (arc.getX() / 2), (UtilContentPane.getHeight() / 2) - (arc.getY() / 2), arc.getWidth(), arc.getHeight(), arc.getStartAngle(), arc.getEndAngle());
			transformArc.dispose();

		}

		transformRender.dispose();

	}
}