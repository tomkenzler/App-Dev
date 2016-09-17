package projectcolour.views;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import projectcolour.entities.EntityArc;
import projectcolour.util.UtilArcManager;
import projectcolour.util.UtilContentPane;

/**
 * @author Tom
 */

public class ViewArcs extends JPanel {
	
	public void render(Graphics2D render){

		/*	Create a copy of the graphics object as transforms alter the state	*/
		Graphics2D transformRender = (Graphics2D) render.create();
		for(EntityArc arc : UtilArcManager.getArcs()){
			
			/*	Begin rotation	*/
			Graphics2D transformArc = (Graphics2D) transformRender.create();
			transformArc.rotate(Math.toRadians(arc.getRotation()), UtilContentPane.getWidth() / 2, UtilContentPane.getHeight() / 2);

			/*	Render arc	*/
			transformArc.setColor(new Color(arc.getColour().getRed(),arc.getColour().getGreen(), arc.getColour().getBlue(), arc.getOpacity()));
			transformArc.setStroke(arc.getStroke());
			transformArc.drawArc((UtilContentPane.getWidth() / 2) - ((int) arc.getX() / 2), (UtilContentPane.getHeight() / 2) - ((int) arc.getY() / 2), (int) arc.getWidth(), (int) arc.getHeight(), (int) arc.getStartAngle(), (int) arc.getEndAngle());
			transformArc.dispose();
			
		}
		
		transformRender.dispose();
		
	}
}