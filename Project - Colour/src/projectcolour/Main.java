package projectcolour;

import projectcolour.views.View;
import projectcolour.util.UtilFPS;
import projectcolour.util.UtilPaintManager;
import projectcolour.util.UtilEngineManager;
import projectcolour.components.frame.Frame;

/**
 * @author Tom
 */

public class Main {

	public static void main(String[] args) {
		
		new Main();
		
	}

	public Main(){
		
		initFrame();
		initEngine();
		
	}

	private void initFrame() {
		
		Frame.init();
		Frame.updateContentPanePanel(new View());

	}

	private void initEngine() {

		while(UtilEngineManager.getState()){
			try {
				
				/*	Set time before render	*/
				UtilFPS.setBeforeRender(System.currentTimeMillis());

				/*	Set paint manager to true and repaint content pane	*/
				UtilPaintManager.setRepaint(true);
				Frame.repaintContentPanePanel();
			
				/*	Make thread sleep to ensure smooth rendering	*/
				Thread.sleep(UtilFPS.getNextTick());
				
				/*	Set time after render and calculate FPS	*/
				UtilFPS.setAfterRender(System.currentTimeMillis());
				UtilFPS.calculateFPS();
				
			} catch (Exception e){
				System.out.println("Error in Engine:" + e.getMessage());
			}
		}
	}
}