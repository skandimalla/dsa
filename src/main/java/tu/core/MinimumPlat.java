package tu.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MinimumPlat {
	
	
	public void findminPlatforms(List<Train> trainList){
		Collections.sort(trainList,new TraninTime());
		
		List<Train> arrivalTrains=new ArrayList<Train>();
		List<Integer> dept_list=new ArrayList<Integer>();
		arrivalTrains.add(trainList.get(0));
		int result=1;
		int pCount=1;
		for(int i=1;i<trainList.size();i++){
			
			Train obj=trainList.get(i);
			if(obj.getFlag().equals("arrival")){
				result=result+1;
				if(result>pCount){
					pCount=result;
				}
			}
			else{
				result=result-1;
			}
		}
	    System.out.println(pCount);
	}
	public static void main(String[] args){
		
		Scanner stdin=new Scanner(System.in);
		int num_test_cases=stdin.nextInt();
		List<Train> trainList=new ArrayList<Train>();
		
		
		for(int i=0;i<num_test_cases;i++){
			int num_of_trains=stdin.nextInt();
			for(int j=0;j<num_of_trains;j++){
				int arrival_time=stdin.nextInt();
				String arrival_time_str =String.format("%04d", arrival_time);
				Train trainObjarr=new Train(j,arrival_time_str,"arrival");
				trainList.add(trainObjarr);
				int depart_time=stdin.nextInt();
				String depart_time_str=String.format("%04d", depart_time);
				Train trainObjdep=new Train(j,depart_time_str,"daparture");
				trainList.add(trainObjdep);
			}

		}
		 
		MinimumPlat mp=new MinimumPlat();
		Collections.sort(trainList,new TraninTime() );
		for(Train t:trainList){
			System.out.println(t.getTrainId()+"-->"+t.getTime()+"-->"+t.getFlag());
		}
		mp.findminPlatforms(trainList);
	}

}
class Train{
	int trainId;
	String time;
	String flag;
	

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}


	
	public Train(int id,String time,String flag){
		this.trainId=id;
		this.time=time;
		this.flag=flag;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
 	
}
class TraninTime implements Comparator<Train>{

		public int compare(Train o1, Train o2) {
			int o1Time=new Integer(o1.getTime()).intValue();
			int o2Time=new Integer(o2.getTime()).intValue();
			if(o1Time<o2Time){
				return -1;
			}
			else if(o1Time>o2Time){
				return 1;
			}
			else{
				return 0;
			}
		}
 	
 }
 

