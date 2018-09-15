package num365.intermediate.SalesCommission;

import java.util.ArrayList;

import num365.intermediate.SalesCommission.commCalc.CommissionCalc;

/*
[2018-07-11] Challenge #365 [Intermediate] Sales Commissions
Description
You're a regional manager for an office beverage sales company, and right now you're in charge of paying your sales team they're monthly commissions.

Sales people get paid using the following formula for the total commission: commission is 6.2% of profit, with no commission for any product to total less than zero.

Input Description
You'll be given two matrices showing the sales figure per salesperson for each product they sold, and the expenses by product per salesperson. Example:

Challenge Input
Revenue

            Johnver Vanston Danbree Vansey  Mundyke
Tea             190     140    1926     14      143
Coffee          325      19     293   1491      162
Water           682      14     852     56      659
Milk            829     140     609    120       87

Expenses

            Johnver Vanston Danbree Vansey  Mundyke
Tea             120      65     890     54      430
Coffee          300      10      23    802      235
Water            50     299    1290     12      145
Milk             67     254      89    129       76
Challenge Output
            Johnver Vanston Danbree Vansey  Mundyke
Commission       92       5     113     45       32
*/



public class App {
	
    public static void main( String[] args ){
        
    	ArrayList<Integer> profit = CommissionCalc.CommCalc();
    	
    	System.out.println("Johnvers Total Commission: $" + profit.get(0));
    	System.out.println("Vanston Total Commission: $" + profit.get(1));
    	System.out.println("Danbree Total Commission: $" + profit.get(2));
    	System.out.println("Vansee Total Commission: $" + profit.get(3));
    	System.out.println("Mundyke Total Commission: $" + profit.get(4));
    	
    }
}
