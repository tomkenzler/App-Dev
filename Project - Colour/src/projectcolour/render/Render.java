package projectcolour.render;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import projectcolour.util.display.UtilContentPane;
import projectcolour.controllers.CollisionController;

/**
 * @author Tom
 */

public class Render extends JPanel {

	@Override
	public void paintComponent(Graphics g){

		super.paintComponent(g);

		/* We're going to draw all of our graphics to this canvas */
		BufferedImage canvas = new BufferedImage(UtilContentPane.getWidth(), UtilContentPane.getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D render = (Graphics2D)canvas.getGraphics();

		/* Initialise the quality of the graphics */
		render.setRenderingHint(RenderingHints.KEY_ANTIALIASING,		RenderingHints.VALUE_ANTIALIAS_ON);
		render.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION,	RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		render.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING,		RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		render.setRenderingHint(RenderingHints.KEY_DITHERING,			RenderingHints.VALUE_DITHER_ENABLE);
		render.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,	RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		render.setRenderingHint(RenderingHints.KEY_INTERPOLATION,		RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		render.setRenderingHint(RenderingHints.KEY_RENDERING,			RenderingHints.VALUE_RENDER_QUALITY);
		render.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,		RenderingHints.VALUE_STROKE_PURE);
		render.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,	RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		/* Let's render the game */
		new RenderWorld().render(render);
		new RenderPlayer().render(render);
		new RenderArcs().render(render);
		/* Now we use our canvas to detect collisions */
		CollisionController.validate(canvas);
		new RenderDebug().render(render);

		/* Draw thew canvas to the screen */
		g.drawImage(canvas, 0, 0, this);

	}
}