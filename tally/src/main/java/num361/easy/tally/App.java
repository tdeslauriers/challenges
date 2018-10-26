package num361.easy.tally;

import java.io.IOException;

import num361.easy.tally.model.Players;
import num361.easy.tally.service.ScoreCalc;
import num361.easy.tally.service.TallyIntake;

/**
 Challenge: 
 5 Friends (let's call them a, b, c, d and e) are playing a game 
 and need to keep track of the scores. Each time someone scores a 
 point, the letter of his name is typed in lowercase. If someone 
 loses a point, the letter of his name is typed in uppercase. 
 Give the resulting score from highest to lowest.
 
Challenge Input
EbAAdbBEaBaaBBdAccbeebaec

*/
public class App 
{
    public static void main( String[] args ) throws IOException{
    	
    	//Errors for null input not handled...
    	String tally = TallyIntake.userInput();
    	    	
	  	//I am able to do the gets off the ScoreCalc because finalScore
    	//method returns Players class instance as an output
    	Players result = ScoreCalc.finalScore(tally);
    	
    	System.out.println(
    			"Albert'  Score: " + result.getA() + "\n" +
    			"Brian's  Score: " + result.getB() + "\n" +
    			"Chris'   Score: " + result.getC() + "\n" +
    			"David's  Score: " + result.getD() + "\n" +
    			"Edward's Score: " + result.getE());
    }
}

