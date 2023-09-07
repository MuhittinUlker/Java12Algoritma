package lesson013.utility;

import java.util.Random;

public class RandomGenerateID {

	public static String generateID() {
		Random rnd = new Random();
		int id = rnd.nextInt(1000, 10000);
		return Integer.toString(id);
	}
	
	public static String generateProductCode(String productName) {
		String productCode = productName.substring(0, 3)+generateID();
		return productCode;
	}
}
