package projectcolour.components.listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

/**
 * @author Tom
 */

public class KeyListener extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e){
        System.out.printf("Key Pressed: Key=%s\n", e.getKeyText(e.getKeyCode()));
	}

    @Override
    public void keyReleased(KeyEvent e){
        System.out.printf("Key Released: Key=%s\n", e.getKeyText(e.getKeyCode()));
    }
}