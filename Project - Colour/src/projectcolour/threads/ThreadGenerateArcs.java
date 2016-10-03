package projectcolour.threads;

import projectcolour.controllers.ArcController;
import projectcolour.controllers.DebugController;
import projectcolour.util.player.UtilPlayerMovement;
import static projectcolour.util.global_properties.UtilGlobalProperties.*;

/**
 * @author Tom
 */

public class ThreadGenerateArcs implements Runnable {

	public ThreadGenerateArcs(){

		Thread thread = new Thread(this, "ThreadGenerateArcs");
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();

	}

	@Override
	public void run(){

		while(true){
			try {

				if(ArcController.getRemainingArcs() == 0){
					
					ARC_WAVE_DIFFICULTLY++;
					Thread.sleep(ARC_WAVE_INTERVAL);
					for(int i = 0; i < ARC_WAVE_SIZE; i++){

						if(i >= ARC_WAVE_UNLOCK_CONTROLS)
							UtilPlayerMovement.setEnabled(true);

						if(ArcController.getReset() == true){
							ArcController.setReset(false);
							break;
						}

						ArcController.generateArc();
						Thread.sleep(ARC_SPAWN_INTERVAL);

					}
				}
			} catch(Exception e){
				DebugController.addConsoleMessage("Error in ThreadGenerateArcs:", e.getMessage());
			}
		}
	}
}