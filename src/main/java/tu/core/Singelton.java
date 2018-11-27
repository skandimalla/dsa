package tu.core;

public class Singelton {
	
	private  static  Singelton st=null;
	
	private Singelton(){
		
	}
	
	public static Singelton getObject(){
		
		if(st==null)
			st= new Singelton();
		return st;
		
	}
	
	public static void main(String[] args){
		Singelton sobj=Singelton.getObject();
		System.out.println(sobj);
		Singelton sobj1=Singelton.getObject();
		System.out.println(sobj1);
		
	}

}
