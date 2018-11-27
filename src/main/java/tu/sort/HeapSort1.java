package tu.sort;

import java.util.Arrays;

public class HeapSort1 {
	
	
	public void heapify(int[] input,int n,int i){
		
		
	    int lIndex=2*i+1;
	    int rIndex=2*i+2;
	    int largest =i;
	    if(lIndex<=n&&input[lIndex]>input[largest])
	    	largest = lIndex;
	    
	    if(rIndex<=n&&input[rIndex]>input[largest])
	    	largest = rIndex;
		
	    if(largest!=i){
	    	
	    	int tmp=input[largest];
	    	input[largest]=input[i];
	    	input[i]=tmp;
	    	
	    }
		
	}
	
	public int[] sort(int[] input){
		
		int n = input.length;
		
		for( int j=n-1;j>=0;j--){
			
			for(int i=n/2-1;i>=0;i--){
				heapify(input,j,i);
				
			}
			
			int tmp=input[0];
			input[0]=input[j];
			input[j]=tmp;
			
		}
		return input;
	}
	
	
	public static void main(String[] args){
		
		HeapSort1 obj=new HeapSort1();
		int[] input={4,5,3,2,1,7,8};
		int[] output=obj.sort(input);
		int input_ele=1;
		output[0]=input_ele;
		
		int[] output1=obj.sort(input);
		System.out.println(Arrays.toString(output1));
	
		
		
		
		
	}

}
