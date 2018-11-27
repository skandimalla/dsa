package tu.innerclass;

public class MyInnerClass {
	
		int[] input_array=new int[10];
		public  MyInnerClass(int[] array){
			input_array=array;
		}
		
		
		interface MyInnerClassIterator extends java.util.Iterator<Integer> { }
		
		private class EvenIterator implements MyInnerClassIterator{
			
		   private int next_index=0;
			public boolean hasNext(){
			   if(next_index<input_array.length-1){
					return true;
				}
			   return false;
			}
			public Integer next(){
				Integer intObj=new Integer(input_array[next_index]);
				next_index=next_index+2;
				return intObj;
				
			}
			
		

		}
		
		public  void pritnData(){
			MyInnerClassIterator myIterator = this.new EvenIterator();
			
			while(myIterator.hasNext()){
				
				System.out.println(myIterator.next());
				
			}
		}
		
		public static void main(String[] args){
			
			int[] input_arry={1,23,4,5,6,7};
			
			MyInnerClass inn=new MyInnerClass(input_arry);
			inn.pritnData();
			
		}
}
