package tu.dsa;

import java.util.Arrays;
import java.util.Scanner;

import tu.util.StopWatch;

/**
 * @author srao0
 * Description:
 * Given an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.
 *
 */


public class KadanesAlog {
	
	private int[] input_array = new int[10];
	public KadanesAlog(int[] array){
		input_array = array;
	}

	public int getMaxSumByIndex(int start_index){
		 int index_max_sum = input_array[start_index];
		 int current_index_max_sum = index_max_sum;
		 for(int i=start_index+1;i<input_array.length;i++){
			 current_index_max_sum =  current_index_max_sum + input_array[i];
			 if(current_index_max_sum>index_max_sum){
				 index_max_sum=current_index_max_sum;
			 }
		
		 }
		 return index_max_sum;
	}
	public int getMaxSum(){
		int mSum = getMaxSumByIndex(0);
		//System.out.println(String.format("Max Subarray sum by indexis %d",mSum));
		for(int i=1;i<input_array.length;i++){
	    	int index_sum= getMaxSumByIndex(i);
	    	//System.out.println(String.format("Max Subarray sum by indexis %d",index_sum));
	    	if(index_sum>mSum)
	    		mSum=index_sum;
	    }
		
		return mSum;
	}
	public static void main(String[] args){
		
		StopWatch timer = new StopWatch();
		timer.start();
		Scanner stdin =  new Scanner(System.in);
		int[][] total_in_arrays = new int[10][];
		int input_no_testCases = stdin.nextInt();
		for(int i=0;i<input_no_testCases;i++){
			int input_tc_array_size = stdin.nextInt();
			int[] input_array = new int[input_tc_array_size];
			for(int j=0;j<input_tc_array_size;j++){
				input_array[j]= stdin.nextInt();
			}
			
			total_in_arrays[i]=input_array;
		}
		for(int i=0;i<input_no_testCases;i++){
			System.out.println(Arrays.toString(total_in_arrays[i]));
			KadanesAlog kObj = new KadanesAlog(total_in_arrays[i]);
			System.out.println(kObj.getMaxSum());
		}
		
		
		
		timer.stop();
		System.out.println(String.format("Execution time is %41.2f",timer.elapsedTime()));
		
		
	    
	}    	
	        
	    	
	    	
}
