package num361.easy.tally.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TallyIntake {
	
	public static String userInput() throws IOException {
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter score: ");
		String s = bufferedreader.readLine();
		return s;

	}
}

