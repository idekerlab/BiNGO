package bingo.internal;

import org.cytoscape.work.Task;
import org.cytoscape.work.TaskMonitor;

public abstract class BingoTask implements Task {
	
	protected TaskMonitor taskMonitor = null;
	protected boolean cancelled = false;
	

	public void run(TaskMonitor taskMonitor) throws Exception {
		this.taskMonitor = taskMonitor;
		calculate();
	}
	
	public void cancel() {
		this.cancelled = true;		
	}
	
	public abstract void calculate() throws Exception;

}
