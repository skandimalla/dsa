package tu.multithread;


import java.util.LinkedList;

public class ProducerConsumer {
	static LinkedList<Integer> queue=new LinkedList<Integer>();
	static int capacity =2;
	public static void main(String[] args){
		
		
		final Producer p=new Producer();
		Thread p1 =new Thread(new Runnable(){

			public void run() {
				try {
					p.produce(queue,capacity);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		final Consumer c =new Consumer();
		Thread c1 =new Thread(new Runnable(){

			public void run() {
				try {
					c.consume(queue);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		p1.start();
		c1.start();
		try {
			p1.join();
			c1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class Producer{
	
	public void produce(LinkedList<Integer> queue,int capacity) throws InterruptedException {
		int value=0;
		while(true){
			synchronized (this) 
            { 
				while(queue.size()==capacity){
					System.out.println("producer is waiting...");
					wait();
				}
				System.out.println("produced->"+value);
				queue.add(value++);
				notify();
				Thread.sleep(1000);
            }
			
		}
		
	}
	
	
}
class Consumer{
	
	public void consume(LinkedList<Integer> queue) throws InterruptedException {
		while(true){
			synchronized (this) 
            { 
				while(queue.size()==0){
					System.out.println("consumer is waiting...");
					wait();
				}
					
				Integer value=queue.removeFirst();
				System.out.println("consumed->"+value.intValue());
				notify();
				Thread.sleep(1000);
            }

		}
		
	}
	
	
}
