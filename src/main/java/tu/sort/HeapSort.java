package tu.sort;

import java.util.Arrays;

public class HeapSort {
	
	
	public void sort(int index,int n,int[] input){
		
		 
		    int Lindex=2*index+1;
		    int Rindex=2*index+2;
		    
		    int largest=index;
		    if(Lindex<=n&&input[Lindex]>input[largest]){
		    	largest=Lindex;
		    }
		    if(Rindex<=n&&input[Rindex]>input[largest]){
		    	largest=Rindex;
		    }
		    if(largest!=index){
		    	
		    	int tmp=input[index];
		    	input[index]=input[largest];
		    	input[largest]=tmp;
		    }
		
	}
	

	
	public static void main(String[] args){
		int[] input={4,5,3,2,1,7,8};
		System.out.println(Arrays.toString(input));
		HeapSort hp=new HeapSort();
		for(int n=input.length-1;n>=0;n--){
			
			for(int i=input.length/2-1;i>=0;i--){
				hp.sort(i,n, input);
				
			}
			int tmp=input[0];
			input[0]=input[n];
			input[n]=tmp;
			System.out.println(Arrays.toString(input));
		}
		
	
		
		
	}

}
