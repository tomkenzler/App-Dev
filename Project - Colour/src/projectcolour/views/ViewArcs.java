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
	static int x = 0;
	static int y;

	public void render(Graphics2D render){
		
		super.paintComponent(render);
		
		render.setStroke(new BasicStroke(5));
		render.rotate(Math.toRadians(r), ((UtilContentPane.getWidth() / 2) - (x / 2)) + x / 2, ((UtilContentPane.getHeight() / 2) - (x / 2)) + x / 2);

		render.setColor(Color.ORANGE);
		render.drawArc((UtilContentPane.getWidth() / 2) - (x / 2), (UtilContentPane.getHeight() / 2) - (x / 2), x, x, 0, 90);

		render.setColor(Color.RED);
		render.drawArc((UtilContentPane.getWidth() / 2) - (x / 2), (UtilContentPane.getHeight() / 2) - (x / 2), x, x, 90, 90);

		render.setColor(Color.BLUE);
		render.drawArc((UtilContentPane.getWidth() / 2) - (x / 2), (UtilContentPane.getHeight() / 2) - (x / 2), x, x, 180, 90);

		render.setColor(Color.GREEN);
		render.drawArc((UtilContentPane.getWidth() / 2) - (x / 2), (UtilContentPane.getHeight() / 2) - (x / 2), x, x, 270, 90);

		if(y == 600){
			y = 0;
			x = 0;
		}
		if(x != 0)
			r += x * 0.1;
		if(Math.toRadians(r) > 360)
			r = 0;
		if(y > 301)
			x--;
		if(y < 300)
			x++;

		y++;
		
	}
}