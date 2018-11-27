package tu.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ContinuosIntegers {
	
	
	
	public void getLargest(int index,int n,int[] input){
		
		int lIndex=2*index+1;
		int rIndex=2*index+2;
		int largest=index;
		if(lIndex<=n&&input[lIndex]>input[largest]){
			largest=lIndex;
		}
		if(rIndex<=n&&input[rIndex]>input[largest]){
			largest=rIndex;
		}
		if(largest!=index){
			int tmp=input[index];
			input[index]=input[largest];
			input[largest]=tmp;
		}
	}
	
	public void checkContinuous(int[] input){
		
		for(int n=input.length-1;n>=0;n--){
			
			for(int i=input.length/2-1;i>=0;i--){
				getLargest(i,n,input);
			}
			int largest=input[0];
			input[0]=input[n];
			input[n]=largest;
			
				
		}
		boolean isContinueous=true;
        for(int i=0;i+1<input.length;i++){
        	
        	if(input[i+1]-input[i]!=1&&input[i+1]-input[i]!=0){
        		isContinueous=false;
        		break;
        	}
        }
		if(isContinueous){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
	}
	
	
	public static void main(String[] args){
		Scanner stdin=new Scanner(System.in);
		int num_test_cases=stdin.nextInt();
		int[][] garray=new int[num_test_cases][100000];
		ContinuosIntegers ci=new ContinuosIntegers();
		for(int i=0;i<num_test_cases;i++){
			int asize=stdin.nextInt();
			int[] input_array=new int[asize];
			for(int j=0;j<asize;j++){
				input_array[j]=stdin.nextInt();
			}
			garray[i]=input_array;
		}
		for(int i=0;i<num_test_cases;i++){
			//System.out.println(Arrays.toString(garray[i]));
			ci.checkContinuous(garray[i]);
			
		}
		
	}

}
