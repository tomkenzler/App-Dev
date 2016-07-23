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
		render.setRenderingHint(RenderingHints.KEY_ANTIALIASING,		RenderingHints.VALUE_ANTIALIAS_ON);
		render.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION,	RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		render.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING,		RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		render.setRenderingHint(RenderingHints.KEY_DITHERING,			RenderingHints.VALUE_DITHER_ENABLE);
		render.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,	RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		render.setRenderingHint(RenderingHints.KEY_INTERPOLATION,		RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		render.setRenderingHint(RenderingHints.KEY_RENDERING,			RenderingHints.VALUE_RENDER_QUALITY);
		render.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,		RenderingHints.VALUE_STROKE_PURE);
		render.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,	RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		new ViewWorld().render(render);
		new ViewArcs().render(render);
		new ViewDebug().render(render);
		
		UtilPaintManager.setRepaint(false);

	}
}