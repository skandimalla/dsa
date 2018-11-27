package tu.sort;

import java.util.Arrays;

public class QuickSort {
	
	public void quickSort(int lowIndex,int highIndex,int[] input_array){
		
		if(lowIndex<highIndex){
			int pivotIndex=partition(lowIndex,highIndex,input_array);
			quickSort(lowIndex,pivotIndex-1,input_array);
			quickSort(pivotIndex+1,highIndex,input_array);
		}
		
		
	}
	public int partition(int lowIndex,int highIndex,int[] input_array){
		
		
		int pivot=input_array[highIndex];
		int i=lowIndex-1;
		for(int j=lowIndex;j<=highIndex-1;j++){
			
			if(input_array[j]<=pivot){
				
				i++;
				swap(i,j,input_array);
			}
			
		}
		
		swap(i+1,highIndex,input_array);
		return i+1;
		
	}
	private void swap(int i,int j,int[] input_array){
		
		int tmp=input_array[i];
		input_array[i]=input_array[j];
		input_array[j]=tmp;
		
	}
	public static void main(String[] args){
		int[] input_array={70,10, 80, 30, 90, 40, 50, 70};
		QuickSort sort=new QuickSort();
		sort.quickSort(0,input_array.length-1,input_array);
		System.out.println(Arrays.toString(input_array));
	}

}
