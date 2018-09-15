package num364.intermediate.DucciSequence.calculation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DucciSequence {
		
	public static List<Integer> ducciDiff(List<Integer> challenge) {
		
		//new list to hold values
		//initializing with placeholder value data
		List<Integer> listIteration = new ArrayList<Integer>(challenge.size());
		for (int j = 0; j < challenge.size(); j++) {
			listIteration.add(5);
		}
		
		for(int i = 0; i < challenge.size()-1; i++) {
			//use math.min and math.max to get absolute difference
			int bigNum = Math.max(challenge.get(i), challenge.get(i+1));
			int lilNum = Math.min(challenge.get(i), challenge.get(i+1));
			int newNum = bigNum - lilNum;
						
			listIteration.set(i, newNum);
		}
		
		//need to subtract the first value from the last
		int beginEndList0 = Math.max(challenge.get(0), challenge.get(challenge.size()-1));
		int beginEndList1 = Math.min(challenge.get(0), challenge.get(challenge.size()-1));
		int lastIndexValue = beginEndList0 - beginEndList1;
		listIteration.set(challenge.size()-1, lastIndexValue);
		
//		System.out.println(challenge);
//		System.out.println(lastIndexValue);
//		System.out.println(listIteration);
		return listIteration;
	}
	
	public static double listAvg (List<Integer> listToAvg) {
		Integer sum = 0;
		for (Integer val: listToAvg) {
			sum += val;
		}
		return sum.doubleValue()/listToAvg.size();
	}
	
	//not 100% this actually solves the math, don't really care
	public static List<Integer> checkValues(List<Integer> newList) {
		
		//set up comparisons
		Integer listSum = newList.stream().mapToInt(Integer::intValue).sum();

		if (listAvg(newList) <= 2 && Collections.max(newList) < 2) {
			return ducciDiff(newList);
		
		} else if(listSum < newList.size()) {
			return ducciDiff(newList);
			
		} else {
			System.out.println(newList);
			return checkValues(ducciDiff(newList));
		}
	}
}
