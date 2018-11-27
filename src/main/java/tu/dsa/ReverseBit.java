package tu.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseBit {
	
	public void getIntegerBit(int num){
		int[] output=new int[32];
		if(num==0){
			System.out.println(0);
			return;
		}
		int index=0;	
		while(num>0){
			output[index]=num%2;
			num=num/2;
			index++;
		}
		
		System.out.println(Arrays.toString(output));
		printDecimalNum(output);
		
	}
	
	public void printDecimalNum(int[] bitNum){
		long op=0;
		for(int i=0;i<=31;i++){
			
			op=(long) (op+bitNum[i]*((Math.pow(2, 31-i))));
		}
		
		System.out.println(op);
		
	}
	
	
	public static void main(String[] args){
		
		
		
		
		ReverseBit rb=new ReverseBit();
		Scanner stdin=new Scanner(System.in);
		int num_test_cases=stdin.nextInt();
		int[] input_data=new int[num_test_cases];
		for(int i=0;i<num_test_cases;i++){
			input_data[i]=stdin.nextInt();
			
		}
		for(int i=0;i<num_test_cases;i++){
			rb.getIntegerBit(input_data[i]);
			
		}
		
	}

}
