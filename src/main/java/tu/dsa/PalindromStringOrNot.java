package tu.dsa;

import java.util.Scanner;

public class PalindromStringOrNot {
	
	
	public void isPalindrome(String input){
		

		int length=input.length();
		int half_legnth=length%2==0?length/2:(length/2)+1;
		boolean ispalindrom=true;
		for(int i=0;i<=half_legnth-1;i++){
			
			char char_left=input.charAt(i);
			char char_right=input.charAt(length-1-i);
			//System.out.println(String.format("%c<->%c",char_left,char_right));
			if(Character.toLowerCase(char_left)!=Character.toLowerCase(char_right)){
				ispalindrom=false;
				break;
			}
			
			
			
		}
		
		if(ispalindrom){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
		
	}
	public void ingoreSpecialChars(String input){
		
		input=input.replaceAll("[^a-zA-Z0-9]+", "");
		System.out.println(input);
		isPalindrome(input);
		
	}
	public static void main(String[] args){
		
		Scanner stdin=new Scanner(System.in);
		int num_of_tests=stdin.nextInt();
		String[] test_input=new String[100000];
		stdin.nextLine();
		for(int i=0;i<num_of_tests;i++){
			
			String input_string=stdin.nextLine();
			test_input[i]=input_string;
		}
		PalindromStringOrNot pd=new PalindromStringOrNot();
		for(int i=0;i<num_of_tests;i++){
			pd.ingoreSpecialChars(test_input[i]);
		}
	}

}
