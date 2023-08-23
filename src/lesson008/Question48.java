package lesson008;

import java.util.Arrays;

public class Question48 {

	public static void main(String[] args) {

		// verilen arrayde en büyük ve en küçük değerleri yazdıralım

		String[] array = { "100", "8", "7", "5", "99", "85" };

		System.out.println(Arrays.toString(array) + " dizisinin;");

		int max = Integer.parseInt(array[0]);

		int min = Integer.parseInt(array[array.length - 1]);

		for (int i = 0; i < array.length; i++) {
			if (Integer.parseInt(array[i]) > max) {
				max = Integer.parseInt(array[i]);
			} else if (Integer.parseInt(array[i]) < min) {
				min = Integer.parseInt(array[i]);
			}
		}
		System.out.println("En küçük değeri: " + min + "\nEn büyük değeri: " + max);
	}

}
