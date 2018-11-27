package tu.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MaxTip {
	
	public void getMaxTip(int total_orders,OrderTip a,OrderTip b){
		int max_tip=0;
		List<Tip> a_tips=a.tips;
		List<Tip> b_tips=b.tips;
	    if(a.num_orders>=b.num_orders){
	    	Collections.sort(a_tips,new TipComp());
			for(Tip t:a_tips){
				
				System.out.println(String.format("%s->%s",t.index,t.amount));
				
			}
	    }
	    else{
	    	Collections.sort(b_tips,new TipComp());
            for(Tip t:b_tips){
				
				System.out.println(String.format("%s->%s",t.index,t.amount));
				
			}
	    }
	 
	}
	
	
	public static void main(String[] args){
		
		Scanner stdin=new Scanner(System.in);
		int num_test_cases=stdin.nextInt();
		for(int i=0;i<num_test_cases;i++){
			OrderTip a;
			OrderTip b;
			int total_orders=stdin.nextInt();
			int a_orders=stdin.nextInt();
			int b_orders=stdin.nextInt();
			List<Tip> a_tips=new ArrayList<Tip>();
			for(int j=0;j<total_orders;j++){
				int a_tip=stdin.nextInt();
				Tip aTipObj=new Tip(j,a_tip);
				a_tips.add(aTipObj);
			}
			List<Tip> b_tips=new ArrayList<Tip>();
			for(int k=0;k<total_orders;k++){
				int b_tip=stdin.nextInt();
				Tip bTipObj=new Tip(k,b_tip);
				b_tips.add(bTipObj);
			}
			
		
			a =new OrderTip(a_orders,a_tips);
			b =new OrderTip(b_orders,b_tips);
			MaxTip mp=new MaxTip();
			mp.getMaxTip(total_orders, a, b);
		}
	}

}
class OrderTip{
	int num_orders;
	List<Tip> tips;
	public int getNum_orders() {
		return num_orders;
	}
	public void setNum_orders(int num_orders) {
		this.num_orders = num_orders;
	}
	public List<Tip> getTips() {
		return tips;
	}
	public void setTips(List<Tip> tips) {
		this.tips = tips;
	}
	public OrderTip(int num_orders,List<Tip> tips){
		
		this.num_orders=num_orders;
		this.tips=tips;
		
	}
	
}
class Tip{
	int index;
	int amount;
	public Tip(int index,int amount){
		this.index=index;
		this.amount=amount;
		
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
class TipComp implements Comparator<Tip>{

	public int compare(Tip o1, Tip o2) {
		// TODO Auto-generated method stub
		return o1.getAmount()-o2.getAmount();
	}
	
}
