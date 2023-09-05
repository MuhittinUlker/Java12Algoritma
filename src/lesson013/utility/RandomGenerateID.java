package lesson013.utility;

import java.util.Random;

public class RandomGenerateID {

	public static String generateID() {
		Random rnd = new Random();
		int id = rnd.nextInt(1000, 10001);
		return Integer.toString(id);
	}
}
