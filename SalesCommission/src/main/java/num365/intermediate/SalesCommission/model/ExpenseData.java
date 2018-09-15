package num365.intermediate.SalesCommission.model;

import java.util.ArrayList;
import java.util.Arrays;

public class ExpenseData {

	private ArrayList<ArrayList<Integer>> expense = new ArrayList<ArrayList<Integer>>();
	
	private ArrayList<Integer> johnverExp = new ArrayList<Integer>(
			Arrays.asList(new Integer[] {120, 300, 50, 67}));
	
	private ArrayList<Integer> vanstonExp = new ArrayList<Integer>(
			Arrays.asList(new Integer[] {65, 10, 299, 254}));
	
	private ArrayList<Integer> danbreeExp = new ArrayList<Integer>(
			Arrays.asList(new Integer[] {890, 23, 1290, 89}));
	
	private ArrayList<Integer> vanseeExp = new ArrayList<Integer>(
			Arrays.asList(new Integer[] {54, 802, 12, 129}));
	
	private ArrayList<Integer> mundykeExp = new ArrayList<Integer>(
			Arrays.asList(new Integer[] {430, 235, 145, 76}));

	//getters and setters
	public ArrayList<ArrayList<Integer>> getExpense() {
		return expense;
	}

	public ArrayList<Integer> getJohnverExp() {
		return johnverExp;
	}

	public ArrayList<Integer> getVanstonExp() {
		return vanstonExp;
	}

	public ArrayList<Integer> getDanbreeExp() {
		return danbreeExp;
	}

	public ArrayList<Integer> getVanseeExp() {
		return vanseeExp;
	}

	public ArrayList<Integer> getMundykeExp() {
		return mundykeExp;
	}
	
}
