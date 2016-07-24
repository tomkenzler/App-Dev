package projectcolour.views;

import javax.swing.JPanel;
import java.awt.Graphics2D;
import projectcolour.entities.EntityArc;
import projectcolour.util.UtilArcManager;
import projectcolour.util.UtilContentPane;

/**
 * @author Tom
 */

public class ViewArcs extends JPanel {

	static double r;

	public void render(Graphics2D render){

		super.paintComponent(render);

		/*	Create a copy of the graphics object as transforms alter the state	*/
		Graphics2D transformRender = (Graphics2D) render.create();
		transformRender.rotate(Math.toRadians(r++), UtilContentPane.getWidth() / 2, UtilContentPane.getHeight() / 2);

		for(EntityArc arc : UtilArcManager.getArcs()){
			transformRender.setColor(arc.getColour());
			transformRender.setStroke(arc.getStroke());
			transformRender.drawArc((UtilContentPane.getWidth() / 2) - ((int) arc.getX() / 2), (UtilContentPane.getHeight() / 2) - ((int) arc.getY() / 2), (int) arc.getWidth(), (int) arc.getHeight(), (int) arc.getStartAngle(), (int) arc.getEndAngle());
		}

		transformRender.dispose();

	}
}