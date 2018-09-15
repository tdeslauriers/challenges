package num367.easy.subFactorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Challenge: Compute the derangement (subfactorial) of the following:
 * Challenge Input:
	* 6
	* 9
	*14

This is the formula to build: http://oeis.org/wiki/Number_of_derangements

 */

public class App 
{
    public static void main( String[] args ){
    	
    	//String[] test = {"3"};
    	
    	//load args into array
    	List<String> argsStrs = new ArrayList<>();
    	argsStrs = Arrays.asList(args);
    	
    	//load string args into int array
    	List<Integer> argsInts = new ArrayList<>();
    	for (String value: argsStrs) {
    		argsInts.add(Integer.parseInt(value));
    	}
    	
    	//loop through args, running subfactorial equation();
    	for (int value: argsInts) {
    		System.out.println(equation(value));
    	}
    }
    
    //needs a loop function to create the necessary factorial values
    private static int factorial(int num) {
    	int fact = 1;
    	for (int i = 1; i <= num; i ++) {
    		fact*= i;	
    	}
    	return fact;
    }
    
    private static double equation(int subfact) {
    	//need an array to hold values for equation;
    	List<Double> valHolder0 = new ArrayList<Double>();
    	for (int j = 1; j <= subfact; j++) {
    		valHolder0.add((double) factorial(j));
    	}
  	
    	//need another array to hold the values from divisions inside the brackets of equation
    	//needs to account for additions and subtractions by modulo'ing negative sign on odd indexes
    	List<Double> valHolder1 = new ArrayList<Double>();
    	for(int k = 0; k < valHolder0.size(); k++) {
    		if (valHolder0.indexOf(valHolder0.get(k)) % 2 == 0 ||
    					valHolder0.indexOf(valHolder0.get(k)) == 0) {
    			valHolder1.add((-1/valHolder0.get(k)));
    		} else {
    			valHolder1.add((1/valHolder0.get(k)));
    		}
    	}
    	
    	//needs to use the values of valHolder1 to populate the final equation.
    	//psuedo code:
    	//factorial(6) * (1- sum(valHolder1))
    	double eqComponent1 = factorial(subfact);
    	double eqComponent3 = valHolder1.stream().mapToDouble(Double::doubleValue).sum(); 
    	//the sign in parentheses below is OPPOSITE the real equation's
    	//because the negative is assigned to first value of array
    	double result = eqComponent1 * (1 + eqComponent3);
    	return result;
    
    }
 
}
