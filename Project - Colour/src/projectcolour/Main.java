package projectcolour;

import projectcolour.render.Render;
import projectcolour.util.arc.UtilColour;
import projectcolour.util.player.UtilPlayer;
import projectcolour.components.frame.Frame;
import projectcolour.controllers.ArcController;
import projectcolour.controllers.FPSController;
import projectcolour.threads.ThreadGenerateArcs;
import projectcolour.util.engine.UtilEngineState;
import projectcolour.controllers.DebugController;
import projectcolour.threads.ThreadPlayerMovement;

/**
 * @author Tom
 */

public class Main {

	public static void main(String[] args){
		new Main();
	}

	public Main(){

		initColours();
		initPlayer();
		initPlayerThread();
		initDebug();
		initRender();
		initFrame();
		initEngine();

	}

	private void initColours(){

		DebugController.addConsoleMessage("Initialising Colours...", "");

		UtilColour.init();

		DebugController.addConsoleMessage("Initialised Colours...", "");

	}

	private void initPlayer(){

		DebugController.addConsoleMessage("Initialising Player...", "");

		UtilPlayer.init();

		DebugController.addConsoleMessage("Initialised Player...", "");

	}

	private void initPlayerThread(){

		DebugController.addConsoleMessage("Initialising Player Thread...", "");

		new ThreadPlayerMovement();

		DebugController.addConsoleMessage("Initialised Player Thread...", "");

	}

	private void initDebug(){

		DebugController.addConsoleMessage("Initialising Debug...", "");

		DebugController.refresh();

		DebugController.addConsoleMessage("Initialised Debug...", "");

	}

	private void initRender(){

		DebugController.addConsoleMessage("Initialising Rendering Engine...", "");

		new ThreadGenerateArcs();

		DebugController.addConsoleMessage("Initialised Rendering Engine...", "");

	}

	private void initFrame(){
	
		DebugController.addConsoleMessage("Initialising Frame...", "");
	
		Frame.init();
		Frame.updateContentPanePanel(new Render());

		DebugController.addConsoleMessage("Initialised Frame...", "");

	}

	private void initEngine(){

		DebugController.addConsoleMessage("Initialised Game Engine...", "");

		while(UtilEngineState.getState()){
			

				/*	Set time before render */
				FPSController.setBeforeRender(System.currentTimeMillis());

				/*	Update arc logic */
				ArcController.updateArcs();
try {
				/*	Make thread sleep to ensure smooth rendering */
				Thread.sleep(FPSController.getNextTick());
			} catch (Exception e){
				DebugController.addConsoleMessage("Error in Game Engine:", e.getMessage());
			}
				/*	Set time after render and calculate FPS */
				FPSController.setAfterRender(System.currentTimeMillis());
				FPSController.calculateFPS();

				/*	Update Debug */
				DebugController.refresh();

				/*	Refresh Game Screen */
				Frame.repaintContentPanePanel();


		}

		DebugController.addConsoleMessage("Initialised Terminating Game Engine...", "");

	}
}