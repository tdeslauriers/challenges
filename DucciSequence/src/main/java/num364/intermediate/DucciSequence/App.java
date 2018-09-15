package num364.intermediate.DucciSequence;

import java.util.ArrayList;
import java.util.List;

import num364.intermediate.DucciSequence.calculation.DucciSequence;
import num364.intermediate.DucciSequence.model.Challenge;

/*
[2018-06-20] Challenge #364 [Intermediate] The Ducci Sequence
Description
A Ducci sequence is a sequence of n-tuples of integers, sometimes known as "the Diffy game", because it is based on sequences. Given an n-tuple of integers (a_1, a_2, ... a_n) the next n-tuple in the sequence is formed by taking the absolute differences of neighboring integers. Ducci sequences are named after Enrico Ducci (1864-1940), the Italian mathematician credited with their discovery.

Some Ducci sequences descend to all zeroes or a repeating sequence. An example is (1,2,1,2,1,0) -> (1,1,1,1,1,1) -> (0,0,0,0,0,0).

Additional information about the Ducci sequence can be found in this writeup from Greg Brockman, a mathematics student.

It's kind of fun to play with the code once you get it working and to try and find sequences that never collapse and repeat. One I found was (2, 4126087, 4126085), it just goes on and on.

It's also kind of fun to plot these in 3 dimensions. Here is an example of the sequence "(129,12,155,772,63,4)" turned into 2 sets of lines (x1, y1, z1, x2, y2, z2).

Input Description
You'll be given an n-tuple, one per line.

Output Description
Your program should emit the number of steps taken to get to either an all 0 tuple or when it enters a stable repeating pattern.
*/
/*
Challenge Input
(1, 5, 7, 9, 9)
(1, 2, 1, 2, 1, 0)
(10, 12, 41, 62, 31, 50)
(10, 12, 41, 62, 31)
*/
public class App {
	
    //recursion feels like the jam on this one.
	
	public static void main( String[] args ){
		
		//test
		Challenge challenge = new Challenge();
//		List<Integer> test = challenge.getCh1();
		ArrayList<List<Integer>> ducciChals = new ArrayList<List<Integer>>();
		ducciChals.add(challenge.getCh1());
		ducciChals.add(challenge.getCh2());
		ducciChals.add(challenge.getCh3());
		ducciChals.add(challenge.getCh4());
		
		for (List<Integer> value: ducciChals) {
			System.out.println(value);
			System.out.println(
					DucciSequence.checkValues(DucciSequence.ducciDiff(value)));
			System.out.println("\n");
		}
    }
}
