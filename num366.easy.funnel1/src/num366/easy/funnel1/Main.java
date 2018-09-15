package num366.easy.funnel1;

/*
Challenge
Given two strings of letters, determine whether the second can be made from the first by removing one letter. The remaining letters must stay in the same order.

Examples
funnel("leave", "eave") => true
funnel("reset", "rest") => true
funnel("dragoon", "dragon") => true
funnel("eave", "leave") => false
funnel("sleet", "lets") => false
funnel("skiff", "ski") => false
*/

public class Main {

	public static void main(String[] args) {
		
		System.out.println(funnelOne("diane", "tom"));

	}
	
	private static boolean funnelOne(String word1, String word2) {
		
			
		
		for (int i = 0; i < word1.length(); i++) {
			StringBuilder sb0 = new StringBuilder(word1);
			if (new String(sb0.deleteCharAt(i)).equals(word2)) {
				return true;
			}
		}	
		return false;
	}

}
