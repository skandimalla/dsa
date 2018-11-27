package tu.core;

import java.util.Scanner;

public class Star {
	
	
	
	public void printStarSuperStar(int[] input_array){
		
		int ss_count=0;
		int s_count=0;
		int ss_last_index=0;
		int[] star_array=new int[input_array.length];
		int max=input_array[0];
		for(int i=1;i<input_array.length;i++){
			if(max<input_array[i])
				max=input_array[i];
		}
		for(int i=0;i<input_array.length;i++){
			if(max==input_array[i]){
				ss_count=ss_count+1;
				ss_last_index=i;
			}
				
			
		}
		star_array[s_count]=input_array[input_array.length-1];
		for(int k=input_array.length-2;k>=ss_last_index;k--){
			
			if(input_array[k]>star_array[s_count]){
				s_count++;
				star_array[s_count]=input_array[k];
				
			}
		}
	    for(int i=s_count;i>=0;i--)
	    	System.out.print(String.format("%d ", star_array[i]));
	    System.out.println();
		if(ss_count==1){
			System.out.println(max);
		}
		else{
			System.out.println(-1);
		}
		
	}
	
	
	
	
	public static void main(String[] args){
		
		
		Scanner stdin=new Scanner(System.in);
		int num_of_test_cases=stdin.nextInt();
		int[][] global_input_array=new int[num_of_test_cases][3];
		Star s=new Star();
		for(int i=0;i<num_of_test_cases;i++){
			
			int input_array_size = stdin.nextInt();
			int[] input_array =new int[input_array_size];
			for(int j=0;j<input_array_size;j++){
				input_array[j] = stdin.nextInt();
			}
			global_input_array[i]=input_array;
			
		}
		for(int i=0;i<num_of_test_cases;i++){
			
			//System.out.println(Arrays.toString(global_input_array[i]));
			s.printStarSuperStar(global_input_array[i]);
		}
		
		
		
	}
	
	
}
