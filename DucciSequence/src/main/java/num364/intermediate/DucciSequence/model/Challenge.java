package num364.intermediate.DucciSequence.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge {
	
	//challenge data sets
	//only getters needed for challenge 
	//constructors and setters made for fun
    private List<Integer> ch1 = new ArrayList<Integer>(
    		Arrays.asList(1, 9, 78 ,9));
     
    private List<Integer> ch2 = new ArrayList<Integer>(
     		Arrays.asList(1, 2, 1, 2, 1, 0));
     
    private List<Integer> ch3 = new ArrayList<Integer>(
      		Arrays.asList(10, 12, 41, 62, 31, 50, 300));
     
    private List<Integer> ch4 = new ArrayList<Integer>(
       		Arrays.asList(10, 12, 41, 62, 31));
    
    //constructors
	public Challenge() {
	}
    
    public Challenge(List<Integer> ch1, List<Integer> ch2, 
    		List<Integer> ch3, List<Integer> ch4) {
		this.ch1 = ch1;
		this.ch2 = ch2;
		this.ch3 = ch3;
		this.ch4 = ch4;
	}

	//getters
	public List<Integer> getCh1() {
		return ch1;
	}

	public List<Integer> getCh2() {
		return ch2;
	}

	public List<Integer> getCh3() {
		return ch3;
	}

	public List<Integer> getCh4() {
		return ch4;
	}

	//setters
	public void setCh1(List<Integer> ch1) {
		this.ch1 = ch1;
	}

	public void setCh2(List<Integer> ch2) {
		this.ch2 = ch2;
	}

	public void setCh3(List<Integer> ch3) {
		this.ch3 = ch3;
	}

	public void setCh4(List<Integer> ch4) {
		this.ch4 = ch4;
	}

}
