package projectcolour.views;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import projectcolour.util.UtilPaintManager;

/**
 * @author Tom
 */

public class View extends JPanel {

	@Override
	public void paintComponent(Graphics g){
		
		/*	Prevent redrawning game if frame's state has changed	*/
		if(UtilPaintManager.getRepaint() == false)
			return;
		
		super.paintComponent(g);

		Graphics2D render = (Graphics2D)g;
		render.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		new ViewWorld().render(render);
		new ViewDebug().render(render);
		new ViewArcs().render(render);
		
		UtilPaintManager.setRepaint(false);

	}
}