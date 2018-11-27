package tu.core;

import java.util.Scanner;

public class LargestNumber {
	
	
	public void getLargestNumber(int[] input_array){
		int total_digigts=0;
		int max_possible_number=0;
		int[] output_array=new int[input_array.length];
		for(int i=0;i<input_array.length;i++){
			total_digigts=total_digigts+numOfDigits(input_array[i]);
		}
		//System.out.println(String.format("%d",total_digigts));
		max_possible_number=(int) (Math.pow(10, total_digigts)-1);
		int reached_total_input=0;
		int reached_total_output=0;
		for(int i=input_array.length-1;i>=0;i--){
			int ouput_index=input_array.length-(i+1);
		    int input_index=0;
			for(int j=0;j<input_array.length;j++){
				int pos_input=(int) (input_array[j]*Math.pow(10,i));
				int pos_output=(int) (output_array[ouput_index]*Math.pow(10,i));
				if((reached_total_input+pos_input)<=max_possible_number&&(reached_total_input+pos_input)>(reached_total_input+pos_output)){
					output_array[ouput_index]=input_array[j];
					input_index=j;
				}
					
			}
			reached_total_input=reached_total_input+(int) (output_array[ouput_index]*Math.pow(10,i));
			input_array[input_index]=-1;
			
			
			
		}
		
		for(int i=0;i<output_array.length;i++){
		      System.out.println(output_array[i]);
		}
		
		
	}
	

	
	private int numOfDigits(int num){
		
		for(int i=1;;i++){
			double divider=Math.pow(10,i);
			int reminder=(int) (num%(divider));
			if(reminder==num){
				return i;
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args){
		
		Scanner stdin=new Scanner(System.in);
		LargestNumber ln=new LargestNumber();
		int num_test_cases=stdin.nextInt();
		int[][] group_array=new int[100][];
		for(int i=0;i<num_test_cases;i++){
			int input_array_size=stdin.nextInt();
			int[] input_array=new int[input_array_size];
			for(int j=0;j<input_array_size;j++){
				input_array[j]=stdin.nextInt();
			}
			group_array[i]=input_array;
		}
		for(int i=0;i<num_test_cases;i++){
			//System.out.println(group_array[i]);
			ln.getLargestNumber(group_array[i]);
		}
		
		
	}

}
