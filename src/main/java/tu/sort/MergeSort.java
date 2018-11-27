package tu.sort;

import java.util.Arrays;

public class MergeSort {
	
	
	public void mergeSort(int lower_index,int higher_index,int[] input_array){

		if(!(lower_index<higher_index)){
			return;
		}
		int middle_index=(lower_index+higher_index)/2;
		mergeSort(lower_index,middle_index,input_array);
		mergeSort(middle_index+1,input_array.length-1,input_array);
		partsMerge(lower_index,higher_index,middle_index,input_array);
		
	}
	public void partsMerge(int lower_index,int higher_index,int middle_index,int[] input_array){
		
		int n1 = middle_index - lower_index + 1; 
        int n2 = higher_index - middle_index; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = input_array[lower_index + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = input_array[middle_index + 1+ j]; 
        
     // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = lower_index; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
            	input_array[k] = L[i]; 
                i++; 
            } 
            else
            { 
            	input_array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
        	input_array[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
        	input_array[k] = R[j]; 
            j++; 
            k++; 
        } 
  
		
	}
	
	public static void main(String[] args){
		
		MergeSort m=new MergeSort();
		int[] input_array={3,2,1,5};
		m.mergeSort(0, input_array.length-1, input_array);
		System.out.println(Arrays.toString(input_array));
	}

}
