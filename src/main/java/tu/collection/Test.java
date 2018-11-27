package tu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class Test {
	
	public static void main(String[] args){
		
		ArrayList<String> abc = new ArrayList<String>();
		abc.add("test1");
		abc.add("test2");
		for(String a:abc){
			System.out.println(a);
		}
		Iterator<String> iter=abc.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		Enumeration<String> ene=Collections.enumeration(abc);
		while(ene.hasMoreElements()){
			System.out.println(ene.nextElement());
			
		}
	}

}
