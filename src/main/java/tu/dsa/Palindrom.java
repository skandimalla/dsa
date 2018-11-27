package tu.dsa;

import java.util.Arrays;
import java.util.Scanner;




/**
 * @author srao0
 * 
 * Given a number N. our task is to find the closest Palindrome number whose absolute difference with given number is minimum.
 *
 */
public class Palindrom {
	
	public Palindrom(){
	}
	
	private int[] getNumDigits(int inputNum){
		int[] revdigArray=new int[1000];
		
		int numberOfDigits;
		for(int i=1;;i++){
			double divder=Math.pow(10, i);
			int reminder=inputNum%(int)divder;
			int	numd=(int) (reminder/Math.pow(10, i-1));
			revdigArray[i-1]=numd;
			if(reminder==inputNum){
				numberOfDigits= i;
				break;
			}
		}
		int[] digArray=new int[numberOfDigits];
		for(int i=numberOfDigits;i>0;i--){
			digArray[numberOfDigits-i]=revdigArray[i-1];
		}
		return digArray;
		
	}
	public int getPalindrom(int input_num){
		
		int[] arrayPalindrom=getNumDigits(input_num);;
		int numOfDigits=arrayPalindrom.length;
		int middleNumIndex=(numOfDigits%2==0)?numOfDigits/2-1:numOfDigits/2;
		for(int i=0;i<=middleNumIndex;i++){
			arrayPalindrom[numOfDigits-1-i]=arrayPalindrom[i];
		}
		//System.out.println(arrayPalindrom[middleNumIndex]);
		//System.out.println(Arrays.toString(numDigits));
		//System.out.println(Arrays.toString(arrayPalindrom));
		int maxPalNum=0;
		for(int i=0;i<arrayPalindrom.length;i++){
			maxPalNum=(int) (maxPalNum+arrayPalindrom[i]*Math.pow(10, i));
		}
		return maxPalNum;
		
	}
     public int getClosetPalindrom(int input_num){
    	int PalNum=getPalindrom(input_num);
    	if(PalNum>input_num){
        	int minPalNum=input_num-(PalNum-input_num);
        	int newMinPalNum=getPalindrom(minPalNum);
        	if(minPalNum==newMinPalNum){
        			return minPalNum;
        	}
        	return PalNum;
    	}
    	else if(PalNum<input_num){
    		return PalNum;
    	}
    	else{
    		return PalNum;
    	}
    	
    	
    		
    		
    	
  
    	
    }
	
	
	public static void main(String[] args){
		
		Scanner stdin = new Scanner(System.in);
		int[] input_array=new int[1000];
		int num_test_cases = stdin.nextInt();
		for(int i=0;i<num_test_cases;i++){
			int inputNum=stdin.nextInt();
			input_array[i]=inputNum;
		}
		Palindrom p=new Palindrom();
		for(int i=0;i<num_test_cases;i++){
			
			
			int output=p.getClosetPalindrom(input_array[i]);
			System.out.println (output);
			
			
		}
		
	}

}
