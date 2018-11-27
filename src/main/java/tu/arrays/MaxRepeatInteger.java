package tu.arrays;

import java.util.Arrays;

public class MaxRepeatInteger {
	
	
	public static void main(String[] args){
		
		int[] input= {1,2,3,4,2};
		int k=5;
		for(int i=0;i<input.length;i++){
			
			input[input[i]%k]=input[input[i]%k]+k;
			
		}
		System.out.println(Arrays.toString(input));
		int max=input[0];
		int result=0;
		for(int i=1;i<input.length-1;i++){
			if(input[i]>max){
				max=input[i];
				result=i;
			}
				
			
		}
		System.out.println(result);
		
	}

}
