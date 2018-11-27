package tu.core;

import java.util.Scanner;

public class NonrepeatedChar {
	
	
	public void getFirstNonRepeat(String input_string){
		
		char[] input_array=input_string.toCharArray();
		int count=0;
		 for(int i=0;i<input_array.length;i++){
			 boolean has_occured=false;
			 for(int j=0;j<input_array.length;j++){
				 if(i!=j){
					 if(input_array[i]==input_array[j]){
						 has_occured=true;
						 count=count+1;
						 break;
					 }
				 }
					
			 }
			if(!has_occured){

				System.out.println(input_array[i]);
				return;
					 
			}
		 }
		 if(count>0){
			 System.out.println(-1);
		 }
		
		 
		
	}
	

	
	public static void main(String[] args){
		
		
	  Scanner stdin=new Scanner(System.in);
	  NonrepeatedChar nrc=new NonrepeatedChar();
	  String[] input_string_array=new String[100];
	  int num_test_Cases=stdin.nextInt();
	  for(int i=0;i<num_test_Cases;i++){
		  int str_size=stdin.nextInt();
		  String input_string=stdin.next().substring(0,str_size);
		  input_string_array[i]=input_string;
	  }
	   
	  for(int i=0;i<num_test_Cases;i++){
        nrc.getFirstNonRepeat(input_string_array[i]) ;
	  }
	}
}
