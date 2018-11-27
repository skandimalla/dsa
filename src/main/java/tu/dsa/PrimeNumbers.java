package tu.dsa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbers {
	
	
	public void printPrime(int start,int end){
		int[] pn=new int[100000];
		for(int i=start;i<=end;i++){
			boolean isPrime=true;
			if(i!=1){
				
				for( int j=2;j<=Math.sqrt(i);j++){
					if((i!=j)&&(i%j==0)){
						isPrime=false;
						break;
					}
				}
				if(isPrime){
					System.out.print(String.format("%d ", i));
				}
			}
			
		}
		System.out.println("");
		
	}
	
	public static void main(String[] args){
		PrimeNumbers mp=new PrimeNumbers();
		
		Scanner stdin=new Scanner(System.in);
		int num_test_cases=stdin.nextInt();
		stdin.nextLine();
		int[][] total_input_array=new int[100][10];
		for(int i=0;i<num_test_cases;i++){
			int[] input_array=new int[2];
				String[] l_o_bound=stdin.nextLine().split(" ");
				//System.out.println(l_o_bound);
				input_array[0]=new Integer(l_o_bound[0]).intValue();
				input_array[1]=new Integer(l_o_bound[1]).intValue();
			total_input_array[i]=input_array;
          //System.out.println(Arrays.toString(input_array));
		}
		for(int i=0;i<num_test_cases;i++){
			//System.out.println(Arrays.toString(total_input_array[i]));
			mp.printPrime(total_input_array[i][0], total_input_array[i][1]);
		}

	}

}
