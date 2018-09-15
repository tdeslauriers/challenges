package num365.intermediate.SalesCommission.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesData {

	private List<Integer> johnverSales = new ArrayList<Integer>(
			Arrays.asList(190, 325, 682, 829));
	
	private List<Integer> vanstonSales = new ArrayList<Integer>(
			Arrays.asList(new Integer[] {140, 19, 14, 140}));
	
	private List<Integer> danbreeSales = new ArrayList<Integer>(
			Arrays.asList(new Integer[] {1926, 293, 852, 609}));
	
	private List<Integer> vanseeSales = new ArrayList<Integer>(
			Arrays.asList(new Integer[] {14, 1491, 56, 120}));
	
	private List<Integer> mundykeSales = new ArrayList<Integer>(
			Arrays.asList(new Integer[] {143, 162, 659, 87}));;

	//Getters and Setters
	public List<Integer> getJohnverSales() {
		return johnverSales;
	}

	public List<Integer> getVanstonSales() {
		return vanstonSales;
	}

	public List<Integer> getDanbreeSales() {
		return danbreeSales;
	}

	public List<Integer> getVanseeSales() {
		return vanseeSales;
	}

	public List<Integer> getMundykeSales() {
		return mundykeSales;
	}






	
}
