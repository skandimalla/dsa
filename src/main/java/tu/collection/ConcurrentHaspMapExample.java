package tu.collection;

import java.util.Random;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHaspMapExample {
	
	public static void main(String[] args){
		
		System.out.println("test123");
		
	}
	
	class WriteThread implements Runnable{
		
		private ConcurrentMap map;
		private Random random;
		private String threadName;
		
		public WriteThread(ConcurrentMap<Integer,String> map,long randomseed,String threadName){
			
			this.map=map;
			this.random=new Random(randomseed);
			this.threadName=threadName;
			
		}

		public void run() {
			while(true){
				Integer key=random.nextInt(10);
				//map.putIfAbsent(key, value);
			}
			
		}
		
	}

}
