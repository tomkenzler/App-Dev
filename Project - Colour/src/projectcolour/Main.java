package projectcolour;

import projectcolour.views.View;
import projectcolour.util.UtilFPSManager;
import projectcolour.util.UtilArcManager;
import projectcolour.util.UtilPaintManager;
import projectcolour.util.UtilEngineManager;
import projectcolour.components.frame.Frame;

/**
 * @author Tom
 */

public class Main {

	public static void main(String[] args){
		new Main();
	}

	public Main(){

		initFrame();
		initArcs();
		initEngine();

	}

	private void initFrame(){

		Frame.init();
		Frame.updateContentPanePanel(new View());

	}

	private void initArcs(){
		UtilArcManager.init();
	}

	private void initEngine(){

		while(UtilEngineManager.getState()){
			try {
				
				/*	Set time before render	*/
				UtilFPSManager.setBeforeRender(System.currentTimeMillis());

				/*	Set paint manager to true and repaint content pane	*/
				UtilPaintManager.setRepaint(true);
				Frame.repaintContentPanePanel();
			
				/*	Make thread sleep to ensure smooth rendering	*/
				Thread.sleep(UtilFPSManager.getNextTick());
				
				/*	Set time after render and calculate FPS	*/
				UtilFPSManager.setAfterRender(System.currentTimeMillis());
				UtilFPSManager.calculateFPS();
				
			} catch (Exception e){
				System.out.println("Error in Engine:" + e.getMessage());
			}
		}
	}
}