package tu.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class primeNumberSetBita {
	
	
	public void totalSetBits(int[] input_array){
		
		int g_total_set_bits=0;
		int ln=input_array[0];
		int rn=input_array[1];
		for(int k=ln;k<=rn;k++){
			int l_taotal_set_bits=0;
			int n=k;
			while(n>=2){
				
				if(n%2==1){
					l_taotal_set_bits=l_taotal_set_bits+1;
				}
				else{
					l_taotal_set_bits=l_taotal_set_bits+0;
				}
				n=n/2;
				if(n==1){
					l_taotal_set_bits=l_taotal_set_bits+1;
				}
				
			}
			boolean is_prime=true;
			for(int i=2;i<=l_taotal_set_bits/2;i++){
				
				if(l_taotal_set_bits%i==0){
					is_prime=false;
					break;
				}
			}
			if(l_taotal_set_bits>1&&is_prime){
				g_total_set_bits=g_total_set_bits+1;
			}

			
			
		}
		System.out.println(g_total_set_bits);
		
		
	}
	
	
	public static void main(String[] args){
		
		Scanner stdin=new Scanner(System.in);
		int num_test_cases=stdin.nextInt();
		int[][] g_input=new int[num_test_cases][100000];
		primeNumberSetBita pn=new primeNumberSetBita();
		for(int i=0;i<num_test_cases;i++){
			int ln=stdin.nextInt();
			int rl=stdin.nextInt();
			int[] input_array=new int[2];
			input_array[0]=ln;
			input_array[1]=rl;
			g_input[i]=input_array;
		}
		for(int i=0;i<num_test_cases;i++){
			//System.out.println(Arrays.toString(g_input[i]));
			pn.totalSetBits(g_input[i]);
		}
		
		
	}

}
