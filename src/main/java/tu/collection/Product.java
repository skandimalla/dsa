package tu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Product implements Comparable<Product> {
	
	private String name;
	private int qty;
	public Product(String name,int qty){
		this.name=name;
		this.qty=qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Product o) {
		return this.qty-o.qty;

	}

	public static Comparator<Product> prdocutComparator =new Comparator<Product>(){
		
		public int compare(Product o1, Product o2) {
			// TODO Auto-generated method stub
			String pName1=o1.getName();
			String pName2=o2.getName();
			return pName1.compareTo(pName2);
		}
		
	};
	public static void main(String[] args){
		Product[] pArray=new Product[3];
		pArray[0]=new Product("test1",20);
		pArray[1]=new Product("test2",5);
		pArray[2]=new Product("test2",35);
		System.out.println("sotring data");
		Arrays.sort(pArray,prdocutComparator);
		for(int i=0;i<pArray.length;i++){
			System.out.println(pArray[i].getName());
			
		}
		
	}
	
}	