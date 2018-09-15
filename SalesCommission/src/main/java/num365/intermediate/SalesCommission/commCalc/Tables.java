package num365.intermediate.SalesCommission.commCalc;

import java.util.ArrayList;

import num365.intermediate.SalesCommission.model.ExpenseData;
import num365.intermediate.SalesCommission.model.SalesData;


public class Tables {
	
	
	//assign row arrays for sales numbers to 2d matrix
	public ArrayList<ArrayList<Integer>> loadSalesTable() {
		
		//instantiate sales data class
		SalesData data = new SalesData();
		
		//assign matrix array values
		ArrayList<ArrayList<Integer>> salesTally = new ArrayList<ArrayList<Integer>>();
		//had to cast to ArrayList<Integer> because data is List<Integer> type.
		salesTally.add((ArrayList<Integer>) data.getJohnverSales());
		salesTally.add((ArrayList<Integer>) data.getVanstonSales());
		salesTally.add((ArrayList<Integer>) data.getDanbreeSales());
		salesTally.add((ArrayList<Integer>) data.getVanseeSales());
		salesTally.add((ArrayList<Integer>) data.getMundykeSales());
		
		return salesTally;
	}
	
	//assign row arrays for expense numbers to 2d matrix
	public ArrayList<ArrayList<Integer>> loadExpsenseTable(){
		
		//instantiate expense data class
		ExpenseData dataEx = new ExpenseData();
		
		//assign matrix array values
		ArrayList<ArrayList<Integer>> expenseTally = new ArrayList<ArrayList<Integer>>();
		expenseTally.add(dataEx.getJohnverExp());
		expenseTally.add(dataEx.getVanstonExp());
		expenseTally.add(dataEx.getDanbreeExp());
		expenseTally.add(dataEx.getVanseeExp());
		expenseTally.add(dataEx.getMundykeExp());
		
		return expenseTally;
	}
	
}
