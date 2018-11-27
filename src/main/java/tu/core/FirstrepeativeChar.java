package tu.core;

import java.util.Scanner;

public class FirstrepeativeChar {
	
	private void pritntFirstRepeativeChar(String str){
		int reapt_index=-1;
		int lowest_i2nd_occurence=-1;
		for(int i=0;i<str.length();i++){
			int f_occur_index=i;
			int l_occur_index=i;
			for(int j=i+1;j<str.length();j++){
				
				if(str.charAt(i)==str.charAt(j)){
					l_occur_index=j;
					break;
				}
			}
			if(l_occur_index>f_occur_index){
				
				if(lowest_i2nd_occurence==-1){
					lowest_i2nd_occurence=l_occur_index;
					reapt_index=i;
				}
				else if(lowest_i2nd_occurence>(l_occur_index)){
					
					lowest_i2nd_occurence=l_occur_index;
					reapt_index=i;
				}
				else if(lowest_i2nd_occurence==(l_occur_index)){
					if(reapt_index>i){
						reapt_index=i;
					}
					
				}
				
			}
		}
		if(reapt_index<0){
			System.out.println(reapt_index);
		}
		else{
			System.out.println(str.charAt(reapt_index));
		}
		

		
	}
	public static void main(String[] args){
		
		
		
		
		
		Scanner stdin=new Scanner(System.in);
		String[] input_array=new String[1000];
		int num_of_test_cases=stdin.nextInt();
		FirstrepeativeChar fir=new FirstrepeativeChar();
		for(int i=0;i<num_of_test_cases;i++){
			String input_String=stdin.next();
			input_array[i]=input_String;
		}
		for(int i=0;i<num_of_test_cases;i++){
			
			fir.pritntFirstRepeativeChar(input_array[i]);
		}
		
	}

}
