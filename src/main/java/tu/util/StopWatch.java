package tu.util;

public class StopWatch {
	private long start;
	private long stop;
	public StopWatch(){
		
	}
	public void start(){
		start = System.currentTimeMillis();
		
	}
	public void stop(){
		
		stop = System.currentTimeMillis();
	}
	public double elapsedTime(){
		return (stop-start)/1000.0;
	}
	

}
