package num361.easy.tally.service;

import num361.easy.tally.model.Players;

public class ScoreCalc {

	public static Players finalScore(String score) {
		

		
		Players players = new Players();
		String[] letters = score.split("");
		
		for (String i : letters) {
			
			char j = i.charAt(0);
			String check = i;
			Names names = Names.valueOf(check.toLowerCase());
			
			switch(names) {
				case a:
					if (Character.isUpperCase(j)==true) {
						players.setA(players.getA()-1);
					} else {
						players.setA(players.getA()+1);
					}
					break;
				case b:
					if (Character.isUpperCase(j)==true) {
						players.setB(players.getB()-1);
					} else {
						players.setB(players.getB()+1);
					}
					break;
				case c:
					if (Character.isUpperCase(j)==true) {
						players.setC(players.getC()-1);
					} else {
						players.setC(players.getC()+1);
					}
					break;
				case d:
					if (Character.isUpperCase(j)==true) {
						players.setD(players.getD()-1);
					} else {
						players.setD(players.getD()+1);
					}
					break;
				case e:
					if (Character.isUpperCase(j)==true) {
						players.setE(players.getE()-1);
					} else {
						players.setE(players.getE()+1);
					}
					break;
				default:
					System.out.println("Not a listed player");
			}
		}
		return players;
	}
	
}
