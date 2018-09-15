package num365.intermediate.SalesCommission.commCalc;

import java.util.ArrayList;

public class CommissionCalc {
	
	public static ArrayList<Integer>  CommCalc(){
		
		Tables tables = new Tables();
		
		//load costs and expenses arrays
		ArrayList<ArrayList<Integer>> sales = tables.loadSalesTable();
		ArrayList<ArrayList<Integer>> costs = tables.loadExpsenseTable();
		
		//commission rate
		double comm = .062;
		
		//instantiate profit arraylist
		ArrayList<Integer> johnvers = new ArrayList<Integer>();
		ArrayList<Integer> vanston = new ArrayList<Integer>();
		ArrayList<Integer> danbree = new ArrayList<Integer>();
		ArrayList<Integer> vansee = new ArrayList<Integer>(); 
		ArrayList<Integer> mundyke = new ArrayList<Integer>();
		
		ArrayList<Integer> profit = new ArrayList<Integer>();
		
		//casting multiplication to int so that double works out.
		for (int i = 0; i < 4; i++) {
			if (sales.get(0).get(i) - costs.get(0).get(i) > 0) {
				johnvers.add((int) (comm * (sales.get(0).get(i) - costs.get(0).get(i))));
			}
		}
		
		for (int i = 0; i < 4; i++) {
			if (sales.get(1).get(i) - costs.get(1).get(i) > 0) {
				vanston.add((int) (comm * (sales.get(1).get(i) - costs.get(1).get(i))));
			}
		}
		
		for (int i = 0; i < 4; i++) {
			if (sales.get(2).get(i) - costs.get(2).get(i) > 0) {
				danbree.add((int) ( comm * (sales.get(2).get(i) - costs.get(2).get(i))));
			}
		}
		
		for (int i = 0; i < 4; i++) {
			if (sales.get(3).get(i) - costs.get(3).get(i) > 0) {
				vansee.add((int) (comm * (sales.get(3).get(i) - costs.get(3).get(i))));
			}
		}
		
		for (int i = 0; i < 4; i++) {
			if (sales.get(4).get(i) - costs.get(4).get(i) > 0) {
				mundyke.add((int) (comm * (sales.get(4).get(i) - costs.get(4).get(i))));
			}
		}
		
		//sum commissions per product
		Integer sumJohnvers = johnvers.stream().mapToInt(Integer::intValue).sum();
		Integer sumVanston = vanston.stream().mapToInt(Integer::intValue).sum();
		Integer sumDanbree = danbree.stream().mapToInt(Integer::intValue).sum();
		Integer sumVansee = vansee.stream().mapToInt(Integer::intValue).sum();
		Integer sumMundyke = mundyke.stream().mapToInt(Integer::intValue).sum();
		
		//assign total profits for salesperson to profit arraylist
		profit.add(sumJohnvers);
		profit.add(sumVanston);
		profit.add(sumDanbree);
		profit.add(sumVansee);
		profit.add(sumMundyke);
		
		return profit;
	}

}
