package projectcolour.threads;

import projectcolour.components.frame.Frame;

/**
 * @author Tom
 */

public class ThreadRender implements Runnable {

	public ThreadRender(){

		Thread thread = new Thread(this, "RenderThread");
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();

	}

	@Override
	public void run(){

		while(true){
			try {
				Thread.sleep(5);
				Frame.repaintContentPanePanel();
			} catch(Exception e){
				e.getMessage();
			}
		}
	}
}