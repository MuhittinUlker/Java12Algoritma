package lesson015;

import java.util.Scanner;

public class Utility {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static String getStringValue(String message) {
		System.out.print(message);
		String stringDeger = scanner.nextLine();
		return stringDeger;
	}
	
	public static double getDoubleValue(String message) {
		System.out.print(message);
		double doubleDeger = scanner.nextDouble();scanner.nextLine();
		return doubleDeger;
	}
	
	public static int getIntValue(String message) {
		System.out.print(message);
		int intDeger = scanner.nextInt();scanner.nextLine();
		return intDeger;
	}
	
}
