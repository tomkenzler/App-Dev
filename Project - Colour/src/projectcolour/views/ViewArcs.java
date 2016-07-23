package projectcolour.views;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import projectcolour.util.UtilContentPane;

/**
 * @author Tom
 */

public class ViewArcs extends JPanel {

	static double r = 1;
	static int x = 300;
	
	static int x1 = 100;
	static int x2 = 200;
	static int x3 = 300;
	static int x4 = 400;
	static int x5 = 500;

	public void render(Graphics2D render){
		
		super.paintComponent(render);
		Graphics2D transformRender = (Graphics2D) render.create();
		
		transformRender.setStroke(new BasicStroke(15));
		transformRender.rotate(Math.toRadians(r), ((UtilContentPane.getWidth() / 2) - (x / 2)) + x / 2, ((UtilContentPane.getHeight() / 2) - (x / 2)) + x / 2);

		transformRender.setColor(Color.ORANGE);
		transformRender.drawArc((UtilContentPane.getWidth() / 2) - (x1 / 2), (UtilContentPane.getHeight() / 2) - (x1 / 2), x1, x1, 0, 90);
		
		transformRender.setColor(Color.RED);
		transformRender.drawArc((UtilContentPane.getWidth() / 2) - (x2 / 2), (UtilContentPane.getHeight() / 2) - (x2 / 2), x2, x2, 0, 180);
		
		transformRender.setColor(Color.BLUE);
		transformRender.drawArc((UtilContentPane.getWidth() / 2) - (x3 / 2), (UtilContentPane.getHeight() / 2) - (x3 / 2), x3, x3, 90, 270);
		
		transformRender.setColor(Color.YELLOW);
		transformRender.drawArc((UtilContentPane.getWidth() / 2) - (x4 / 2), (UtilContentPane.getHeight() / 2) - (x4 / 2), x4, x4, 180, 270);
		
		transformRender.setColor(Color.GREEN);
		transformRender.drawArc((UtilContentPane.getWidth() / 2) - (x5 / 2), (UtilContentPane.getHeight() / 2) - (x5 / 2), x5, x5, 0, 270);
		
		if(r >= 360)
			r = 0;
		
		r++;
		
		transformRender.dispose();
		
	}
}