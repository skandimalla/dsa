package tu.dsa;

import java.util.Scanner;



public class MyStackSum {
	
	private int[] s_array = null;
	private int s_max_size = 0;
	private int s_top=0;
	
	public MyStackSum(int max_size){
		s_max_size=max_size;
		s_array =new int[s_max_size];
	}
	public void push(int ele){
	    	 s_array[s_top]=ele;
	    	 s_top++;
	}
	public int pop(){
			int pop_ele=s_array[s_top-1];
			s_top--;
			return pop_ele;
	}
	public boolean isFull(){
		
		return s_top==s_max_size?true:false;
		
	}
    public boolean isEmpty(){
		
		return s_top==0?true:false;
		
	}
    
    public int getStackSum(){
    	int total=0;
    	for(int i=0;i<s_top;i++){
    		total=total+s_array[i];
    	}
    	return total;
    	
    }
    public void clear(){
    	s_array =new int[s_max_size];
    	s_top=0;
    	
    }
    public void print(){
    
    	for(int i=0;i<s_top;i++){
    		System.out.print(String.format(" %d", s_array[i]));
    	}
    	System.out.println("");
    	
    	
    }
	public static void main(String[] args){
		
        Scanner stdin=new Scanner(System.in);
		
		int num_of_test_cases=stdin.nextInt();
		int[][] g_input_array=new int[num_of_test_cases][];
		for(int i=0;i<num_of_test_cases;i++){
			
			int input_array_size=stdin.nextInt();
			int[] input_array=new int[input_array_size];
			for(int j=0;j<input_array_size;j++){
				int data=stdin.nextInt();
				input_array[j]=data;
			}
			g_input_array[i]=input_array;
			
		}
		int input_max_sum=stdin.nextInt();
		
	
		MyStackSum mss=new MyStackSum(4);
		mss.push(3);
		mss.push(1);
		mss.push(2);
		mss.print();
		mss.pop();
		mss.print();
		mss.push(7);
		mss.print();
		System.out.println(mss.getStackSum());
	}

}
