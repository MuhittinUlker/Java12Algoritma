package lesson002;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {

		// Dairenin çevresini ve alanını hesaplama

		Scanner scanner = new Scanner(System.in);

		double yariCap, cevre, alan;

		System.out.println("Yarıçap giriniz:");
		yariCap = scanner.nextInt();

		if (yariCap < 0) {
			System.out.println("Lütfen pozitif bir sayı giriniz.");
		} else {
			alan = Math.PI * yariCap * yariCap;
			cevre = Math.PI * 2 * yariCap;

			System.out.println("Dairenin Alanı: " + alan + "\n" + "Çevresi: " + cevre);
		}

	}

}
