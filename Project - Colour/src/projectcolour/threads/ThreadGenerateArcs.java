package projectcolour.threads;

import projectcolour.util.UtilArcManager;

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
				UtilArcManager.generateArc();
				Thread.sleep(2000);
			} catch(Exception e){
				e.getMessage();
			}
		}
	}
}