package tu.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class FourElements {
	
	private int[] stackComb;
	private int stack_top=0;
	private int max_stak_size=4;
	private int max_stack_sum;
	int[] input_array;
	
	public int[] getInput_array() {
		return input_array;
	}
	public void setInput_array(int[] input_array) {
		this.input_array = input_array;
	}
	public FourElements(int msize,int msum,int[] minput_array){
		max_stak_size=msize;
		max_stack_sum=msum;
		input_array=minput_array;
		stackComb=new int[4];
		stack_top=0;
	}
	private void push(int num){
		if(!isFull()){
			stackComb[stack_top]=num;
			stack_top=stack_top+1;
		}
				
		}
	private void pop(){
		if(!isEmpty()){
			stackComb[stack_top-1]=0;
			stack_top--;
		}
		
		
	}
	private boolean isEmpty(){
		if(stack_top<=0){
			return true;
			
		}
		else{
			return false;
		}
	}
	private boolean isFull(){
		if(stack_top>=max_stak_size){
			return true;
			
		}
		else{
			return false;
		}
	}
	private int getStackSum(){
		int total=0;
		for(int i=0;i<stack_top;i++){
			total=total+stackComb[i];
		}
		return total;
	}
	private void clearStack(){
		for(int i=0;i<stack_top;i++){
			
			stackComb[i]=0;
		}
		stack_top=0;
	}
	
	public boolean isExisting(){

		for(int i=0;i<input_array.length;i++){
			clearStack();
			push(input_array[i]);
			for(int j=i+1;j<input_array.length;j++){
				//System.out.println(input_array[i]);
				push(input_array[j]);
				int current_sum=getStackSum();
				if(current_sum<=max_stack_sum){
					
	                if(stack_top==max_stak_size){
	                	System.out.println(Arrays.toString(stackComb));
	                	if(current_sum==max_stack_sum){
	                		//System.out.println(Arrays.toString(stackComb));
	                		System.out.println(1);
	                		return true;
	                	}
	                }

					
				}
				else{
					pop();
				}
				
			}
			
		}
		System.out.println(0);
		return false;
		
	}
	
	public static void main(String[] args){
		
		Scanner stdin=new Scanner(System.in);
		
		int num_of_test_cases=stdin.nextInt();
		FourElements[] four_ele_array=new FourElements[num_of_test_cases];
		for(int i=0;i<num_of_test_cases;i++){
			
			int input_array_size=stdin.nextInt();
			stdin.nextLine(); 
			int[] input_array=new int[input_array_size];
			Scanner numScanner = new Scanner(stdin.nextLine());
			for(int j=0;j<input_array_size;j++){
				 
				if(numScanner.hasNextInt()){
					input_array[j]=numScanner.nextInt();
				}
			}
			int input_max_sum=stdin.nextInt();
			four_ele_array[i]=new FourElements(4,input_max_sum,input_array);
			
		}
		
		for(int i=0;i<num_of_test_cases;i++){
			
			//System.out.println(Arrays.toString(four_ele_array[i].input_array));
			four_ele_array[i].isExisting();
		}
//		
		
	}

}
