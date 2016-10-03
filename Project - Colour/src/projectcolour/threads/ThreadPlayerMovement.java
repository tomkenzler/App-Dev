package projectcolour.threads;

import projectcolour.util.player.UtilPlayer;
import projectcolour.controllers.DebugController;
import projectcolour.util.player.UtilPlayerMovement;
import static projectcolour.util.global_properties.UtilGlobalProperties.*;

/**
 * @author Tom
 */

public class ThreadPlayerMovement implements Runnable {

	public ThreadPlayerMovement(){

		Thread thread = new Thread(this, "ThreadPlayerMovement");
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();

	}

	@Override
	public void run(){

		while(true){
			try {

				if(UtilPlayerMovement.isMoveUp() || UtilPlayerMovement.isMoveDown() || UtilPlayerMovement.isMoveLeft() || UtilPlayerMovement.isMoveRight()){
					UtilPlayerMovement.decrementInterval();
					UtilPlayerMovement.incrementAcceleration();
				} else {
					UtilPlayerMovement.setInterval(PLAYER_MOVEMENT_MIN_INTERVAL);
					UtilPlayerMovement.setAcceleration(PLAYER_MOVEMENT_MIN_ACCELERATION);
				}
				if(UtilPlayerMovement.isMoveUp())
					UtilPlayer.moveUp(UtilPlayerMovement.getAcceleration());
				if(UtilPlayerMovement.isMoveDown())
					UtilPlayer.moveDown(UtilPlayerMovement.getAcceleration());
				if(UtilPlayerMovement.isMoveLeft())
					UtilPlayer.moveLeft(UtilPlayerMovement.getAcceleration());
				if(UtilPlayerMovement.isMoveRight())
					UtilPlayer.moveRight(UtilPlayerMovement.getAcceleration());

				Thread.sleep(UtilPlayerMovement.getInterval());

			} catch(Exception e){
				DebugController.addConsoleMessage("Error in ThreadPlayerMovement:", e.getMessage());
			}
		}
	}
}