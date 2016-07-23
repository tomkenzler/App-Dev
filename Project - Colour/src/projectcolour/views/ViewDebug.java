package projectcolour.views;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import projectcolour.util.UtilFPS;

/**
 * @author Tom
 */

public class ViewDebug extends JPanel {
	
	public void render(Graphics2D render){
		
		super.paintComponent(render);
		
		render.setColor(Color.GREEN);
		render.drawString("Debug:", 0, 10);
		render.drawString("FPS:" + UtilFPS.getFPS(), 0, 25);
		
	}
}