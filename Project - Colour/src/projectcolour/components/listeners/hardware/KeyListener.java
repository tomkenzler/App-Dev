package projectcolour.components.listeners.hardware;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import projectcolour.controllers.DebugController;
import projectcolour.util.player.UtilPlayerMovement;

/**
 * @author Tom
 */

public class KeyListener extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e){

		if(!UtilPlayerMovement.isEnabled())
			return;

		if(e.getKeyCode() == e.VK_UP || e.getKeyCode() == e.VK_W)
			UtilPlayerMovement.setMoveUp(true);
		if(e.getKeyCode() == e.VK_DOWN || e.getKeyCode() == e.VK_S)
			UtilPlayerMovement.setMoveDown(true);
		if(e.getKeyCode() == e.VK_LEFT || e.getKeyCode() == e.VK_A)
			UtilPlayerMovement.setMoveLeft(true);
		if(e.getKeyCode() == e.VK_RIGHT || e.getKeyCode() == e.VK_D)
			UtilPlayerMovement.setMoveRight(true);

		DebugController.addConsoleMessage("Key Pressed:", e.getKeyText(e.getKeyCode()));

	}

    @Override
    public void keyReleased(KeyEvent e){

		if(e.getKeyCode() == e.VK_UP || e.getKeyCode() == e.VK_W)
			UtilPlayerMovement.setMoveUp(false);
		if(e.getKeyCode() == e.VK_DOWN || e.getKeyCode() == e.VK_S)
			UtilPlayerMovement.setMoveDown(false);
		if(e.getKeyCode() == e.VK_LEFT || e.getKeyCode() == e.VK_A)
			UtilPlayerMovement.setMoveLeft(false);
		if(e.getKeyCode() == e.VK_RIGHT || e.getKeyCode() == e.VK_D)
			UtilPlayerMovement.setMoveRight(false);

		DebugController.addConsoleMessage("Key Released:", e.getKeyText(e.getKeyCode()));

    }
}