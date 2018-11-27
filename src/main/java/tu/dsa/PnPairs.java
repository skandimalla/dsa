package tu.dsa;


import java.util.Arrays;

import java.util.Scanner;

public class PnPairs {
	
	
	
	
	public void printPairs(int[] input_array){
		
		sortArray(input_array); 
		
		
		
		stack s=new stack(input_array.length);
		queue q=new queue(input_array.length);
		for(int i=0;i<input_array.length;i++){
			if(input_array[i]<0){
				s.push(input_array[i]);
			}
			else{
				q.enqueue(input_array[i]);
			}
		}
		//s.print();
		//q.print();
		//System.out.println(s.getTop());
		boolean has_found=false;
		while(s.notEmpty()&&q.notEmpty()){
			int sn=s.getTop();
			int qp=q.getFront();
			if(Math.abs(sn)==Math.abs(qp)){
				
				System.out.print(String.format("-%d %d ",qp,qp));
				has_found=true;
				s.pop();
				q.dequeue();
			}
			else if(Math.abs(sn)<Math.abs(qp)){
				s.pop();
				
			}
			else if(Math.abs(sn)>Math.abs(qp)){
				q.dequeue();
			}
			
		}
		
		if(!has_found){
			System.out.println(0);
		}
	}
	public void sort(int index,int n,int[] input_array){
		
		int lc=2*index;
		int rc=2*index+1;
		int largest=index;
		if(lc<=n&&input_array[lc]>input_array[largest]){
			largest=lc;
			
		}
		if(rc<=n&&input_array[rc]>input_array[largest]){
			largest=rc;
			
		}
		if(largest!=index){
			int tmp=input_array[index];
			input_array[index]=input_array[largest];
			input_array[largest]=tmp;
			
		}
		
	}
		
	public void sortArray(int[] input_array){
		
		for(int i=input_array.length-1;i>=0;i--){
			
			for(int j=(input_array.length/2)-1;j>=0;j--){
				
				sort(j,i,input_array);
				
			}
			
			int tmp=input_array[0];
			input_array[0]=input_array[i];
			input_array[i]=tmp;
		}
		
		//System.out.println(Arrays.toString(input_array));
		
	}
	
	
	
	
	public static void main(String[] args){
		
		Scanner stdin=new Scanner(System.in);
		PnPairs pp=new PnPairs();
		int num_test_cases=stdin.nextInt();
		int[][] gArray=new int[num_test_cases][1000];
		for(int i=0;i<num_test_cases;i++){
			int aSize=stdin.nextInt();
			int[] input_array=new int[aSize];
			for(int j=0;j<aSize;j++){
				input_array[j]=stdin.nextInt();
			}
			gArray[i]=input_array;
		}
		 long startTime = System.currentTimeMillis();
		for(int i=0;i<num_test_cases;i++){
			pp.printPairs(gArray[i]);
			System.out.println("");
		}
		 long endTime = System.currentTimeMillis();
		 long elapsed_time=endTime-startTime;
		 System.out.println("");
		 System.out.println(String.format("execution time->%d",elapsed_time));
		
	}
	
	class stack{
		private int top=-1;
		int smax=0;
		int[] sarray;
		public stack(int size){
			sarray=new int[size];
			smax=size;
			
		}
		public void push(int input){
			top=top+1;
			if(top<smax){
				sarray[top]=input;
				
			}
		}
		public int pop(){
			int p=0;
			if(top>=0){
				p= sarray[top];
				top--;
			}
			return p;
		}
		public void print(){
			System.out.println(Arrays.toString(sarray));
		}
		public int getTop(){
			return sarray[top];
		}
		public boolean notEmpty(){
			if(top<=-1){
				return false;
				
			}
			else {
				return true;
			}
		}
		public int getSize(){
			return top;
		}
		
		
	}
	class queue{
		
		private int front=0;
		private int size=0;
		private int qmax=0;
		private int rear=0;
		int[] qarray;
		public queue(int size){
			qmax=size;
			qarray=new int[size];
		}
		public void enqueue(int input){
			if(size<qmax){
				qarray[rear]=input;
				rear=(rear+1)%qmax;
				size=size+1;
			}
		}
		public int dequeue(){
			int p=0;
			if(front<=rear){
				p=qarray[front];
				front=(front+1)%qmax;
				size=size-1;
			}
			return p;
		}
		public void print(){
			System.out.println(Arrays.toString(qarray));
		}
		public int getSize(){
			return size;
		}
		public int getFront(){
			
			return qarray[front];
			
		}
		public boolean notEmpty(){
			if(front>rear){
				return false;
				
			}
			else {
				return true;
			}
		}
		
	}

}
