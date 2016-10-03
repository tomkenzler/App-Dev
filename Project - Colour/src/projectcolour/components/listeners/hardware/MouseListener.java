package projectcolour.components.listeners.hardware;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

/**
 * @author Tom
 */

public class MouseListener extends MouseAdapter {

    @Override
    public void mouseMoved(MouseEvent e){
		//System.out.printf("Mouse Moved: MouseX=%s MouseY=%s\n", e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e){
		//System.out.printf("Mouse Pressed: MouseX=%s MouseY=%s\n", e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e){
		//System.out.printf("Mouse Released: MouseX=%s MouseY=%s\n", e.getX(), e.getY());
    }
}