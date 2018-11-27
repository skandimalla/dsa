package tu.core;

import java.util.Scanner;

public class FindKthChar {
	
	
	
	public void findChar(int m,int k,int n){
		
		
		StringBuffer s_buff=new StringBuffer(); 
		String binary_num = Integer.toBinaryString(m);
		for(int i=0;i<n;i++){
			
			for(int j=0;j<binary_num.length();j++){
				
				if(binary_num.charAt(j)=='1'){
					s_buff.append("10");
				}
				else if(binary_num.charAt(j)=='0'){
					s_buff.append("01");
				}
			}
			
			binary_num = s_buff.toString();
			s_buff.setLength(0);
		}
		//System.out.println(binary_num);
		System.out.println(binary_num.charAt(k));
		
	}
	
	
	public static void main(String[] args){
		
		
		Scanner stdin=new Scanner(System.in);
		FindKthChar fd=new FindKthChar();
		int num_of_test_cases=stdin.nextInt();
		int[][] input_array=new int[num_of_test_cases][3];
		for(int i=0;i<num_of_test_cases;i++){
			
			
			int[] input_ts =new int[3];
			
			int input_num = stdin.nextInt();
			int input_kth_pos = stdin.nextInt();
			int input_iterations = stdin.nextInt();
			input_ts[0] = input_num;
			input_ts[1] = input_kth_pos;
			input_ts[2] = input_iterations;
			input_array[i]=input_ts;
			
		}
		
		for(int i=0;i<num_of_test_cases;i++){
			fd.findChar(input_array[i][0],input_array[i][1],input_array[i][2]);
		}
		
	}

}
