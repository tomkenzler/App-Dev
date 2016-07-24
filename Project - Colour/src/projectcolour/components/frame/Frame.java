package projectcolour.components.frame;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import projectcolour.util.UtilContentPane;
import projectcolour.components.listeners.*;

/**
 * @author Tom
 */

public final class Frame {

	private static final JFrame frame = new JFrame();

	private Frame(){
	}

	public static void init(){

		System.out.println("Initialing Frame...");

		frame.setTitle("Project - Colour");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(UtilContentPane.getWidth(), UtilContentPane.getHeight()));

		frame.addKeyListener(new KeyListener());
		frame.addMouseListener(new MouseListener());
		frame.addMouseMotionListener(new MouseListener());
		frame.addComponentListener(new FrameListener());
		frame.getContentPane().addComponentListener(new ContentPaneListener());

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		System.out.println("Initialised Frame...");

	}

	public static void updateContentPanePanel(JPanel panel){
		frame.getContentPane().add(panel).revalidate();
	}

	public static void repaintContentPanePanel(){
		frame.getContentPane().repaint();
	}
}