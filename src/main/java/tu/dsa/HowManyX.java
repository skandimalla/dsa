package tu.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class HowManyX {
	
	
	public void findXoccurances(int num,int lbound,int ubound){
		int num_of_occurences=0;
		if(lbound==ubound){
			System.out.println(0);
			return;
		}
		for(int i=lbound+1;i<ubound;i++)	{
				num_of_occurences=num_of_occurences+isXexists(num,i);
		}
		System.out.println(num_of_occurences);    
		
		
		
	}
	
	public int isXexists(int num,int bound){
    	if(bound==0)
			return 0;
    	if(bound%10==num)
    		return 1+isXexists(num,bound/10);
    	else
    		return 0+isXexists(num,bound/10);
	}
	
	public static void main(String[] args){
		
		Scanner stdin=new Scanner(System.in);
		int num_test_cases=stdin.nextInt();
		BufferedReader bstdin=new BufferedReader(new InputStreamReader(System.in));
		int[][] total_input_array=new int[100][10];
		HowManyX x=new HowManyX();
		for(int i=0;i<num_test_cases;i++){
			int[] input_array=new int[3];
			input_array[0]=stdin.nextInt();
			stdin.nextLine();
			String[] l_o_bound=stdin.nextLine().split(" ");
			input_array[1]=new Integer(l_o_bound[0]).intValue();
			input_array[2]=new Integer(l_o_bound[1]).intValue();
			total_input_array[i]=input_array;
          //System.out.println(Arrays.toString(input_array));
		}
		for(int i=0;i<num_test_cases;i++){
			x.findXoccurances(total_input_array[i][0], total_input_array[i][1], total_input_array[i][2]);
		}
	}

}
